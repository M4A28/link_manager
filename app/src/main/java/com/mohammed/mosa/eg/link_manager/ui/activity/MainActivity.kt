package com.mohammed.mosa.eg.link_manager.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mohammed.mosa.eg.link_manager.databinding.ActivityMainBinding
import com.mohammed.mosa.eg.link_manager.data.DateConverter

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        Log.d("dat", DateConverter.toDate(15L).toString())
        if(savedInstanceState == null)
            Log.d("fox", savedInstanceState.toString())
    }
}