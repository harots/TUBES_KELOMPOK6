package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class like_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.like_screen)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.love
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            home_activity::class.java
                        )
                    )
                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.love -> {
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