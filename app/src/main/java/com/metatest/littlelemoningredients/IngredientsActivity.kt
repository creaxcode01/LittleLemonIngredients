package com.metatest.littlelemoningredients

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class IngredientsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredients)


        val dishName = intent.getStringExtra(EXTRA_DISH_NAME_KEY)

        findViewById<TextView>(R.id.ingredients_list).text =


            when (dishName) {

                "Hamburger" -> "Minced meat \nBun\nTomato"
                "Pasta" -> "Spaghetti\nTomato"
                else -> "Unknown dish"


            }
















    }

                       // un companion object doit être implémenté a la fin d'une classe
    companion object { // début du companion object


        private const val EXTRA_DISH_NAME_KEY = "DishName"

        fun start(context: Context, dishName :String) {

            val intentt = Intent(context,IngredientsActivity::class.java).apply { // context ici est égale au context dans le constructeur juste plus haut
                putExtra(EXTRA_DISH_NAME_KEY, dishName) // dishName du paramètre de la fonction start, deux ligne plus haut
            }

            context.startActivity(intentt)




        }






    } // fin du companion object

}