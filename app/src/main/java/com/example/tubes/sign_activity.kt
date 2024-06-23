package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class sign_activity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_screen)

        auth = FirebaseAuth.getInstance()

        val btnsignup1 = findViewById<Button>(R.id.btn_signup)
        val btnlogin1 = findViewById<Button>(R.id.login)

        btnsignup1.setOnClickListener {
            val email = findViewById<EditText>(R.id.email_signup).text.toString()
            val password = findViewById<EditText>(R.id.password_signup).text.toString()
            signUp(email, password)
        }

        btnlogin1.setOnClickListener {
            val intent = Intent(this, login_activity::class.java)
            startActivity(intent)
        }
    }

    private fun signUp(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this, home_activity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Sign Up Failed: ${task.exception?.message}", Toast.LENGTH_LONG).show()
                }
            }
    }
}
