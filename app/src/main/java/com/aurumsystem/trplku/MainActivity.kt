package com.aurumsystem.trplku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        var fm = supportFragmentManager
        var ft = fm.beginTransaction()
        ft
            .add(R.id.LokasiFragment, HomeFragment())
            .commit()

        var TabL:TabLayout = findViewById(R.id.tLayout)
        TabL.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab!!.position){
                    0 -> {
                        var fm = supportFragmentManager
                        var ft = fm.beginTransaction()
                        ft
                            .replace(R.id.LokasiFragment, HomeFragment())
                            .commit()
                    }
                    1 -> {
                        var fm = supportFragmentManager
                        var ft = fm.beginTransaction()
                        ft
                            .replace(R.id.LokasiFragment, AboutFragment())
                            .commit()
                    }
                    2 -> {

                    }
                }
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }
        })
    }
}