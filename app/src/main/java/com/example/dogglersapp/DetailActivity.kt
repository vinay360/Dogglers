package com.example.dogglersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglersapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val orientation = intent.getStringExtra("Orientation").toString()
        val recyclerView = binding.recyclerView
        val adapter = when(orientation) {
            "Grid" -> MyAdapter(Data.dogs, true)
            else -> MyAdapter(Data.dogs)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = when(orientation) {
            "Vertical" -> LinearLayoutManager(this)
            "Horizontal" -> LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
            else -> GridLayoutManager(this, 2)
        }
    }
}