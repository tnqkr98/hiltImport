package com.cupix.module.hiltpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            mainViewModel.saveString("hiltKey", "hilt injection success")
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val data = mainViewModel.getString("hiltKey")
            Log.d("HILT_PRACTICE", "data: $data")
        }
    }
}