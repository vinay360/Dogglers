package com.example.dogglersapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vertical : Button = findViewById(R.id.button_vertical)
        vertical.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("Orientation","Vertical")
            startActivity(intent)
        }
        val horizontal : Button = findViewById(R.id.button_horizontal)
        horizontal.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("Orientation","Horizontal")
            startActivity(intent)
        }
        val grid : Button = findViewById(R.id.button_grid)
        grid.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("Orientation","Grid")
            startActivity(intent)
        }
        val viewPager: Button = findViewById(R.id.button_view_pager)
        viewPager.setOnClickListener {
            val intent = Intent(this,ViewPagerActivity::class.java)
            startActivity(intent)
        }
        val navigation: Button = findViewById(R.id.button_navigation)
        navigation.setOnClickListener {
            val intent = Intent(this,NavigationActivity::class.java)
            startActivity(intent)
        }
    }
}