package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class login_activity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        auth = FirebaseAuth.getInstance()

        val btnlogin = findViewById<Button>(R.id.btn_login)
        val btnsignup = findViewById<Button>(R.id.sign_up)

        btnlogin.setOnClickListener {
            val email = findViewById<EditText>(R.id.email_login).text.toString()
            val password = findViewById<EditText>(R.id.password_login).text.toString()
            logIn(email, password)
        }

        btnsignup.setOnClickListener {
            val intent = Intent(this, sign_activity::class.java)
            startActivity(intent)
        }
    }

    private fun logIn(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this, home_activity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Login Failed: ${task.exception?.message}", Toast.LENGTH_LONG).show()
                }
            }
    }
}
