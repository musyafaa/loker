package com.example.loker

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val intentTextView : TextView = findViewById(R.id.forlogin)
        intentTextView.setOnClickListener{viewlogin()}

    }

    private fun viewlogin() {
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }
}