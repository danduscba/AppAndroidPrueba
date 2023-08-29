package com.example.mynewapp
import androidx.lifecycle.ViewModel

class ComparisonViewModel : ViewModel() {
    private val model = Model()

    fun compareStrings(str1: String, str2: String): Boolean {
        return model.compareStrings(str1, str2)
    }
}
