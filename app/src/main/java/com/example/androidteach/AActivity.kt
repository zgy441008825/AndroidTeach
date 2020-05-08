package com.example.androidteach

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("AActivity", "ZLog onCreate $savedInstanceState")
        acMainTvJump.setOnClickListener {
            //创建意图（聘请媒婆，告诉它我的对象是BActivity）
            val intent = Intent(this, BActivity::class.java)
            //设置数据（添加彩礼）
            intent.putExtra("name", "嫁吗")
            //这种启动方式是不需要返回数据的
//            startActivity(intent)

            //这种方式是需要返回数据的,第二个参数为标记位，取回数据的时候需要用到，用它来判断返回的数据是给当前Activity的
            startActivityForResult(intent, 0x1001)
        }
    }

    //返回数据后系统会调用此回调，第一个参数为我们启动的时候传递的，用来判断是否是我们要的数据
    //第二个参数是标记返回的是成功还是失败，成功时取值Activity.RESULT_OK
    //第三个参数为Intent对象，里面包含返回的数据
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("AActivity", "ZLog Intent onActivityResult $requestCode $resultCode")
        if (requestCode == 0x1001 && resultCode == Activity.RESULT_OK && data != null) {
            val result = data.getStringExtra("result")
            Log.d("AActivity", "ZLog Intent onActivityResult 取出BActivity返回的数据:$result")
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
