package io.github.asharijuang.tabbar

import android.app.Activity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class SettingActivity : Activity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_contact -> {
                message.setText(R.string.title_contact)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_chat -> {
                message.setText(R.string.title_chat)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_official -> {
                message.setText(R.string.title_official)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_timeline -> {
                message.setText(R.string.title_timeline)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {
                message.setText(R.string.title_settings)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
