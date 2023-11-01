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

        val carrusel1List = ArrayList<CarruselModel>()
        carrusel1List.add(CarruselModel(R.drawable.promocion1))
        carrusel1List.add(CarruselModel(R.drawable.promocion2))
        carrusel1List.add(CarruselModel(R.drawable.promocion3))
        carrusel1List.add(CarruselModel(R.drawable.promocion4))
        carrusel1List.add(CarruselModel(R.drawable.promocion5))
        carrusel1List.add(CarruselModel(R.drawable.promocion6))
        carrusel1List.add(CarruselModel(R.drawable.promocion7))

        val adapter = CarruselAdapter(carrusel1List)

        binding.apply {
            carruselRecycer.adapter = adapter
            carruselRecycer.setInfinite(true)
        }

        val carrusel2List = ArrayList<CarruselModel>()
        carrusel2List.add(CarruselModel(R.drawable.tendencias2))
        carrusel2List.add(CarruselModel(R.drawable.tendencias3))
        carrusel2List.add(CarruselModel(R.drawable.tendencias4))
        carrusel2List.add(CarruselModel(R.drawable.tendencias5))
        carrusel2List.add(CarruselModel(R.drawable.tendencias6))
        carrusel2List.add(CarruselModel(R.drawable.tendencia1))
        carrusel2List.add(CarruselModel(R.drawable.tendencias7))
        carrusel2List.add(CarruselModel(R.drawable.tendencias8))
        carrusel2List.add(CarruselModel(R.drawable.tendencias9))
        carrusel2List.add(CarruselModel(R.drawable.tendencias10))
        carrusel2List.add(CarruselModel(R.drawable.tendencias11))

        val adapter2 = CarruselAdapter(carrusel2List)

        binding.apply {
            carruselRecycer2.adapter = adapter2
            carruselRecycer2.setInfinite(true)
        }

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