package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class accountinfo_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.accountinfo_screen)

        val back = findViewById<ImageView>(R.id.accountinfo_back)

        back.setOnClickListener {
            val intent = Intent(this, account_activity::class.java)
            startActivity(intent)
        }
    }
}