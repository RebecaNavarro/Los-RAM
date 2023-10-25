package com.example.losram.dataclases

data class Carrito(
    //lita de prendas
    val descripcion:String,
    val cantidad:Int,
    val precio: Int,
    var pagoTotal: Int,
    //con ayuda de los activity
)
