package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.losram.databinding.ActivityGraciasBinding
import com.example.losram.databinding.ActivityPantallaPagarBinding
import com.google.firebase.auth.FirebaseAuth

class GraciasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGraciasBinding
    private lateinit var auth: FirebaseAuth

    var listaRatings = arrayListOf<Float>()
    var ratingSelected = 0f
    var promedio = 0f

    val context: Context = this
    val activity: Activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGraciasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.omitir.setOnClickListener{
            val intent: Intent = Intent(context,PantallaPrincipalActivivy::class.java)
            startActivity(intent)
        }

        binding.listo.setOnClickListener{
            val intent2: Intent = Intent(context,PantallaPrincipalActivivy::class.java)
            startActivity(intent2)
        }

        binding.ratingTienda.rating = 5f

    }
}