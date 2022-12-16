package com.moj.mywallpaper.Services

import com.moj.mywallpaper.Model.Category
import com.moj.mywallpaper.Model.Wallpaper

object DataService {
    var categories = listOf(
        Category("Car", "car"),
        Category("Love", "love"),
        Category("Nature", "nature"),
        Category("Food", "food"),
        Category("Animal", "animal"),
        Category("Music", "music"),
        Category("Inspiration Quotes", "inspiration")
    )


    var foods = listOf(
        Wallpaper("food1", "food1"),
        Wallpaper("food2", "food2"),
        Wallpaper("food3", "food3"),
        Wallpaper("food4", "food4"),
        Wallpaper("food5", "food5")
    )

    var cars = listOf(
        Wallpaper("car1", "car1"),
        Wallpaper("car2", "car2"),
        Wallpaper("car3", "car3"),
        Wallpaper("car4", "car4"),
        Wallpaper("car5", "car5")
    )
}