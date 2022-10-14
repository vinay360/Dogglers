package com.example.dogglersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglersapp.databinding.ActivityViewPagerBinding

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.viewPager
        val myAdapter = MyViewPagerAdapter(Data.dogs)
        viewPager.adapter = myAdapter
    }
}