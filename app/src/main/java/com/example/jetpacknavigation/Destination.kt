package com.example.jetpacknavigation

sealed class Destination(var route: String){
    object ScreenFirst: Destination("ScreenFirst")
    object ScreenSecond: Destination("ScreenSecond")
}
