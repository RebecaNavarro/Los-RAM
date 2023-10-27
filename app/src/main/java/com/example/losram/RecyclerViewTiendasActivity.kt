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

        val clementine = Tiendas(
            nombreTienda = "Clementine",
            direccion = "Calle 18 de calacoto",
            puntuacionTienda = 4.3,
            estadoDeTienda = "14:00 a 18:00",
            tipo = listOf(Nombre_secciones.FORMAL),
            imagenPrenda = 1
        )
        val mango = Tiendas(
            nombreTienda = "MANGO",
            direccion = "Horacio Ferrecio #1172, La Paz",
            puntuacionTienda = 4.5,
            estadoDeTienda = "14:00 a 19:00",
            tipo = listOf(Nombre_secciones.FORMAL,Nombre_secciones.DE_DIARIO),
            imagenPrenda = 2
        )

        val face_boutique = Tiendas(
            nombreTienda = "Face Boutique",
            direccion = "Montenegro",
            puntuacionTienda = 4.7,
            estadoDeTienda = "15:00 a 18:00",
            tipo = listOf(Nombre_secciones.FORMAL),
            imagenPrenda = 3
        )

        val vickys_casual = Tiendas(
            nombreTienda = "Vickys casual",
            direccion = "Avenida Montenegro 933",
            puntuacionTienda = 4.4,
            estadoDeTienda = "14:00 a 17:00",
            tipo = listOf(Nombre_secciones.FORMAL,Nombre_secciones.DE_DIARIO),
            imagenPrenda = 4
        )

        val benneton = Tiendas(
            nombreTienda = "Benneton",
            direccion = "Montenegro frente al carrusel",
            puntuacionTienda = 4.5,
            estadoDeTienda = "13:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR),
            imagenPrenda = 5
        )

        val big_Sur = Tiendas(
            nombreTienda = "Big Sur Calacoto",
            direccion = "Calle 21 de calacoto",
            puntuacionTienda = 4.5,
            estadoDeTienda = "08:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.PARA_DORMIR,Nombre_secciones.TROPICAL,Nombre_secciones.DEPORTIVO),
            imagenPrenda = 6
        )

        val hering = Tiendas(
            nombreTienda = "HERING",
            direccion = "Calle 18 de calacoto",
            puntuacionTienda = 4.8,
            estadoDeTienda = "15:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR, Nombre_secciones.PARA_DORMIR),
            imagenPrenda = 7
        )

        val somos = Tiendas(
            nombreTienda = "Somos",
            direccion = "Entrada de achumani",
            puntuacionTienda = 4.6,
            estadoDeTienda = "16:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL),
            imagenPrenda = 8
        )

        val whapa = Tiendas(
            nombreTienda = "Whapa",
            direccion = "Montenegro por la calle de vainilla",
            puntuacionTienda = 4.2,
            estadoDeTienda = "!3:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL),
            imagenPrenda = 9
        )

        val e_y_e = Tiendas(
            nombreTienda = "E&E",
            direccion = "Shopping norte Prado",
            puntuacionTienda = 4.2,
            estadoDeTienda = "12:00 a 21:00",
            tipo = listOf(Nombre_secciones.PARA_DORMIR,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.TROPICAL),
            imagenPrenda = 10
        )

        val levis = Tiendas(
            nombreTienda = "LEVIS Megacenter",
            direccion = "Megacenter 2do piso",
            puntuacionTienda = 4.7,
            estadoDeTienda = "12:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
            imagenPrenda = 11
        )

        val yuth = Tiendas(
            nombreTienda = "Yuth",
            direccion = "Calle 21 calacoto frente a la iglesia",
            puntuacionTienda = 4.8,
            estadoDeTienda = "12:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
            imagenPrenda = 12
        )

        val fair_play = Tiendas(
            nombreTienda = "Fair play Calacoto",
            direccion = "Calle 21 de calacoto",
            puntuacionTienda = 4.6,
            estadoDeTienda = "14:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
            imagenPrenda = 13
        )

        val solmania = Tiendas(
            nombreTienda = "Solmania",
            direccion = "Montenegro por hotel los delfines",
            puntuacionTienda = 4.1,
            estadoDeTienda = "14:00 a 22:00",
            tipo = listOf(Nombre_secciones.TROPICAL),
            imagenPrenda = 14
        )

        val women_secret = Tiendas(
            nombreTienda = "Women Secret",
            direccion = "Montenegro frente al carrusel",
            puntuacionTienda = 4.9,
            estadoDeTienda = "15:00 a 21:00",
            tipo = listOf(Nombre_secciones.TROPICAL,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.PARA_DORMIR),
            imagenPrenda = 15
        )

        val lupo = Tiendas(
            nombreTienda = "Lupo Calacoto",
            direccion = "Calle 21 de calacoto",
            puntuacionTienda = 4.6,
            estadoDeTienda = "14:00 a 20:00",
            tipo = listOf(Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.DEPORTIVO,),
            imagenPrenda = 16
        )

        val textilon = Tiendas(
            nombreTienda = "Textilon calacoto",
            direccion = "8261,Avenida 21-Washington",
            puntuacionTienda = 4.5,
            estadoDeTienda = "10:00 a 21:00",
            tipo = listOf(Nombre_secciones.PARA_DORMIR,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.TROPICAL),
            imagenPrenda = 17
        )

        val sur_modas = Tiendas(
            nombreTienda = "Sur Modas calacoto",
            direccion = "8261,Avenida 21-Washington",
            puntuacionTienda = 4.7,
            estadoDeTienda = "14:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.FORMAL),
            imagenPrenda = 18
        )

        val adidas = Tiendas(
            nombreTienda = "Adidas calacoto",
            direccion = "8261,Avenida 21-Washington",
            puntuacionTienda = 4.7,
            estadoDeTienda = "11:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
            imagenPrenda = 17
        )


// tiendas.add(clementine)
        tiendasAdapter.addTiendas(tiendas)
        binding.recyclerTiendas.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = tiendasAdapter
        }
        tiendasAdapter.notifyDataSetChanged()
    }
}