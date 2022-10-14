package com.example.dogglersapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.dogglersapp.R

public class SecondFragmentDirections private constructor() {
  public companion object {
    public fun actionSecondFragmentToThirdFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_secondFragment_to_thirdFragment)

    public fun actionSecondFragmentToFirstFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_secondFragment_to_firstFragment)
  }
}
