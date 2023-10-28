package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.losram.adapter.BotonesSeccionesAdapter
import com.example.losram.databinding.ActivityPantallaprincipalBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PantallaPrincipalActivivy : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaprincipalBinding
    private lateinit var auth: FirebaseAuth
    private val botonesSeccionesAdapter by lazy { BotonesSeccionesAdapter() }
    private var onClickListener : View.OnClickListener? = null


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
            override fun onClick(position: Int, model: Boton_de_seccionesk) {
                val categoriaPressed: BotonSeccion =
                   // ListaCategoriasMenu.listCategory[position]
                val intent = Intent(context, RecyclerViewTiendasActivity::class.java)

               // intent.putExtra(CLAVE_CATEGORIA, categoriaPressed)
                startActivity(intent)
            }
        })

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