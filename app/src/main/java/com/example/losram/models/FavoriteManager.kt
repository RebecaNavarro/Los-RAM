package com.example.losram.models;

import android.content.Context
import com.example.losram.models.Favorite
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class FavoriteManager(private val context: Context) {
    private val sharedPreferences = context.getSharedPreferences("mis_favoritos", Context.MODE_PRIVATE)
    private val editor = sharedPreferences.edit()
    private val gson = Gson()

    fun guardarFavoritos(listaFavoritos: List<Favorite>) {
        val json = gson.toJson(listaFavoritos)
        editor.putString("favoritos_key", json).apply()
    }

    fun obtenerFavoritos(): List<Favorite> {
        val json = sharedPreferences.getString("favoritos_key", "")
        val type = object : TypeToken<List<Favorite>>() {}.type
        return gson.fromJson(json, type) ?: emptyList()
    }
}
