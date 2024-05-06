package com.example.tamagotchiapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class GameActivity : AppCompatActivity() {

    //We are using this command to initialize variables.
    private lateinit var petImageView: ImageView
    private lateinit var healthTextView: TextView
    private lateinit var hungerTextView: TextView
    private lateinit var cleanlinessTextView: TextView

    private var health = 100
    private var hunger = 0
    private var cleanliness = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //We are declaring the variables
        petImageView = findViewById(R.id.petImageView)
        healthTextView = findViewById(R.id.healthTextView)
        hungerTextView = findViewById(R.id.hungerTextView)
        cleanlinessTextView = findViewById(R.id.cleanlinessTextView)
    }

    fun onFeedClicked(view: android.view.View) {
        petImageView.setImageResource(R.drawable.dogfed)
        // The steps below will determine how the values are changed.
        health += 10
        if (health > 100) health = 100
        hunger -= 20
        if (hunger < 0) hunger = 0
        updateStatus()
        Toast.makeText(this, "Feeding the pet!", Toast.LENGTH_SHORT).show()
    }

    fun onCleanClicked(view: android.view.View) {
        petImageView.setImageResource(R.drawable.dogclean)
        // The steps below will determine how the values are changed.
        health += 20
        if (health > 100) health = 100
        cleanliness += 20
        if (cleanliness > 100) cleanliness = 100
        updateStatus()
        Toast.makeText(this, "Cleaning the pet!", Toast.LENGTH_SHORT).show()
    }

    fun onPlayClicked(view: android.view.View) {
        petImageView.setImageResource(R.drawable.dogplaying)
        // The steps below will determine how the values are changed.
        hunger += 20
        if (hunger > 100) hunger = 100
        cleanliness -= 20
        if (cleanliness < 0) cleanliness = 0
        updateStatus()
        Toast.makeText(this, "Playing with the pet!", Toast.LENGTH_SHORT).show()
    }

    private fun updateStatus() {
        healthTextView.text = "Health: $health%"
        hungerTextView.text = "Hunger: $hunger%"
        cleanlinessTextView.text = "Cleanliness: $cleanliness%"
    }
}

