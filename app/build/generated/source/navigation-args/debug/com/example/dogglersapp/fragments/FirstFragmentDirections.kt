package com.example.dogglersapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.dogglersapp.R

public class FirstFragmentDirections private constructor() {
  public companion object {
    public fun actionFirstFragmentToSecondFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstFragment_to_secondFragment)

    public fun actionFirstFragmentToFourthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstFragment_to_fourthFragment)
  }
}
