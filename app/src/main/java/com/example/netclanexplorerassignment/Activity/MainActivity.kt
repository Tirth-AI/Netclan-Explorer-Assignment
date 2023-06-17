package com.example.netclanexplorerassignment.Activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager2.widget.ViewPager2
import com.example.netclanexplorerassignment.Adapters.VPAdapter
import com.example.netclanexplorerassignment.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val refineBtn: ImageButton = findViewById(R.id.ivBtn_refine)
        val viewPager: ViewPager2 =  findViewById(R.id.viewPager)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val adapter = VPAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            when(position){
                0 -> {
                    tab.text = "Personal"
                }
                1 -> {
                    tab.text = "Business"
                }
                2 -> {
                    tab.text = "Merchant"
                }
            }
        }.attach()

        refineBtn.setOnClickListener {
            val intent = Intent(this, RefineActivity::class.java)
            startActivity(intent)

        }
    }
}