package com.example.losram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.losram.adapter.TiendasAdapter
import com.example.losram.databinding.ActivityRecyclerViewTiendasBinding
import com.example.losram.dataclases.Tiendas

class RecyclerViewTiendasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewTiendasBinding
    private val tiendasAdapter by lazy {TiendasAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_tiendas)
        binding = ActivityRecyclerViewTiendasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciarRecyclerView()
    }

    fun iniciarRecyclerView() {
        val tiendas = mutableListOf<Tiendas>()

        val tienda = Tiendas(
            nombreTienda = "Clementine",
            direccion = "Calle 18 de calacoto",
            puntuacionTienda = 4.3,
            estadoDeTienda = "abierto",
            tipo = "Formal",
            imagenPrenda = 2
        )
tiendas.add(tienda)
        tiendasAdapter.addTiendas(tiendas)
        binding.recyclerTiendas.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = tiendasAdapter
        }
        tiendasAdapter.notifyDataSetChanged()
    }
}