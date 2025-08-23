package com.example.sherlockapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home) // link to your home layout



        val foundBtn = findViewById<Button>(R.id.found_button)

        foundBtn.setOnClickListener {
            val intent = Intent(this, FoundActivity::class.java)
            startActivity(intent)
        }
        val lostBtn = findViewById<Button>(R.id.lost_button)

        lostBtn.setOnClickListener {
            val intent = Intent(this, LostActivity::class.java)
            startActivity(intent)
        }

        // Find your ImageView
        val profileIcon = findViewById<ImageView>(R.id.imageView7)

        // Set click listener
        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Find your ImageView
        val chatIcon = findViewById<ImageView>(R.id.imageView8)

        // Set click listener
        chatIcon.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }
    }
}
