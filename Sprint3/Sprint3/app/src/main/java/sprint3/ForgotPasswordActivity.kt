package com.example.sprint3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val emailEditText: EditText = findViewById(R.id.editText_email)
        val resetButton: Button = findViewById(R.id.btn_reset)

        resetButton.setOnClickListener {
            // Implement password reset logic
        }
    }
}
