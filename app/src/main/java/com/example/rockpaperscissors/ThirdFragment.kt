package com.example.rockpaperscissors

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.rockpaperscissors.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        Toast.makeText(binding.root.context, "Third Fragment", Toast.LENGTH_SHORT).show()
        binding.nextButton.setOnClickListener{
            openMainActivity()
        }
        return binding.root
    }

    private fun openMainActivity() {
        val intent = Intent(binding.root.context, MainActivity::class.java)
        startActivity(intent)
    }
}