package com.example.AppLayoutTraining.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.AppLayoutTraining.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signUpButton = findViewById<Button>(R.id.signUp)
        val loginButton = findViewById<Button>(R.id.login)

        signUpButton.setOnClickListener { goToSignUp() }

        loginButton.setOnClickListener { goToLogin() }
    }

    private fun goToSignUp() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

    private fun goToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}