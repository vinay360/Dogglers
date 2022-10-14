package com.example.dogglersapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.dogglersapp.R

public class ThirdFragmentDirections private constructor() {
  public companion object {
    public fun actionThirdFragmentToFourthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_thirdFragment_to_fourthFragment)

    public fun actionThirdFragmentToSecondFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_thirdFragment_to_secondFragment)
  }
}
