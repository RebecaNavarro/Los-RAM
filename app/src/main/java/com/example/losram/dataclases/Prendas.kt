package com.example.losram.dataclases

import com.example.losram.Nombre_tiendas

data class Prendas(
    val descripcion:String,
    val nombrePrenda:String,
    val precio:Int,
    val imagenPrenda:Int,
    val tienda: Nombre_tiendas,
    val disponibilidad: String,
    val corazon: Boolean,
    val add_a_carrito: Boolean
//mas vendidos en activity
)
