package com.example.dogglersapp

import androidx.annotation.DrawableRes

data class Model(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val age: String,
    val hobbies: String
)
