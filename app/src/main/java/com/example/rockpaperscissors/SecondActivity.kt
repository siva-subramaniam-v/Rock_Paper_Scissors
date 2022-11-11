package com.example.rockpaperscissors

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.rockpaperscissors.databinding.ActivitySecondBinding
import timber.log.Timber

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Timber.i("onCreate Called")

        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Toast.makeText(this, "Second Activity: onCreate Called", Toast.LENGTH_SHORT).show()

        binding.nextButton.setOnClickListener {
            openThirdActivity()
        }
    }

    private fun openThirdActivity() {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart Called")
        Toast.makeText(this, "Second Activity: onStart Called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
        Toast.makeText(this, "Second Activity: onResume Called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
        Toast.makeText(this, "Second Activity: onDestroy Called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
        Toast.makeText(this, "Second Activity: onPause Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
        Toast.makeText(this, "Second Activity: onStop Called", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
        Toast.makeText(this, "Second Activity: onRestart Called", Toast.LENGTH_SHORT).show()
    }
}