package com.example.losram.dataclases

data class PagoPortarjeta(
    val banco:String,
    val nombreDueno:String,
    val numTarjeta:Int,
    val codigoSeguridad:Int
)
