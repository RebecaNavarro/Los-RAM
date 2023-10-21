package com.example.losram.dataclases

data class RopaPorTienda(
    val nombrePrenda:String,
    val precio:Int,
    val disponibilidad:Boolean,
    val imagen: Int,
    val favoritos:Boolean,
    val tipoDePrenda:String//de tipo prenda
)
