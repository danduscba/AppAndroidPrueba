package com.example.mynewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynewapp.databinding.ActivityMainBinding
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private val viewModel: ComparisonViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.compareButton.setOnClickListener {
            val text1 = binding.editText1.text.toString()
            val text2 = binding.editText2.text.toString()

            val areEqual = viewModel.compareStrings(text1, text2)

            binding.resultText.text =
                if (areEqual) "Los textos son iguales" else "Los textos son diferentes"
        }
    }
}