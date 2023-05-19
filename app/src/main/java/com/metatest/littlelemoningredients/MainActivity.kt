package com.metatest.littlelemoningredients

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // body of OnCreate function

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.main_dish_1).setOnClickListener {
            IngredientsActivity.start(this,"Hamburger") // méthode statique implémenter dans le companion Object de la classe Ingredients Activity

        }

        findViewById<View>(R.id.main_dish_2).setOnClickListener {
            IngredientsActivity.start(this,"Pasta")

        }











    }


}