package com.example.foodlist

import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.foodlist.adapter.ListAdapter
import com.example.foodlist.databinding.FragmentMainBinding


class MainFragment : Fragment( R.layout.fragment_main) {
    private lateinit var recyclerView: RecyclerView
    var myDataset = com.example.foodlist.data.SourceOfData().displayDeclaration()
    private lateinit var navCon: NavController
    private var isGridLayoutManager = true
    private var _binding: FragmentMainBinding? = null
private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         _binding = FragmentMainBinding.inflate(inflater, container, false)
          navCon = NavHostFragment.findNavController(this)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = binding!!.recreateItem
        layoutChoice()
    }
        private fun layoutChoice(){
            if(isGridLayoutManager){
                recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
            }else {
                recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

            }
            recyclerView.adapter = ListAdapter(requireContext(), myDataset)

        }
        private fun setIcon(menuItem: MenuItem?){
            if(menuItem == null) return
            menuItem.icon =
                if (isGridLayoutManager)
                    ContextCompat.getDrawable(requireContext(), R.drawable.ic_grid_icon)
                else ContextCompat.getDrawable(requireContext(), R.drawable.ic_staggered_icon)
        }

        override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
            inflater.inflate(R.menu.layout_menu, menu)

            val layoutButton = menu.findItem(R.id.action_switch_layout)
            setIcon(layoutButton)
        }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
