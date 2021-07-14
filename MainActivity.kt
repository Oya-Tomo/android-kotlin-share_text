package com.example.shareimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shareButton:Button = findViewById(R.id.shareButton)

        shareButton.setOnClickListener {
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "This text will be shared.")
                type = "text/plain"
            }
            val mainIntent = Intent.createChooser(intent, null)
            startActivity(mainIntent)
        }

    }
}
