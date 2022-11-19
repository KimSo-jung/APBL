package com.example.myapplication.navigation

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.example.myapplication.MainActivity
import com.google.firebase.auth.FirebaseUser

override fun onStart(){
        super.onStart()
        moveMainPage(auth?.currentUser)
    }

    fun moveMainPage(user: FirebaseUser?){
        if(user != null){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }