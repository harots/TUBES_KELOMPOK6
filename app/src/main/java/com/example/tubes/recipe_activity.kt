package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class recipe_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_screen)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.home
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            home_activity::class.java
                        )
                    )
                    return@setOnItemSelectedListener true
                }
                R.id.love -> {
                    Toast.makeText(this, "Love is Clicked", Toast.LENGTH_LONG).show()
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.search -> {
                    Toast.makeText(this, "Search is Clicked", Toast.LENGTH_LONG).show()
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