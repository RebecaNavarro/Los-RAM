package com.example.losram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.losram.adapter.TiendasAdapter
import com.example.losram.adapter.Titulo_seccionAdapter
import com.example.losram.databinding.ActivityRecyclerViewTiendasBinding
import com.example.losram.dataclases.Tiendas
import com.example.losram.dataclases.Titulo_seccion

class RecyclerViewTiendasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewTiendasBinding
    private val tiendasAdapter by lazy {TiendasAdapter() }
    private val titulo_seccionAdapter by lazy { Titulo_seccionAdapter() }
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
            id = 1,
            nombreTienda = "Clementine",
            direccion = "Calle 18 de calacoto",
            puntuacionTienda = 4.3,
            estadoDeTienda = "14:00 a 18:00",
            tipo = listOf(Nombre_secciones.FORMAL),
            imagenPrenda = R.drawable.clementine_logo
        )
        val mango = Tiendas(
            id = 2,
            nombreTienda = "MANGO",
            direccion = "Horacio Ferrecio #1172, La Paz",
            puntuacionTienda = 4.5,
            estadoDeTienda = "14:00 a 19:00",
            tipo = listOf(Nombre_secciones.FORMAL,Nombre_secciones.DE_DIARIO),
            imagenPrenda = R.drawable.mango_logo
        )

        val face_boutique = Tiendas(
            id = 3,
            nombreTienda = "Face Boutique",
            direccion = "Montenegro",
            puntuacionTienda = 4.7,
            estadoDeTienda = "15:00 a 18:00",
            tipo = listOf(Nombre_secciones.FORMAL),
            imagenPrenda = R.drawable.face_logo
        )

        val vickys_casual = Tiendas(
            id = 4,
            nombreTienda = "Vickys casual",
            direccion = "Avenida Montenegro 933",
            puntuacionTienda = 4.4,
            estadoDeTienda = "14:00 a 17:00",
            tipo = listOf(Nombre_secciones.FORMAL,Nombre_secciones.DE_DIARIO),
            imagenPrenda = R.drawable.vickys_casual
        )

        val benneton = Tiendas(
            id = 5,
            nombreTienda = "Benneton",
            direccion = "Montenegro frente al carrusel",
            puntuacionTienda = 4.5,
            estadoDeTienda = "13:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR),
            imagenPrenda = R.drawable.benetton_logo
        )

        val big_Sur = Tiendas(
            id = 6,
            nombreTienda = "Big Sur Calacoto",
            direccion = "Calle 21 de calacoto",
            puntuacionTienda = 4.5,
            estadoDeTienda = "08:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.PARA_DORMIR,Nombre_secciones.TROPICAL,Nombre_secciones.DEPORTIVO),
            imagenPrenda = R.drawable.big_sur_logo
        )

        val hering = Tiendas(
            id = 7,
            nombreTienda = "HERING",
            direccion = "Calle 18 de calacoto",
            puntuacionTienda = 4.8,
            estadoDeTienda = "15:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR, Nombre_secciones.PARA_DORMIR),
            imagenPrenda = R.drawable.hering_logo
        )

        val somos = Tiendas(
            id = 8,
            nombreTienda = "Somos",
            direccion = "Entrada de achumani",
            puntuacionTienda = 4.6,
            estadoDeTienda = "16:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL),
            imagenPrenda = R.drawable.somos_logo
        )

        val whapa = Tiendas(
            id = 9,
            nombreTienda = "Whapa",
            direccion = "Montenegro por la calle de vainilla",
            puntuacionTienda = 4.2,
            estadoDeTienda = "!3:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL),
            imagenPrenda = R.drawable.whapa_logo
        )

        val e_y_e = Tiendas(
            id = 10,
            nombreTienda = "E&E",
            direccion = "Shopping norte Prado",
            puntuacionTienda = 4.2,
            estadoDeTienda = "12:00 a 21:00",
            tipo = listOf(Nombre_secciones.PARA_DORMIR,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.TROPICAL),
            imagenPrenda = R.drawable.e_y_e_logo
        )

        val levis = Tiendas(
            id = 11,
            nombreTienda = "LEVIS Megacenter",
            direccion = "Megacenter 2do piso",
            puntuacionTienda = 4.7,
            estadoDeTienda = "12:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
            imagenPrenda = R.drawable.levis_logo
        )

        val yuth = Tiendas(
            id = 12,
            nombreTienda = "Yuth",
            direccion = "Calle 21 calacoto frente a la iglesia",
            puntuacionTienda = 4.8,
            estadoDeTienda = "12:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
            imagenPrenda = R.drawable.yuth_logo
        )

        val fair_play = Tiendas(
            id = 13,
            nombreTienda = "Fair play Calacoto",
            direccion = "Calle 21 de calacoto",
            puntuacionTienda = 4.6,
            estadoDeTienda = "14:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
            imagenPrenda = R.drawable.fair_play_logo
        )

        val solmania = Tiendas(
            id = 14,
            nombreTienda = "Solmania",
            direccion = "Montenegro por hotel los delfines",
            puntuacionTienda = 4.1,
            estadoDeTienda = "14:00 a 22:00",
            tipo = listOf(Nombre_secciones.TROPICAL),
            imagenPrenda = R.drawable.solmania_logo
        )

        val women_secret = Tiendas(
            id = 15,
            nombreTienda = "Women Secret",
            direccion = "Montenegro frente al carrusel",
            puntuacionTienda = 4.9,
            estadoDeTienda = "15:00 a 21:00",
            tipo = listOf(Nombre_secciones.TROPICAL,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.PARA_DORMIR),
            imagenPrenda = R.drawable.women_secret
        )

        val lupo = Tiendas(
            id = 16,
            nombreTienda = "Lupo Calacoto",
            direccion = "Calle 21 de calacoto",
            puntuacionTienda = 4.6,
            estadoDeTienda = "14:00 a 20:00",
            tipo = listOf(Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.DEPORTIVO,),
            imagenPrenda = R.drawable.lupo_logo
        )

        val textilon = Tiendas(
            id = 17,
            nombreTienda = "Textilon calacoto",
            direccion = "8261,Avenida 21-Washington",
            puntuacionTienda = 4.5,
            estadoDeTienda = "10:00 a 21:00",
            tipo = listOf(Nombre_secciones.PARA_DORMIR,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.TROPICAL),
            imagenPrenda = R.drawable.textilon_logo
        )

        val sur_modas = Tiendas(
            id = 18,
            nombreTienda = "Sur Modas calacoto",
            direccion = "8261,Avenida 21-Washington",
            puntuacionTienda = 4.7,
            estadoDeTienda = "14:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.FORMAL),
            imagenPrenda = R.drawable.surmoda_logo
        )

        val adidas = Tiendas(
            id = 19,
            nombreTienda = "Adidas calacoto",
            direccion = "8261,Avenida 21-Washington",
            puntuacionTienda = 4.7,
            estadoDeTienda = "11:00 a 21:00",
            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
            imagenPrenda = R.drawable.adidas_logo
        )

        tiendas.add(sur_modas)
        tiendas.add(fair_play)
        tiendas.add(clementine)
        tiendas.add(adidas)
        tiendas.add(textilon)
        tiendas.add(levis)
        tiendas.add(lupo)
        tiendas.add(solmania)
        tiendas.add(women_secret)
        tiendas.add(yuth)
        tiendas.add(e_y_e)

        val listTitulos = mutableListOf<Titulo_seccion>()

        val deportivo = Titulo_seccion(
            texto_titulo_seccion = "Deportivo"
        )

        val de_diario = Titulo_seccion(
            texto_titulo_seccion = "De Diario"
        )
        val formal = Titulo_seccion(
            texto_titulo_seccion = "Formal"
        )
        val ropa_interior = Titulo_seccion(
            texto_titulo_seccion = "Ropa Interior"
        )
        val tropical = Titulo_seccion(
            texto_titulo_seccion = "Tropical"
        )
        val para_dormir = Titulo_seccion(
            texto_titulo_seccion = "Para Dormir"
        )

      //  listTitulos.add(deportivo)
       // listTitulos.add(formal)
        listTitulos.add(de_diario)
 /*       listTitulos.add(ropa_interior)
        listTitulos.add(tropical)
        listTitulos.add(para_dormir)
        */
        titulo_seccionAdapter.addTitulo(listTitulos)

        // tiendasAdapter.addTiendas(tiendas,Nombre_secciones.FORMAL)
tiendasAdapter.addTiendas(tiendas,Nombre_secciones.DE_DIARIO)
/*        val tiendas_deportivas =  tiendasAdapter.addTiendas(tiendas,Nombre_secciones.DEPORTIVO)
        val tiendas_tropical =  tiendasAdapter.addTiendas(tiendas,Nombre_secciones.TROPICAL)
        val tiendas_ropa_interior =  tiendasAdapter.addTiendas(tiendas,Nombre_secciones.ROPA_INTERIOR)
        val tiendas_para_dormir =  tiendasAdapter.addTiendas(tiendas,Nombre_secciones.PARA_DORMIR)*/

        binding.recyclerNombreSeccionTienda.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
            adapter = titulo_seccionAdapter
        }

        binding.recyclerTiendas1.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = tiendasAdapter
        }
        tiendasAdapter.notifyDataSetChanged()
    }
}