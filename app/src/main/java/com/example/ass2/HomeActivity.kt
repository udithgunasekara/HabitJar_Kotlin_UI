package com.example.ass2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        val journalBook = findViewById<Button>(R.id.addmore)
        journalBook.setOnClickListener {
            val intent = Intent(this,JournalB::class.java)
            startActivity(intent)
        }

    }
}