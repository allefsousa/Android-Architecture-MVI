package com.developer.mvi_android.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.developer.mvi_android.R
import com.developer.mvi_android.databinding.ActivityMainBinding

class UserActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonFetchUser.setOnClickListener {

        }
    }
}