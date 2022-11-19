package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //added text as a test
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.selectedItemId = R.id.action_home
    }
}