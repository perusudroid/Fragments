package com.androidsolutions.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import com.androidsolutions.fragments.databinding.ActivityDynamicFragmentBinding

class DynamicFragmentActivity : AppCompatActivity() {

    private val binding by lazy { ActivityDynamicFragmentBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        doLoadFragment()
    }

    private fun doLoadFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmetContainer, MainFragment().apply {
                arguments = bundleOf("type" to "Dynamic")
            })
            .commit()
    }
}