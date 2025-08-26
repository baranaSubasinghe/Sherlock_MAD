package com.example.sherlockapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LostReportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lostreport)

        // profile
        val profileIcon = findViewById<ImageView>(R.id.imageView7)

        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // chat
        val chatIcon = findViewById<ImageView>(R.id.imageView8)

        chatIcon.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }

        //Announcement
        val AnnIcon = findViewById<ImageView>(R.id.imageView5)

        AnnIcon.setOnClickListener {
            val intent = Intent(this, AnnouncementActivity::class.java)
            startActivity(intent)
        }

        //Home
        val HomeIcon = findViewById<ImageView>(R.id.imageView9)

        HomeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}