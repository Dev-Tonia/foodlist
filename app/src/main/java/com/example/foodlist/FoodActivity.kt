package com.example.foodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FoodActivity : AppCompatActivity() {
    companion object {
        const val NAME = "name"
        const val IMAGE = "image"
        const val DETAILS = "details"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val name = intent.getStringExtra(NAME)
        val imageRes = intent.getIntExtra(IMAGE, R.drawable.shawarma_food)
        val detailsRes = intent.getIntExtra(DETAILS, R.string.shawarma_detail)

         findViewById<ImageView>(R.id.food_detail_image).apply {
            setImageResource(imageRes)
        }

         findViewById<TextView>(R.id.name_of_the_food).apply {
            text = name
        }

        findViewById<TextView>(R.id.food_details).apply {
            setText(detailsRes)
        }
    }
}