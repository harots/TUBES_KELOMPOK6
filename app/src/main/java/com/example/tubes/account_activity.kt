package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class account_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account_screen)

        val btninfo = findViewById<TextView>(R.id.account_information)
        val back = findViewById<ImageView>(R.id.account_back)

        btninfo.setOnClickListener {
            val intent = Intent(this, accountinfo_activity::class.java)
            startActivity(intent)
        }

        back.setOnClickListener {
            val intent = Intent(this, profile_activity::class.java)
            startActivity(intent)
        }
    }
}