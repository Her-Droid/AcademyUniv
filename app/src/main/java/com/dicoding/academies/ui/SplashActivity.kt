package com.dicoding.academies.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.academies.R
import com.dicoding.academies.ui.home.HomeActivity

class SplashActivity: AppCompatActivity() {

    private val splashTime: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, splashTime)

    }

}