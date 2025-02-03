package com.example.screenwarriors

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val personImage = findViewById<ImageView>(R.id.personImage)
        val personName = findViewById<TextView>(R.id.personName)
        val personSummary = findViewById<TextView>(R.id.personSummary)
        val backButton = findViewById<Button>(R.id.backButton)

        val name = intent.getStringExtra("name")
        val imageRes = intent.getIntExtra("imageRes", 0)
        val summary = intent.getStringExtra("summary")

        personName.text = name
        personImage.setImageResource(imageRes)
        personSummary.text = summary

        backButton.setOnClickListener {
            finish() // Closes this activity and returns to the main activity
        }
    }
}
