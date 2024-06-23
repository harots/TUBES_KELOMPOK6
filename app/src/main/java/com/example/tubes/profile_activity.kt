package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class profile_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_screen)

        val btnaccount = findViewById<Button>(R.id.edit_profile_button)

        btnaccount.setOnClickListener {
            val intent = Intent(this, account_activity::class.java)
            startActivity(intent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.profile
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.profile -> {
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
            }
            false
        }
    }
}