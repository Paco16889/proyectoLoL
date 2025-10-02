package com.alanturin.proyectolol.model

class Champion {
    val nombre:String
    val title: String
    val lore: String
    val imgUrl: String

    constructor(nombre: String, title: String, lore: String, imgUrl: String){
        this.nombre = nombre
        this.title = title
        this.lore = lore
        this.imgUrl = imgUrl
    }
}