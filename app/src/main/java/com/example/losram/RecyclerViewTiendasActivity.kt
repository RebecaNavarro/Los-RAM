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

        val Clementine = Tiendas(
            nombreTienda = "Clementine",
            direccion = "Calle 18 de calacoto",
            puntuacionTienda = 4.3,
            estadoDeTienda = "14:00 a 18:00",
            tipo = "Formal",
            imagenPrenda = 1
        )
        val Mango = Tiendas(
            nombreTienda = "MANGO",
            direccion = "Horacio Ferrecio #1172, La Paz",
            puntuacionTienda = 4.5,
            estadoDeTienda = "14:00 a 19:00",
            tipo = "Formal",
            imagenPrenda = 2
        )

        val Face_boutique = Tiendas(
            nombreTienda = "Face Boutique",
            direccion = "Montenegro",
            puntuacionTienda = 4.7,
            estadoDeTienda = "15:00 a 18:00",
            tipo = "Formal",
            imagenPrenda = 3
        )

        val Vickys_casual = Tiendas(
            nombreTienda = "Vickys casual",
            direccion = "Avenida Montenegro 933",
            puntuacionTienda = 4.4,
            estadoDeTienda = "14:00 a 17:00",
            tipo = "Formal",
            imagenPrenda = 4
        )


tiendas.add(Clementine)
        tiendasAdapter.addTiendas(tiendas)
        binding.recyclerTiendas.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = tiendasAdapter
        }
        tiendasAdapter.notifyDataSetChanged()
    }
}