package com.example.foodlist.data

import com.example.foodlist.Model.Declaration
import com.example.foodlist.R

class SourceOfData {
    fun displayDeclaration(): List<Declaration>{
        return listOf(
            Declaration( R.drawable.shawarma_food,"Shawarma", 1500, "Shawarma is a popular Levantine dish consisting of meat cut into thin slices, stacked in a cone-like shape, and roasted on a slowly-turning vertical rotisserie or spit. Originally made with lamb or mutton, it is now also made of chicken, turkey, beef, or veal.\n"),
            Declaration( R.drawable.french_fries,"French Fries", 1000, "French fries, chips, finger chips, french-fried potatoes, or simply fries, are batonnet or allumette-cut deep-fried potatoes, possibly originating from France. They are prepared by cutting potatoes into even strips, drying them, and frying them, usually in a deep fryer."),
            Declaration( R.drawable.fruit_salad,"Fruit Salad", 100, "Fruit salad is a dish consisting of various kinds of fruit, sometimes served in a liquid, either their own juices or a syrup. In different forms, fruit salad can be served as an appetizer, a side salad. When served as an appetizer, a fruit salad is sometimes known as a fruit cocktail, or fruit cup."),
            Declaration( R.drawable.nigeria_jolly_rice,"Jolly Rice" ,1900, "Jollof, or jollof rice, is a rice dish from Senegal. The dish is typically made with long-grain rice, tomatoes, onions, spices, vegetables and meat in a single pot, although its ingredients and preparation methods vary across different regions."),
            Declaration( R.drawable.sushi,"Sushi", 3800 ,"Sushi is a Japanese dish of prepared vinegared rice, usually with some sugar and salt, accompanied by a variety of ingredients, such as seafood, often raw, and vegetables. Styles of sushi and its presentation vary widely, but the one key ingredient is \"sushi rice\", also referred to as shari, or sumeshi."),
            Declaration( R.drawable.burger,"Hamburger", 1200, "A hamburger is a food consisting of fillings usually a patty of ground meat, typically beef—placed inside a sliced bun or bread roll."),
            Declaration( R.drawable.chicken_fried_rice,"Fried Rice", 2500,"Fried rice is a dish of cooked rice that has been stir-fried in a wok or a frying pan and is usually mixed with other ingredients such as eggs, vegetables, seafood, or meat.")
        )
    }
}