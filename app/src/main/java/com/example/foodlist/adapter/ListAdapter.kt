package com.example.foodlist.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.foodlist.FoodFragment
import com.example.foodlist.MainFragment
import com.example.foodlist.MainFragmentDirections
import com.example.foodlist.Model.Declaration
import com.example.foodlist.R

class ListAdapter(private val context: Context, private val dataSet: List<Declaration>
) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    class ListViewHolder(  val view: View) : RecyclerView.ViewHolder(view) {
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
        holder.name.text = currentItem.name
        holder.price.text = currentItem.price.toString()
        holder.image.setImageResource(currentItem.imageResources)
        holder.button.text = currentItem.details

////        setting the intent
//        holder.button.setOnClickListener {
//             val action = MainFragmentDirections.actionMainFragment3ToFoodFragment2(currentItem.name.toString(), detail = "details", currentItem.imageResources.toString()  )
 //            holder.view.findNavController().navigate(action)
//        }
        holder.button.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToFoodFragment(
                food = currentItem.name,
                details = currentItem.details,
                image = currentItem.imageResources
            )
            holder.view.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}