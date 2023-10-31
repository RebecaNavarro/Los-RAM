package com.example.losram

import java.io.Serializable

enum class Nombre_tiendas(): Serializable {
    SOLMANIA,
    FAIR_PLAY,
    ADIDAS,
    YUTH,
    HERING,
    WOMEN_SECRET,
    E_Y_E,
    SUR_MODA,
    TEXTILON,
    LUPO,
    BENNETON,
    FACE_BOUTIQUE,
    CLEMENTINE,
    MANGO,
    VICKYS_CASUAL,
    BIG_SUR,
    SOMOS,
    WHAPA,
    LEVIS_MEGACENTER;

    fun getTiendas(): String = when(this) {
        SOLMANIA -> "Solmania"
        FAIR_PLAY -> "Fair play Calacoto"
        ADIDAS -> "Adidas calacoto"
        YUTH -> "Yuth"
        HERING -> "HERING"
        WOMEN_SECRET -> "Women Secret"
        E_Y_E -> "E&E"
        SUR_MODA -> "Sur Modas calacoto"
        TEXTILON -> "Textilon calacoto"
        LUPO -> "Lupo Calacoto"
        BENNETON -> "Benneton"
        FACE_BOUTIQUE -> "Face Boutique"
        CLEMENTINE -> "Clementine"
        MANGO -> "MANGO"
        VICKYS_CASUAL -> "Vickys casual"
        BIG_SUR -> "Big Sur"
        SOMOS -> "Somos"
        WHAPA -> "Whapa"
        LEVIS_MEGACENTER -> "LEVIS Megacenter"
    }
}