package com.alanturin.proyectolol

sealed class ClaseSellada(val route: String){
    object Home: ClaseSellada(route = "MainActivity.kt")
    object Detail: ClaseSellada(route = "CharacterRender.kt")
}