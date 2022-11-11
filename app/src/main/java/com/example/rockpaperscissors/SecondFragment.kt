package com.example.rockpaperscissors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.rockpaperscissors.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSecondBinding.inflate(layoutInflater)
        Toast.makeText(binding.root.context, "Second Fragment", Toast.LENGTH_SHORT).show()
        binding.nextButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdFragment)
        )
        return binding.root
    }
}