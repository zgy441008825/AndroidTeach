package com.example.androidteach.Activity

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.androidteach.R
import kotlinx.android.synthetic.main.activity_main.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        acMainView.setOnClickListener {
            Log.d("AActivity", "ZLog onClick :[view]$it")
        }
    }

    fun onViewClick(view: View) {
        Log.d("AActivity", "ZLog onViewClick :[view]$view")
    }

}
