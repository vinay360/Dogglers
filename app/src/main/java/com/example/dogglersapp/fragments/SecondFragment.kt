package com.example.dogglersapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.dogglersapp.R
import com.example.dogglersapp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.next.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment()
            view.findNavController().navigate(action)
        }
        binding.previous.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            view.findNavController().navigate(action)
        }
    }
}