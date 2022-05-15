package com.example.foodlist.data

import com.example.foodlist.Model.Declaration
import com.example.foodlist.R

class SourceOfData {
    fun displayDeclaration(): List<Declaration>{
        return listOf(
            Declaration( R.drawable.shawarma_food, R.string.shawarma, R.string.price_shawarma,),
            Declaration( R.drawable.french_fries, R.string.french_fries, R.string.price_french_fries),
            Declaration(R.drawable.chicken_fried_rice,R.string.fried_rice, R.string.price_fried_rice),
            Declaration(R.drawable.nigeria_jolly_rice,R.string.jolly_rice, R.string.price_jolly_rice),
            Declaration(R.drawable.fruit_salad,R.string.fruit_salad, R.string.price_fruit_salad),
            Declaration(R.drawable.sushi,R.string.sushi, R.string.price_sushi),
            Declaration(R.drawable.burger,R.string.hamburger, R.string.price_hamburger),
            )
    }
}