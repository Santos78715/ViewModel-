package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModels : ViewModel() {
    var text = MutableLiveData("We need to update Text")

    fun updateText() {
        text.value = " Text is Updated "
    }
}