package com.androidsolutions.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidsolutions.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initClicks()
    }

    private fun initClicks() {
        binding.btnStatic.setOnClickListener {
            startActivity(Intent(this,StaticFragmentActivity::class.java))
        }
        binding.btnDynamic.setOnClickListener {
            startActivity(Intent(this,DynamicFragmentActivity::class.java))
        }
        binding.btnNavigation.setOnClickListener {
            startActivity(Intent(this,NavLibraryActivity::class.java))
        }
    }
}