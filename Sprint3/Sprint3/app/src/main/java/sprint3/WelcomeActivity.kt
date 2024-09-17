package com.example.sprint3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val clientButton: Button = findViewById(R.id.btn_client)
        val companyButton: Button = findViewById(R.id.btn_company)

        clientButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        companyButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
