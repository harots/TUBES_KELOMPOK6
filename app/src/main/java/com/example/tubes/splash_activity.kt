package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class splash_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val btnstart = findViewById<Button>(R.id.btn_start)

        btnstart.setOnClickListener {
            val intent = Intent(this, sign_activity::class.java)
            startActivity(intent)
        }
    }
}