package com.example.androidteach

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("AActivity", "ZLog onCreate $savedInstanceState")
        acMainTvJump.setOnClickListener {
            val intent = Intent(this, BActivity::class.java)
            intent.putExtra("name", "BActivity")
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("AActivity", "ZLog onSaveInstanceState ")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("AActivity", "ZLog onRestoreInstanceState ")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("AActivity", "ZLog onConfigurationChanged $newConfig")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("AActivity", "ZLog onActivityResult ")
    }

    override fun onStart() {
        super.onStart()
        Log.d("AActivity", "ZLog onStart ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("AActivity", "ZLog onResume ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("AActivity", "ZLog onRestart ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("AActivity", "ZLog onPause ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("AActivity", "ZLog onStop ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("AActivity", "ZLog onDestroy ")
    }

}
