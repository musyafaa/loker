package com.example.loker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class pengenalan3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan3)

        val intentButton : Button = findViewById(R.id.button3)
        intentButton.setOnClickListener{view3()}
    }

    private fun view3() {
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }
}