package com.example.losram.dataclases

data class Carrito(
    val descripcion:String,
    val cantidad:Int,
    val precio: Int,
    var pagoTotal: Int
)
