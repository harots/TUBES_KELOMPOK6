package com.example.tubes

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class home_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        val imgrecipe1 = findViewById<ImageView>(R.id.food_recipe1)
        val imgrecipe2 = findViewById<ImageView>(R.id.food_recipe2)
        val imgrecipe3 = findViewById<ImageView>(R.id.food_recipe3)

        imgrecipe1.setOnClickListener {
            val intent = Intent(this, recipe_activity::class.java)
            startActivity(intent)
        }
        imgrecipe2.setOnClickListener {
            val intent = Intent(this, recipe_activity::class.java)
            startActivity(intent)
        }
        imgrecipe3.setOnClickListener {
            val intent = Intent(this, recipe_activity::class.java)
            startActivity(intent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.home
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.home -> {
                    return@setOnItemSelectedListener true
                }
                R.id.love -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            like_activity::class.java
                        )
                    )
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.search -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            home_activity::class.java
                        )
                    )
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.profile -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            profile_activity::class.java
                        )
                    )
                    finish()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}