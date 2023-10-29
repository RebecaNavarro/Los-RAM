package com.example.losram.dataclases

import com.example.losram.Nombre_secciones

data class Tiendas(
    //val id: Int,
    val nombreTienda:String,
    val puntuacionTienda:Double,
    val imagenPrenda:Int,
    val direccion:String,
    val estadoDeTienda:String,
    val tipo: List<Nombre_secciones>,
   // val prendas: List<Prendas>
)

