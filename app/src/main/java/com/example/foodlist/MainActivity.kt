package com.example.foodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodlist.adapter.ListAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = com.example.foodlist.data.SourceOfData().displayDeclaration()
        val recyclerView = findViewById<RecyclerView>(R.id.recreate_item)

        recyclerView.adapter = ListAdapter(this, myDataset)
        recyclerView.setLayoutManager( LinearLayoutManager(this));
    }
}