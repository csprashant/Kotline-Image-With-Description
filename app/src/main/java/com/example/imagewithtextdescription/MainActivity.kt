package com.example.imagewithtextdescription

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun summerView(view:View) {
        setContentView(R.layout.summer_activity)
    }
    fun winterView(view:View){
        setContentView(R.layout.winter_activity)
    }
    fun rainView(view:View){
        setContentView(R.layout.rain_activity)
    }
    fun close(view:View){
        finish()
    }
    fun homeView(view:View){
        setContentView(R.layout.activity_main)
    }

}