package com.dicoding.academies.ui.developer.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.academies.R
import com.dicoding.academies.ui.developer.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_developer.*

class DeveloperActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val viewPagerAdapter = ViewPagerAdapter(this, supportFragmentManager)
        vp_main.adapter = viewPagerAdapter
        tabUser.setupWithViewPager(vp_main)
    }
}