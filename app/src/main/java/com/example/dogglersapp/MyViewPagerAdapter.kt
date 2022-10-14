package com.example.dogglersapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglersapp.databinding.ViewPagerItemViewBinding

class MyViewPagerAdapter(private val dogs: List<Model>): RecyclerView.Adapter<MyViewPagerAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(itemView: View, val binding: ViewPagerItemViewBinding): RecyclerView.ViewHolder(itemView)  {
        var dogImage = binding.dogImage
        var dogName = binding.dogName
        var dogAge = binding.dogAge
        var dogHobbies = binding.dogHobbies
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ViewPagerItemViewBinding.inflate(inflater,parent,false)
        return ItemViewHolder(binding.root,binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val dog = dogs[position]
        holder.apply {
            dogImage.setImageResource(dog.imageResourceId)
            dogName.text = dog.name
            dogAge.text = "Age: " + dog.age
            dogHobbies.text = "Hobbies: " + dog.hobbies
        }
    }

    override fun getItemCount(): Int {
        return dogs.size
    }
}