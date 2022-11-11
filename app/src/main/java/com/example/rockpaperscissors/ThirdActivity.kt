package com.example.rockpaperscissors

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Toast.makeText(this, "Third Activity", Toast.LENGTH_SHORT).show()
    }
}