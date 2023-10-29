package com.example.losram

import java.io.Serializable

enum class Nombre_secciones ():Serializable{

    FORMAL,
    DE_DIARIO,
    DEPORTIVO,
    TROPICAL,
    PARA_DORMIR,
    ROPA_INTERIOR;
    fun getTitulo():String = when(this){
        FORMAL -> "Formal"
        DE_DIARIO -> "De Diario"
        DEPORTIVO -> "Deportivo"
        TROPICAL -> "Tropical"
        PARA_DORMIR -> "Para Dormir"
        ROPA_INTERIOR -> "Ropa Interior"
    }
}
