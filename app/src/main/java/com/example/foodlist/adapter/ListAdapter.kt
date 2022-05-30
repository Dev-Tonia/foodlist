package com.example.foodlist.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodlist.FoodActivity
import com.example.foodlist.Model.Declaration
import com.example.foodlist.R

class ListAdapter(private val context: Context, private val dataSet: List<Declaration>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    class ListViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name_of_food)
        val price: TextView = view.findViewById(R.id.price)
        val image: ImageView = view.findViewById(R.id.imageView)
        val button : Button = view.findViewById(R.id.descButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val adapterLayout = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ListViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val currentItem = dataSet[position]
        holder.name.text = context.resources.getString(currentItem.name)
        holder.price.text = context.resources.getString(currentItem.price)
        holder.image.setImageResource(currentItem.imageResources)
        holder.button.text
//        val details: Int = currentItem.details
//        setting the intent
        holder.button.setOnClickListener {
            val context = holder.view.context
            val intent = Intent(context, FoodActivity::class.java)
            intent.putExtra(FoodActivity.NAME, currentItem.name)
            intent.putExtra(FoodActivity.IMAGE, currentItem.imageResources)
            intent.putExtra(FoodActivity.DETAILS, currentItem.details)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}