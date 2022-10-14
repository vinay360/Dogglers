package com.example.dogglersapp

import android.graphics.drawable.GradientDrawable.Orientation
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.dogglersapp.databinding.GridLayoutViewHolderBinding
import com.example.dogglersapp.databinding.LayoutViewHolderBinding

class MyAdapter(private val dogs: List<Model>, private var grid: Boolean = false) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View, private val _binding: ViewBinding,private val grid: Boolean): RecyclerView.ViewHolder(itemView) {
        init {
            setData()
        }
        lateinit var dogImage : ImageView
        lateinit var dogName : TextView
        lateinit var dogAge : TextView
        lateinit var dogHobbies : TextView
        private fun setData() {
            if(grid) {
                val binding = _binding as GridLayoutViewHolderBinding
                dogImage = binding.dogImage
                dogName = binding.dogName
                dogAge = binding.dogAge
                dogHobbies = binding.dogHobbies
            } else {
                val binding = _binding as LayoutViewHolderBinding
                dogImage = binding.dogImage
                dogName = binding.dogName
                dogAge = binding.dogAge
                dogHobbies = binding.dogHobbies
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = when(grid) {
            true -> GridLayoutViewHolderBinding.inflate(LayoutInflater.from(parent.context))
            else -> LayoutViewHolderBinding.inflate(LayoutInflater.from(parent.context))
        }
        //val inflater = LayoutInflater.from(parent.context).inflate(layoutId,parent,false)
        return MyViewHolder(binding.root,binding,grid)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
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