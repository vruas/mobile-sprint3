package com.example.sprint3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailEditText: EditText = findViewById(R.id.editText_email)
        val passwordEditText: EditText = findViewById(R.id.editText_password)
        val loginButton: Button = findViewById(R.id.btn_login)
        val forgotPasswordButton: Button = findViewById(R.id.btn_forgot_password)

        loginButton.setOnClickListener {
            // Implement login logic and navigate to the next activity
            startActivity(Intent(this, WelcomeActivity::class.java))
        }

        forgotPasswordButton.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }
    }
}
