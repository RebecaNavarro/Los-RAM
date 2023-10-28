package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.losram.adapter.BotonesAdapter
import com.example.losram.databinding.ActivityPantallaprincipalBinding
import com.example.losram.dataclases.Tiendas
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PantallaPrincipalActivivy : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaprincipalBinding
    private lateinit var auth: FirebaseAuth
    private val secciones= listOf<Nombre_secciones>(Nombre_secciones.DEPORTIVO,Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,
                                                        Nombre_secciones.TROPICAL,Nombre_secciones.PARA_DORMIR,Nombre_secciones.ROPA_INTERIOR)

    private val botonesSeccionesAdapter by lazy { BotonesAdapter(secciones){
        navegar(it)
    } }
    val context: Context = this
    val activity: Activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaprincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciarBotonesRecyclerView()
        auth = Firebase.auth



        botonesSeccionesAdapter.setOnClickListener(object : BotonesSeccionesAdapter.OnClickListener {
            //permite que los items del recyclerView sean clickeables. Mandando a la respectiva categoria
            override fun onClick(position: Int, model: BotonSeccion) {
                val categoriaPressed: BotonSeccion =
                   // ListaCategoriasMenu.listCategory[position]
                val intent = Intent(context, RecyclerViewTiendasActivity::class.java)

               // intent.putExtra(CLAVE_CATEGORIA, categoriaPressed)
                startActivity(intent)
            }
        })

    }
    fun iniciarBotonesRecyclerView(){


        binding.recyBotones.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = botonesSeccionesAdapter
        }

    }

    fun navegar(botonSeccion:Nombre_secciones){
       val intent = Intent(this,RecyclerViewTiendasActivity::class.java)
        intent.putExtra("Key_Seccion",botonSeccion)
        startActivity(intent)
    }
}