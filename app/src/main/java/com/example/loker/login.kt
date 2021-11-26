package com.example.loker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val intentTextView : TextView = findViewById(R.id.signup)
        intentTextView.setOnClickListener{viewsignup()}

        val intenButton : Button = findViewById(R.id.buttonlogin)
        intenButton.setOnClickListener{viewlogin()}
    }

    private fun viewlogin() {
       val intent = Intent(this, dashboard::class.java)
        startActivity(intent)
    }

    private fun viewsignup() {
        val intent = Intent(this, signup::class.java)
        startActivity(intent)
    }
}