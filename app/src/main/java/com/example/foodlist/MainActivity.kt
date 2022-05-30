package com.example.foodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.foodlist.adapter.ListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private val myDataset = com.example.foodlist.data.SourceOfData().displayDeclaration()
    private var isGridLayoutManager = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        recyclerView.adapter = ListAdapter(this, myDataset)
//        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView = findViewById<RecyclerView>(R.id.recreate_item)
        layoutChoice()

    }
    private fun layoutChoice(){
        if(isGridLayoutManager){
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        }else {
            recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        }
        recyclerView.adapter = ListAdapter(this, myDataset)

        }
    private fun setIcon(menuItem: MenuItem?){
        if(menuItem == null) return
        menuItem.icon =
            if (isGridLayoutManager)
                ContextCompat.getDrawable(this, R.drawable.ic_grid_icon)
            else ContextCompat.getDrawable(this, R.drawable.ic_staggered_icon)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout_menu, menu)

        val layoutButton = menu?.findItem(R.id.action_switch_layout)
        setIcon(layoutButton)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){R.id.action_switch_layout -> {
            isGridLayoutManager = !isGridLayoutManager
            layoutChoice()
            setIcon(item)

            return true
        }
            else -> super.onOptionsItemSelected(item)
        }
    }

}