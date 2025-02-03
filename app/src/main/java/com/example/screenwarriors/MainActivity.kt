package com.example.screenwarriors

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup the Toolbar (if you are using one)
        val toolbar: Toolbar = findViewById(R.id.toolbar) // Ensure you have a Toolbar in activity_main.xml
        setSupportActionBar(toolbar)

        // ImageView initialization
        val baasithImage = findViewById<ImageView>(R.id.imageBaasith)
        val harishImage = findViewById<ImageView>(R.id.imageHarish)
        val gowdhamImage = findViewById<ImageView>(R.id.imageGowdham)

        // Set click listeners for images
        baasithImage.setOnClickListener {
            openDetailActivity("Madhan Mohan", R.drawable.ronaldo, "Madhan is focused on mastering Linux systems, which includes administration, security, and server management. He is likely to work with different Linux distributions and is proficient in shell scripting, system configuration, and troubleshooting. Baasith may also explore open-source projects, system optimizations, and possibly DevOps-related tasks, given how intertwined Linux is with cloud and server-side technologies.")
        }

        harishImage.setOnClickListener {
            openDetailActivity("Jenson", R.drawable.neymar, "Jenson specializes in building websites and web applications. His expertise includes both front-end and back-end development. Harish is likely well-versed in HTML, CSS, JavaScript, and frameworks like React, Angular, or Vue for front-end development. On the back-end, he may work with Node.js, PHP, Python, or other technologies. Additionally, Harish probably has experience with databases like MySQL, MongoDB, or PostgreSQL, and is familiar with deployment and version control systems such as Git.")
        }

        gowdhamImage.setOnClickListener {
            openDetailActivity("Naga Harish Madhav", R.drawable.messi, "Madhav specializes in cloud computing, which involves working with platforms like AWS, Microsoft Azure, and Google Cloud. He may focus on setting up, managing, and optimizing cloud infrastructure, using services like storage, computing, and networking in the cloud. Gowdham is likely knowledgeable in cloud security, automation, and scaling solutions, and he may also be involved in DevOps practices, ensuring that software development and operations teams can seamlessly deploy and maintain services on the cloud.")
        }
    }

    private fun openDetailActivity(name: String, imageRes: Int, summary: String) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("imageRes", imageRes)
        intent.putExtra("summary", summary)
        startActivity(intent)
    }

    // Inflate the options menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // Handle item selection in options menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> Toast.makeText(this, "About Selected", Toast.LENGTH_SHORT).show()
            R.id.settings -> Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT).show()
            R.id.exit -> Toast.makeText(this, "Exit Selected", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
