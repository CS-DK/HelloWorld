package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("Hello World","Button Clicked!")
            Toast.makeText(this, "Hey!", Toast.LENGTH_SHORT).show()
        }
    }
}