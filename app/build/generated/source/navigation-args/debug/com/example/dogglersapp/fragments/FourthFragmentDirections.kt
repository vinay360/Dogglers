package com.example.dogglersapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.dogglersapp.R

public class FourthFragmentDirections private constructor() {
  public companion object {
    public fun actionFourthFragmentToThirdFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fourthFragment_to_thirdFragment)

    public fun actionFourthFragmentToFirstFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fourthFragment_to_firstFragment)
  }
}
