package com.example.fragment_zaenarifputra_35

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment_zaenarifputra_35.Fragment.HomeFragment
import com.example.fragment_zaenarifputra_35.Fragment.NotificationFragment
import com.example.fragment_zaenarifputra_35.Fragment.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val notificationsFragment = NotificationFragment()
        val settingsFragment = SettingsFragment()

        makeCurrentFragment (homeFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> makeCurrentFragment(homeFragment)
                R.id.menu_notifications -> makeCurrentFragment(notificationsFragment)
                R.id.menu_settings -> makeCurrentFragment(settingsFragment)
            }

            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frem_nav, fragment)
            commit()
        }
    }
}