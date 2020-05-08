package com.example.androidteach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class CActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("CActivity", "ZLog onCreate ")
    }

    override fun onStart() {
        super.onStart()
        Log.d("CActivity", "ZLog onStart ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CActivity", "ZLog onResume ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CActivity", "ZLog onRestart ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CActivity", "ZLog onPause ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CActivity", "ZLog onStop ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CActivity", "ZLog onDestroy ")
    }
}
