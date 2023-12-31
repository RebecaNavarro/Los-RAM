package com.example.losram

import android.content.Intent
import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.losram.adapter.TiendasAdapter
import com.example.losram.adapter.Titulo_seccionAdapter
import com.example.losram.databinding.ActivityRecyclerViewTiendasBinding
import com.example.losram.RecyclerViewPrendasActivity
import com.example.losram.adapter.PrendasAdapter
import com.example.losram.dataclases.Prendas
import com.example.losram.dataclases.Tiendas
import com.example.losram.dataclases.Titulo_seccion

class RecyclerViewTiendasActivity : AppCompatActivity() {

    val context: Context = this
    val activity: Activity = this

    private lateinit var binding: ActivityRecyclerViewTiendasBinding
    private val tiendasAdapter by lazy {TiendasAdapter() }
    private val titulo_seccionAdapter by lazy { Titulo_seccionAdapter() }
    private val nombres = listOf<Nombre_tiendas>(Nombre_tiendas.SOLMANIA,Nombre_tiendas.WHAPA,Nombre_tiendas.SOMOS,Nombre_tiendas.BIG_SUR)

    //  private val nom by lazy { PrendasAdapter(nombres){navegar(it)} }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_tiendas)
        binding = ActivityRecyclerViewTiendasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        filtro = intent.getSerializableExtra("Key_Seccion") as Nombre_secciones ?: Nombre_secciones.FORMAL
        iniciarRecyclerView()

