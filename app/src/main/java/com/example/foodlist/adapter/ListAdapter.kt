package com.example.foodlist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodlist.Model.Declaration
import com.example.foodlist.R

class ListAdapter(private val context: Context, private val dataSet: List<Declaration>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    class ListViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name_of_food)
        val price: TextView = view.findViewById(R.id.price)
        val image: ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val adapterLayout = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ListViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val currentItem = dataSet[position]
        holder.name.text = context.resources.getString(currentItem.stringResources1)
        holder.price.text = context.resources.getString(currentItem.stringResources2)
        holder.image.setImageResource(currentItem.imageResources)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}