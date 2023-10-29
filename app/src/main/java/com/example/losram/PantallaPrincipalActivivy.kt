package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.losram.adapter.BotonesSeccionesAdapter
import com.example.losram.databinding.ActivityPantallaprincipalBinding
import com.example.losram.dataclases.BotonSeccion
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PantallaPrincipalActivivy : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaprincipalBinding
    private lateinit var auth: FirebaseAuth
    private val botonesSeccionesAdapter by lazy { BotonesSeccionesAdapter() }

    val context: Context = this
    val activity: Activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaprincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciarBotonesRecyclerView()
        auth = Firebase.auth


        binding.irPerfil.setOnClickListener{
            val intent :Intent = Intent(context, PerfilActivity::class.java)
//            intent.putExtra(CLAVE_ID, userEmail)
            startActivity(intent)
        }

        binding.irUbicacion.setOnClickListener{
            val intent2 :Intent = Intent(context, UbicacionesActivity::class.java)
            startActivity(intent2)
        }

        binding.irFavritos.setOnClickListener{
            val intent3 :Intent = Intent(context, FavoritosActivity::class.java)
            startActivity(intent3)
        }

    }
    fun iniciarBotonesRecyclerView(){
        val botonSecciones = mutableListOf<BotonSeccion>()
        val boton1 = BotonSeccion("Deportivo")
        val boton2 = BotonSeccion("Formal")
        val boton3 = BotonSeccion("Casual")
        botonSecciones.add(boton1)
        botonSecciones.add(boton2)
        botonSecciones.add(boton3)
        botonesSeccionesAdapter.addBotonSeccion(botonSecciones)
        binding.recyBotones.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = botonesSeccionesAdapter
        }

    }
}