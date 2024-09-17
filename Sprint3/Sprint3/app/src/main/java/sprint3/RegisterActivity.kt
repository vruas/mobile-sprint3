package com.example.sprint3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nameEditText: EditText = findViewById(R.id.editText_name)
        val emailEditText: EditText = findViewById(R.id.editText_email)
        val passwordEditText: EditText = findViewById(R.id.editText_password)
        val registerButton: Button = findViewById(R.id.btn_register)
        val cancelButton: Button = findViewById(R.id.btn_cancel)

        registerButton.setOnClickListener {
            // Implement registration logic and navigate back to LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
        }

        cancelButton.setOnClickListener {
            finish() // Close the activity and return to the previous screen
        }
    }
}
