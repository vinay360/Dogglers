package com.example.dogglersapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.dogglersapp.R
import com.example.dogglersapp.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {

    lateinit var binding: FragmentFourthBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourthBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.previous.setOnClickListener {
            val action = FourthFragmentDirections.actionFourthFragmentToThirdFragment()
            view.findNavController().navigate(action)
        }
        binding.next.setOnClickListener {
            val action = FourthFragmentDirections.actionFourthFragmentToFirstFragment()
            view.findNavController().navigate(action)
        }
    }

}