package com.dicoding.academies.ui

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.academies.R
import com.dicoding.academies.ui.alarm.AlarmManager
import com.dicoding.academies.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_detail_course.*
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity(){

    private lateinit var alarmReceiver: AlarmManager
    private lateinit var sharedPreferences: SharedPreferences

    companion object{
        const val PREFERENCE = "setting"
        const val ALARM = "alarm"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        title = getString(R.string.setting)

        alarmReceiver = AlarmManager()
        sharedPreferences = getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE)

        setSwitch()
        sw_alarm.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                alarmReceiver.setAlarm(this,AlarmManager.ALARM_TITLE, getString(R.string.alarm_message))
            }else{
                alarmReceiver.cancelAlarm(this)
            }
            saveChangeFavorite(isChecked)
        }
    }

    private fun saveChangeFavorite(value: Boolean) {
        val editorInfo = sharedPreferences.edit()
        editorInfo.putBoolean(ALARM, value)
        editorInfo.apply()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_setting -> {
                val intent = Intent(this@SettingActivity, HomeActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setSwitch() {
        sw_alarm.isChecked = sharedPreferences.getBoolean(ALARM, false)
    }
}