package com.natansin.quem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed

class lottie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottie)

        Handler(Looper.getMainLooper()).postDelayed(3000){
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}