package com.example.tamagotchiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


            class MainActivity : AppCompatActivity() {
                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    setContentView(R.layout.activity_main)

                    //By using this command below we iniatiating the button to click and move to the second activity or screen
                    val startButton = findViewById<Button>(R.id.startButton)
                    startButton.setOnClickListener {
                        startActivity(Intent(this, MainActivity::class.java))

                    }
    }
}