package com.example.androidteach.Activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidteach.R
import kotlinx.android.synthetic.main.activity_second.*

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textView.setOnClickListener {
//            startActivity(Intent(this, CActivity::class.java))
            val intent = Intent()
            intent.putExtra("result", "嫁")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
        val name = intent.getStringExtra("name")
        Log.d("SecondActivity", "ZLog Intent 取出AActivity传递过来的数据: $name")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "ZLog onStart ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "ZLog onResume ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("SecondActivity", "ZLog onRestart ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "ZLog onPause ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "ZLog onStop ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "ZLog onDestroy ")
    }
}
