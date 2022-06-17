package com.example.foodlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.foodlist.databinding.FragmentFoodBinding
import kotlin.properties.Delegates

class FoodFragment : Fragment(R.layout.fragment_food) {
    companion object {
        const val NAME = "food"
        const val IMAGE = "image"
        const val DETAILS = "details"
    }
    private var _binding:FragmentFoodBinding?  = null
    private val binding get() = _binding!!

    private lateinit var nameId: String
    private lateinit var detailId: String
    private var imageId by Delegates.notNull<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments.let {
            nameId = it?.getString(NAME, R.drawable.shawarma_food.toString()).toString()
            detailId = it?.getString(DETAILS).toString()
                imageId = it!!.getInt(IMAGE, R.drawable.shawarma_food)

       }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFoodBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            nameOfTheFood.text = nameId
            foodDetailImage.setImageResource(imageId)
            foodDetails.text = detailId
        }

//        val name = activity?.intent?.getStringExtra(NAME)
//        val imageRes = activity?.intent?.getIntExtra(IMAGE, R.drawable.shawarma_food)
//        val detailsRes = activity?.intent?.getIntExtra(DETAILS, R.string.shawarma_detail)

//
//
//        binding.nameOfTheFood.apply {
//            setText(name)
//        }
//
//        binding.foodDetails.apply {
//            setText(detailsRes!!)
//        }

    }

}