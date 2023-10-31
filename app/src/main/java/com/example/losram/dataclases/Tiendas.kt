package com.example.losram.dataclases

import com.example.losram.Nombre_secciones
import com.example.losram.Nombre_tiendas

data class Tiendas(
    val id: Int,
    val nombreTienda:Nombre_tiendas,
    //val id: Int,
    val puntuacionTienda:Double,
    val imagenPrenda:Int,
    val direccion:String,
    val estadoDeTienda:String,
    val tipo: List<Nombre_secciones>,
   // val prendas: List<Prendas>
)

