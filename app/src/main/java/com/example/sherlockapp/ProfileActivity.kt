package com.example.sherlockapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.materialswitch.MaterialSwitch

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userprofile) // your profile UI

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

        val logoutIcon = findViewById<ImageView>(R.id.imageView13)

        logoutIcon.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        val editIcon = findViewById<ImageView>(R.id.imageView11)

        editIcon.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        //dark mode button
        val darkModeSwitch = findViewById<MaterialSwitch>(R.id.darkModeSwitch)
        val sharedPreferences = getSharedPreferences("AppSettingsPrefs", MODE_PRIVATE)
        val isDarkMode = sharedPreferences.getBoolean("DarkMode", false)
        darkModeSwitch.isChecked = isDarkMode

        darkModeSwitch.setOnCheckedChangeListener { _, isChecked ->
            sharedPreferences.edit().putBoolean("DarkMode", isChecked).apply()
            AppCompatDelegate.setDefaultNightMode(
                if (isChecked) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
            )

        }


    }
}
