package com.example.loker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class pengenalan1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pengenalan1)

        val intentButton : Button = findViewById(R.id.button)
        intentButton.setOnClickListener { viewnext1() }
    }

    private fun viewnext1() {
        val intent = Intent(this, pengenalan2::class.java)
        startActivity(intent)
    }
}