package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding //lateinit : when we are sure that the variable will be initialized in future
    lateinit var mainViewModel: ViewModels

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

       mainViewModel = ViewModels()
       binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this
    }
}