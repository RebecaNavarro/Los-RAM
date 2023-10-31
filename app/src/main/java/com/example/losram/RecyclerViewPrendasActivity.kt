package com.example.losram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.losram.adapter.PrendasAdapter
import com.example.losram.databinding.ActivityRecyclerViewPrendasBinding
import com.example.losram.dataclases.Prendas
import com.example.losram.dataclases.Tiendas

class RecyclerViewPrendasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewPrendasBinding
    private val prendasAdapter by lazy { PrendasAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_prendas)
        binding = ActivityRecyclerViewPrendasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        filtro = intent.getSerializableExtra("Key_Tienda") as Nombre_tiendas

        iniciarRecyclerView()
    }

    private lateinit var filtro: Nombre_tiendas

    val listaprendas: List<Prendas> = listOf(
        Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini cintura alta",
            precio = 120,
            imagenPrenda = R.drawable.bikinis1,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponible",
            corazon = false,
            add_a_carrito = false
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con cadena",
            precio = 120,
            imagenPrenda = R.drawable.bikinis3,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "En el proximo stock",
            corazon = false,
            add_a_carrito = false
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini una pieza",
            precio = 120,
            imagenPrenda = R.drawable.bikinis5,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible",
            corazon = false,
            add_a_carrito = false
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con falda",
            precio = 120,
            imagenPrenda = R.drawable.bikinis6,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible",
            corazon = false,
            add_a_carrito = false
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con cinta cruzada",
            precio = 120,
            imagenPrenda = R.drawable.bikinis7,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "En el proximo stock",
            corazon = false,
            add_a_carrito = false
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini6",
            precio = 120,
            imagenPrenda = R.drawable.bikinis8,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible",
            corazon = false,
            add_a_carrito = false
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini floreado",
            precio = 120,
            imagenPrenda = R.drawable.bikinis9,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponible",
            corazon = false,
            add_a_carrito = false
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini Blanco con piedras",
            precio = 120,
            imagenPrenda = R.drawable.bikinis10,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponiblee",
            corazon = false,
            add_a_carrito = false
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini Nagro con circulos",
            precio = 120,
            imagenPrenda = R.drawable.bikinis11,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponiblee",
            corazon = false,
            add_a_carrito = false
        )
    )


    fun iniciarRecyclerView() {
        /*        prendasAdapter.addPrendas(listaprendas.filter {
                  it.tienda.equals(filtro)
                })*/
        val prendasfiltradas = mutableListOf<Prendas>()
        listaprendas.forEach { prenda ->
            if (prenda.tienda.equals(filtro)) {
                prendasfiltradas.add(prenda)

            }
        }
        prendasAdapter.addPrendas(prendasfiltradas)


        binding.recyclerPrendas.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = prendasAdapter

        }

        binding.recyclerPrendas.adapter = prendasAdapter
        //la lista filtrada al adapter de tienda?
    }
}