        binding.atrasTiendas.setOnClickListener {
            val intent: Intent = Intent(context, PantallaPrincipalActivivy::class.java)
            startActivity(intent)
        }

    }
    private lateinit var filtro : Nombre_secciones

    val general : List<Tiendas>  = listOf  (Tiendas(
        id = 1,
        nombreTienda = Nombre_tiendas.CLEMENTINE,
        direccion = "Calle 18 de calacoto",
        puntuacionTienda = 4.3,
        estadoDeTienda = "14:00 a 18:00",
        tipo = listOf(Nombre_secciones.FORMAL),
        imagenPrenda = R.drawable.clementine_logo
    ),Tiendas(
        id = 2,
        nombreTienda = Nombre_tiendas.MANGO,
        direccion = "Horacio Ferrecio #1172, La Paz",
        puntuacionTienda = 4.5,
        estadoDeTienda = "14:00 a 19:00",
        tipo = listOf(Nombre_secciones.FORMAL,Nombre_secciones.DE_DIARIO),
        imagenPrenda = R.drawable.mango_logo
    ),  Tiendas(
        id = 3,
        nombreTienda = Nombre_tiendas.FACE_BOUTIQUE,
        direccion = "Montenegro",
        puntuacionTienda = 4.7,
        estadoDeTienda = "15:00 a 18:00",
        tipo = listOf(Nombre_secciones.FORMAL),
        imagenPrenda = R.drawable.face_logo
    ), Tiendas(
        id = 4,
        nombreTienda = Nombre_tiendas.VICKYS_CASUAL,
        direccion = "Avenida Montenegro 933",
        puntuacionTienda = 4.4,
        estadoDeTienda = "14:00 a 17:00",
        tipo = listOf(Nombre_secciones.FORMAL,Nombre_secciones.DE_DIARIO),
        imagenPrenda = R.drawable.vickys_casual
    ), Tiendas(
        id = 5,
        nombreTienda = Nombre_tiendas.BENNETON,
        direccion = "Montenegro frente al carrusel",
        puntuacionTienda = 4.5,
        estadoDeTienda = "13:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR),
        imagenPrenda = R.drawable.benetton_logo
    ), Tiendas(
        id = 6,
        nombreTienda = Nombre_tiendas.BIG_SUR,
        direccion = "Calle 21 de calacoto",
        puntuacionTienda = 4.5,
        estadoDeTienda = "08:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.PARA_DORMIR,Nombre_secciones.TROPICAL,Nombre_secciones.DEPORTIVO),
        imagenPrenda = R.drawable.big_sur_logo
    ), Tiendas(
        id = 7,
        nombreTienda = Nombre_tiendas.HERING,
        direccion = "Calle 18 de calacoto",
        puntuacionTienda = 4.8,
        estadoDeTienda = "15:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR, Nombre_secciones.PARA_DORMIR),
        imagenPrenda = R.drawable.hering_logo
    ) , Tiendas(
        id = 8,
        nombreTienda = Nombre_tiendas.SOMOS,
        direccion = "Entrada de achumani",
        puntuacionTienda = 4.6,
        estadoDeTienda = "16:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL),
        imagenPrenda = R.drawable.somos_logo
    ) , Tiendas(
        id = 9,
        nombreTienda = Nombre_tiendas.WHAPA,
        direccion = "Montenegro por la calle de vainilla",
        puntuacionTienda = 4.2,
        estadoDeTienda = "!3:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL),
        imagenPrenda = R.drawable.whapa_logo
    ),  Tiendas(
        id = 10,
        nombreTienda = Nombre_tiendas.E_Y_E,
        direccion = "Shopping norte Prado",
        puntuacionTienda = 4.2,
        estadoDeTienda = "12:00 a 21:00",
        tipo = listOf(Nombre_secciones.PARA_DORMIR,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.TROPICAL),
        imagenPrenda = R.drawable.e_y_e_logo
    ), Tiendas(
        id = 11,
        nombreTienda = Nombre_tiendas.LEVIS_MEGACENTER,
        direccion = "Megacenter 2do piso",
        puntuacionTienda = 4.7,
        estadoDeTienda = "12:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
        imagenPrenda = R.drawable.levis_logo
    ) , Tiendas(
        id = 12,
        nombreTienda = Nombre_tiendas.YUTH,
        direccion = "Calle 21 calacoto frente a la iglesia",
        puntuacionTienda = 4.8,
        estadoDeTienda = "12:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
        imagenPrenda = R.drawable.yuth_logo
    ) , Tiendas(
        id = 13,
        nombreTienda = Nombre_tiendas.FAIR_PLAY,
        direccion = "Calle 21 de calacoto",
        puntuacionTienda = 4.6,
        estadoDeTienda = "14:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
        imagenPrenda = R.drawable.fair_play_logo
    ) , Tiendas(
        id = 14,
        nombreTienda = Nombre_tiendas.WOMEN_SECRET,
        direccion = "Montenegro frente al carrusel",
        puntuacionTienda = 4.9,
        estadoDeTienda = "15:00 a 21:00",
        tipo = listOf(Nombre_secciones.TROPICAL,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.PARA_DORMIR),
        imagenPrenda = R.drawable.women_secret
    ) ,  Tiendas(
        id = 15,
        nombreTienda = Nombre_tiendas.LUPO,
        direccion = "Calle 21 de calacoto",
        puntuacionTienda = 4.6,
        estadoDeTienda = "14:00 a 20:00",
        tipo = listOf(Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.DEPORTIVO,),
        imagenPrenda = R.drawable.lupo_logo
    ) , Tiendas(
        id = 16,
        nombreTienda = Nombre_tiendas.TEXTILON,
        direccion = "8261,Avenida 21-Washington",
        puntuacionTienda = 4.5,
        estadoDeTienda = "10:00 a 21:00",
        tipo = listOf(Nombre_secciones.PARA_DORMIR,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.TROPICAL),
        imagenPrenda = R.drawable.textilon_logo
    ), Tiendas(
        id = 17,
        nombreTienda = Nombre_tiendas.SUR_MODA,
        direccion = "8261,Avenida 21-Washington",
        puntuacionTienda = 4.7,
        estadoDeTienda = "14:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.FORMAL),
        imagenPrenda = R.drawable.surmoda_logo
    ), Tiendas(
        id = 18,
        nombreTienda = Nombre_tiendas.ADIDAS,
        direccion = "8261,Avenida 21-Washington",
        puntuacionTienda = 4.7,
        estadoDeTienda = "11:00 a 21:00",
        tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
        imagenPrenda = R.drawable.adidas_logo
    ), Tiendas(
        id = 19,
        nombreTienda = Nombre_tiendas.SOLMANIA,
        direccion = "Por el hotel los delfines montenegro",
        puntuacionTienda = 4.5,
        estadoDeTienda = "10:00 a 17:00",
        tipo = listOf(Nombre_secciones.TROPICAL),
        imagenPrenda = R.drawable.solmania_logo
    ) )





    fun iniciarRecyclerView() {
//
// //val tiendas = mutableListOf<Tiendas>()
//
//
//
//        val clementine = Tiendas(
//            nombreTienda = "Clementine",
//            direccion = "Calle 18 de calacoto",
//            puntuacionTienda = 4.3,
//            estadoDeTienda = "14:00 a 18:00",
//            tipo = listOf(Nombre_secciones.FORMAL),
//            imagenPrenda = R.drawable.clementine_logo
//        )
//        val mango = Tiendas(
//            nombreTienda = "MANGO",
//            direccion = "Horacio Ferrecio #1172, La Paz",
//            puntuacionTienda = 4.5,
//            estadoDeTienda = "14:00 a 19:00",
//            tipo = listOf(Nombre_secciones.FORMAL,Nombre_secciones.DE_DIARIO),
//            imagenPrenda = R.drawable.mango_logo
//        )
//
//        val face_boutique = Tiendas(
//            nombreTienda = "Face Boutique",
//            direccion = "Montenegro",
//            puntuacionTienda = 4.7,
//            estadoDeTienda = "15:00 a 18:00",
//            tipo = listOf(Nombre_secciones.FORMAL),
//            imagenPrenda = R.drawable.face_logo
//        )
//
//        val vickys_casual = Tiendas(
//            nombreTienda = "Vickys casual",
//            direccion = "Avenida Montenegro 933",
//            puntuacionTienda = 4.4,
//            estadoDeTienda = "14:00 a 17:00",
//            tipo = listOf(Nombre_secciones.FORMAL,Nombre_secciones.DE_DIARIO),
//            imagenPrenda = R.drawable.vickys_casual
//        )
//
//        val benneton = Tiendas(
//            nombreTienda = "Benneton",
//            direccion = "Montenegro frente al carrusel",
//            puntuacionTienda = 4.5,
//            estadoDeTienda = "13:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR),
//            imagenPrenda = R.drawable.benetton_logo
//        )
//
//        val big_Sur = Tiendas(
//            nombreTienda = "Big Sur Calacoto",
//            direccion = "Calle 21 de calacoto",
//            puntuacionTienda = 4.5,
//            estadoDeTienda = "08:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.PARA_DORMIR,Nombre_secciones.TROPICAL,Nombre_secciones.DEPORTIVO),
//            imagenPrenda = R.drawable.big_sur_logo
//        )
//
//        val hering = Tiendas(
//            nombreTienda = "HERING",
//            direccion = "Calle 18 de calacoto",
//            puntuacionTienda = 4.8,
//            estadoDeTienda = "15:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL,Nombre_secciones.ROPA_INTERIOR, Nombre_secciones.PARA_DORMIR),
//            imagenPrenda = R.drawable.hering_logo
//        )
//
//        val somos = Tiendas(
//            nombreTienda = "Somos",
//            direccion = "Entrada de achumani",
//            puntuacionTienda = 4.6,
//            estadoDeTienda = "16:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL),
//            imagenPrenda = R.drawable.somos_logo
//        )
//
//        val whapa = Tiendas(
//            nombreTienda = "Whapa",
//            direccion = "Montenegro por la calle de vainilla",
//            puntuacionTienda = 4.2,
//            estadoDeTienda = "!3:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.FORMAL),
//            imagenPrenda = R.drawable.whapa_logo
//        )
//
//        val e_y_e = Tiendas(
//            nombreTienda = "E&E",
//            direccion = "Shopping norte Prado",
//            puntuacionTienda = 4.2,
//            estadoDeTienda = "12:00 a 21:00",
//            tipo = listOf(Nombre_secciones.PARA_DORMIR,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.TROPICAL),
//            imagenPrenda = R.drawable.e_y_e_logo
//        )
//
//        val levis = Tiendas(
//            nombreTienda = "LEVIS Megacenter",
//            direccion = "Megacenter 2do piso",
//            puntuacionTienda = 4.7,
//            estadoDeTienda = "12:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
//            imagenPrenda = R.drawable.levis_logo
//        )
//
//        val yuth = Tiendas(
//            nombreTienda = "Yuth",
//            direccion = "Calle 21 calacoto frente a la iglesia",
//            puntuacionTienda = 4.8,
//            estadoDeTienda = "12:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
//            imagenPrenda = R.drawable.yuth_logo
//        )
//
//        val fair_play = Tiendas(
//            nombreTienda = "Fair play Calacoto",
//            direccion = "Calle 21 de calacoto",
//            puntuacionTienda = 4.6,
//            estadoDeTienda = "14:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
//            imagenPrenda = R.drawable.fair_play_logo
//        )
//
//        val solmania = Tiendas(
//            nombreTienda = "Solmania",
//            direccion = "Montenegro por hotel los delfines",
//            puntuacionTienda = 4.1,
//            estadoDeTienda = "14:00 a 22:00",
//            tipo = listOf(Nombre_secciones.TROPICAL),
//            imagenPrenda = R.drawable.solmania_logo
//        )
//
//        val women_secret = Tiendas(
//            nombreTienda = "Women Secret",
//            direccion = "Montenegro frente al carrusel",
//            puntuacionTienda = 4.9,
//            estadoDeTienda = "15:00 a 21:00",
//            tipo = listOf(Nombre_secciones.TROPICAL,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.PARA_DORMIR),
//            imagenPrenda = R.drawable.women_secret
//        )
//
//        val lupo = Tiendas(
//            nombreTienda = "Lupo Calacoto",
//            direccion = "Calle 21 de calacoto",
//            puntuacionTienda = 4.6,
//            estadoDeTienda = "14:00 a 20:00",
//            tipo = listOf(Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.DEPORTIVO,),
//            imagenPrenda = R.drawable.lupo_logo
//        )
//
//        val textilon = Tiendas(
//            nombreTienda = "Textilon calacoto",
//            direccion = "8261,Avenida 21-Washington",
//            puntuacionTienda = 4.5,
//            estadoDeTienda = "10:00 a 21:00",
//            tipo = listOf(Nombre_secciones.PARA_DORMIR,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.TROPICAL),
//            imagenPrenda = R.drawable.textilon_logo
//        )
//
//        val sur_modas = Tiendas(
//            nombreTienda = "Sur Modas calacoto",
//            direccion = "8261,Avenida 21-Washington",
//            puntuacionTienda = 4.7,
//            estadoDeTienda = "14:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO,Nombre_secciones.ROPA_INTERIOR,Nombre_secciones.FORMAL),
//            imagenPrenda = R.drawable.surmoda_logo
//        )
//
//        val adidas = Tiendas(
//            nombreTienda = "Adidas calacoto",
//            direccion = "8261,Avenida 21-Washington",
//            puntuacionTienda = 4.7,
//            estadoDeTienda = "11:00 a 21:00",
//            tipo = listOf(Nombre_secciones.DE_DIARIO,Nombre_secciones.DEPORTIVO),
//            imagenPrenda = R.drawable.adidas_logo
//        )
//
//        tiendas.add(sur_modas)
//        tiendas.add(fair_play)
//        tiendas.add(clementine)
//        tiendas.add(adidas)
//        tiendas.add(textilon)
//        tiendas.add(levis)
//        tiendas.add(lupo)
//        tiendas.add(solmania)
//        tiendas.add(women_secret)
//        tiendas.add(yuth)

//        val listTitulos = mutableListOf<Titulo_seccion>()
//
//        val deportivo = Titulo_seccion(
//            texto_titulo_seccion = "Deportivo"
//        )
//
//        val de_diario = Titulo_seccion(
//            texto_titulo_seccion = "De Diario"
//        )
//        val formal = Titulo_seccion(
//            texto_titulo_seccion = "Formal"
//        )
//        val ropa_interior = Titulo_seccion(
//            texto_titulo_seccion = "Ropa Interior"
//        )
//        val tropical = Titulo_seccion(
//            texto_titulo_seccion = "Tropical"
//        )
//        val para_dormir = Titulo_seccion(
//            texto_titulo_seccion = "Para Dormir"
//        )

        //  listTitulos.add(deportivo)
        // listTitulos.add(formal)
        //  listTitulos.add(de_diario)
        /*       listTitulos.add(ropa_interior)
               listTitulos.add(tropical)
               listTitulos.add(para_dormir)
               */
//        titulo_seccionAdapter.addTitulo(listTitulos)

        // tiendasAdapter.addTiendas(tiendas,Nombre_secciones.FORMAL)
        tiendasAdapter.addTiendas(general.filter {
            it.tipo.contains(filtro)
        })
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
        /*       binding.textview.setOnClic,,,{
                    navegar(Nombre_tiendas.BIG_SUR,)
                }*/

    }


}