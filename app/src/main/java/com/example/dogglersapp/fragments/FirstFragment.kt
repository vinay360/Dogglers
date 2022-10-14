package com.example.dogglersapp.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.findNavController
import com.example.dogglersapp.MainActivity
import com.example.dogglersapp.R
import com.example.dogglersapp.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.next.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            view.findNavController().navigate(action)
        }
        binding.previous.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToFourthFragment()
            view.findNavController().navigate(action)
        }
    }

}