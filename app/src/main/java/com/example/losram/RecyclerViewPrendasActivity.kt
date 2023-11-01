package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
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

    val context: Context = this
    val activity: Activity = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_prendas)
        binding = ActivityRecyclerViewPrendasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        filtro = intent.getSerializableExtra("Key_Tienda") as Nombre_tiendas

        iniciarRecyclerView()

        binding.botonatras.setOnClickListener{
            val intent: Intent = Intent(context, RecyclerViewTiendasActivity::class.java)
            startActivity(intent)
        }


    }
    private lateinit var filtro: Nombre_tiendas

    val listaprendas : List<Prendas> = listOf(
        Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini cintura alta",
            precio = 120,
            imagenPrenda = R.drawable.bikinis1,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponible"
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con cadena",
            precio = 120,
            imagenPrenda = R.drawable.bikinis3,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "En el proximo stock"
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini floreado",
            precio = 120,
            imagenPrenda = R.drawable.bikinis9,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini Blanco con piedras",
            precio = 120,
            imagenPrenda = R.drawable.bikinis10,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponiblee"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini Nagro con circulos",
            precio = 120,
            imagenPrenda = R.drawable.bikinis11,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponiblee"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini una pieza",
            precio = 120,
            imagenPrenda = R.drawable.bikinis5,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con falda",
            precio = 120,
            imagenPrenda = R.drawable.bikinis6,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con falda",
            precio = 120,
            imagenPrenda = R.drawable.bikinis14,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con falda",
            precio = 120,
            imagenPrenda = R.drawable.bikinis15,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini",
            precio = 120,
            imagenPrenda = R.drawable.bikinis16,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con cinta cruzada",
            precio = 120,
            imagenPrenda = R.drawable.bikinis7,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "En el proximo stock"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con cinta cruzada",
            precio = 120,
            imagenPrenda = R.drawable.bikinis18,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "En el proximo stock"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con cinta cruzada",
            precio = 120,
            imagenPrenda = R.drawable.bikinis9,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "En el proximo stock"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con cinta cruzada",
            precio = 120,
            imagenPrenda = R.drawable.bikinis11,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "En el proximo stock"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini con cinta cruzada",
            precio = 120,
            imagenPrenda = R.drawable.bikinis1,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "En el proximo stock"
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini6",
            precio = 120,
            imagenPrenda = R.drawable.bikinis18,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini6",
            precio = 120,
            imagenPrenda = R.drawable.bikinis17,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini",
            precio = 120,
            imagenPrenda = R.drawable.bikinis16,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini",
            precio = 120,
            imagenPrenda = R.drawable.bikinis15,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini",
            precio = 120,
            imagenPrenda = R.drawable.bikinis14,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"

            //PRENDAS DEPORTIVAS
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Calsa negra",
            precio = 120,
            imagenPrenda = R.drawable.deportivo10,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
        ),  Prendas(
            descripcion = "a",
            nombrePrenda = "Deportivo",
            precio = 120,
            imagenPrenda = R.drawable.deportivo11,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera Blanca",
            precio = 120,
            imagenPrenda = R.drawable.deportivo12,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Negro",
            precio = 120,
            imagenPrenda = R.drawable.adidas1,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Legins de Hombre",
            precio = 120,
            imagenPrenda = R.drawable.adidas2,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera Roja",
            precio = 120,
            imagenPrenda = R.drawable.play1,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top rosa",
            precio = 120,
            imagenPrenda = R.drawable.play2,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "zapatilas",
            precio = 120,
            imagenPrenda = R.drawable.play3,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top rosa",
            precio = 120,
            imagenPrenda = R.drawable.play4,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top Blanco",
            precio = 120,
            imagenPrenda = R.drawable.play5,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto deportivo",
            precio = 120,
            imagenPrenda = R.drawable.big1,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top Celeste",
            precio = 120,
            imagenPrenda = R.drawable.big2,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top PLomo",
            precio = 120,
            imagenPrenda = R.drawable.big3,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Rosa",
            precio = 120,
            imagenPrenda = R.drawable.big4,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Leguin Plomo",
            precio = 120,
            imagenPrenda = R.drawable.big5,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Rojo",
            precio = 120,
            imagenPrenda = R.drawable.eye1,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top Deportivo",
            precio = 120,
            imagenPrenda = R.drawable.eye2,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Deportivo",
            precio = 120,
            imagenPrenda = R.drawable.eye3,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Calsas Negra",
            precio = 120,
            imagenPrenda = R.drawable.eye4,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Calsa roja",
            precio = 120,
            imagenPrenda = R.drawable.levis1,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Deportivo",
            precio = 120,
            imagenPrenda = R.drawable.levis2,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Guindo",
            precio = 120,
            imagenPrenda = R.drawable.levis3,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conunto Rojo",
            precio = 120,
            imagenPrenda = R.drawable.levis4,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Celeste",
            precio = 120,
            imagenPrenda = R.drawable.levis5,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Calsa Amarilla",
            precio = 120,
            imagenPrenda = R.drawable.yut1,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Deportivo",
            precio = 120,
            imagenPrenda = R.drawable.yut2,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera Negra",
            precio = 120,
            imagenPrenda = R.drawable.yut3,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Calsa ploma",
            precio = 120,
            imagenPrenda = R.drawable.yut4,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Short Rosa",
            precio = 120,
            imagenPrenda = R.drawable.yut5,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Calsa Negra",
            precio = 120,
            imagenPrenda = R.drawable.lupo1,
            tienda = Nombre_tiendas.LUPO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Calsa",
            precio = 120,
            imagenPrenda = R.drawable.lupo2,
            tienda = Nombre_tiendas.LUPO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Verde",
            precio = 120,
            imagenPrenda = R.drawable.lupo3,
            tienda = Nombre_tiendas.LUPO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera Naranja",
            precio = 120,
            imagenPrenda = R.drawable.lupo4,
            tienda = Nombre_tiendas.LUPO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Calsa Celeste",
            precio = 120,
            imagenPrenda = R.drawable.lupo5,
            tienda = Nombre_tiendas.LUPO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Blanco Azul",
            precio = 120,
            imagenPrenda = R.drawable.sur1,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chaqueta Blanca",
            precio = 120,
            imagenPrenda = R.drawable.sur2,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Verde",
            precio = 120,
            imagenPrenda = R.drawable.sur3,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Plomo",
            precio = 120,
            imagenPrenda = R.drawable.sur4,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Negro",
            precio = 120,
            imagenPrenda = R.drawable.sur5,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
            //FORMAL
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Verde",
            precio = 120,
            imagenPrenda = R.drawable.cle1,
            tienda = Nombre_tiendas.CLEMENTINE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Negro",
            precio = 120,
            imagenPrenda = R.drawable.cle2,
            tienda = Nombre_tiendas.CLEMENTINE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Azul",
            precio = 120,
            imagenPrenda = R.drawable.cle3,
            tienda = Nombre_tiendas.CLEMENTINE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Rojo",
            precio = 120,
            imagenPrenda = R.drawable.cle4,
            tienda = Nombre_tiendas.CLEMENTINE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Verde",
            precio = 120,
            imagenPrenda = R.drawable.cle5,
            tienda = Nombre_tiendas.CLEMENTINE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Rojo",
            precio = 120,
            imagenPrenda = R.drawable.mango1,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Con Flores",
            precio = 120,
            imagenPrenda = R.drawable.mango2,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Blanco",
            precio = 120,
            imagenPrenda = R.drawable.mango3,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido de Rosas",
            precio = 120,
            imagenPrenda = R.drawable.mango4,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Blanco con Onddas",
            precio = 120,
            imagenPrenda = R.drawable.mango5,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Rosa",
            precio = 120,
            imagenPrenda = R.drawable.face1,
            tienda = Nombre_tiendas.FACE_BOUTIQUE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Rosa Pastel",
            precio = 120,
            imagenPrenda = R.drawable.face2,
            tienda = Nombre_tiendas.FACE_BOUTIQUE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Negro",
            precio = 120,
            imagenPrenda = R.drawable.face3,
            tienda = Nombre_tiendas.FACE_BOUTIQUE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Plomo",
            precio = 120,
            imagenPrenda = R.drawable.face4,
            tienda = Nombre_tiendas.FACE_BOUTIQUE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Celeste",
            precio = 120,
            imagenPrenda = R.drawable.face5,
            tienda = Nombre_tiendas.FACE_BOUTIQUE,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top y Falda Blanca",
            precio = 120,
            imagenPrenda = R.drawable.vic1,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido con Flores",
            precio = 120,
            imagenPrenda = R.drawable.vic2,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Cafe",
            precio = 120,
            imagenPrenda = R.drawable.vic3,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Blanco",
            precio = 120,
            imagenPrenda = R.drawable.vic4,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Verde Claro",
            precio = 120,
            imagenPrenda = R.drawable.vic5,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Enteriso con Rayas",
            precio = 120,
            imagenPrenda = R.drawable.ben1,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido con Rayas de Zebra",
            precio = 120,
            imagenPrenda = R.drawable.ben2,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Verde",
            precio = 120,
            imagenPrenda = R.drawable.ben3,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Rojo",
            precio = 120,
            imagenPrenda = R.drawable.ben4,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Verde Oscuro",
            precio = 120,
            imagenPrenda = R.drawable.ben5,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"

        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon De licra",
            precio = 120,
            imagenPrenda = R.drawable.big6,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Saco rosado",
            precio = 120,
            imagenPrenda = R.drawable.big7,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon de Licra verde",
            precio = 120,
            imagenPrenda = R.drawable.big8,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon de licra Negro",
            precio = 120,
            imagenPrenda = R.drawable.big9,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Saco Negro",
            precio = 120,
            imagenPrenda = R.drawable.big10,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Amarillo",
            precio = 120,
            imagenPrenda = R.drawable.her1,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido con Puntos",
            precio = 120,
            imagenPrenda = R.drawable.her2,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Enteriso negro",
            precio = 120,
            imagenPrenda = R.drawable.her3,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido con Flores",
            precio = 120,
            imagenPrenda = R.drawable.her4,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido con Flores",
            precio = 120,
            imagenPrenda = R.drawable.her5,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Blusa Blanca",
            precio = 120,
            imagenPrenda = R.drawable.somos1,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto de Jin",
            precio = 120,
            imagenPrenda = R.drawable.somos2,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Plomo",
            precio = 120,
            imagenPrenda = R.drawable.somos3,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chaqueta de Cuero",
            precio = 120,
            imagenPrenda = R.drawable.somos4,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon de Licra Negra",
            precio = 120,
            imagenPrenda = R.drawable.somos5,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Blusa Blanca",
            precio = 120,
            imagenPrenda = R.drawable.sur6,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Saco De beish Claro",
            precio = 120,
            imagenPrenda = R.drawable.sur7,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Blusa Blanca",
            precio = 120,
            imagenPrenda = R.drawable.sur8,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon De licra Beish",
            precio = 120,
            imagenPrenda = R.drawable.sur9,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Traje Negro",
            precio = 120,
            imagenPrenda = R.drawable.sur10,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
            // De Diario
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Yin Azul",
            precio = 120,
            imagenPrenda = R.drawable.mango6,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Falda larga Blanca",
            precio = 120,
            imagenPrenda = R.drawable.mango7,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chaqueta Ploma de Pelusa",
            precio = 120,
            imagenPrenda = R.drawable.mango8,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Negro",
            precio = 120,
            imagenPrenda = R.drawable.mango9,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Blanco",
            precio = 120,
            imagenPrenda = R.drawable.mango10,
            tienda = Nombre_tiendas.MANGO,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Yin Celeste",
            precio = 120,
            imagenPrenda = R.drawable.vic6,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Yin Campana",
            precio = 120,
            imagenPrenda = R.drawable.vic7,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Yin Canpana Con bota pie Azul",
            precio = 120,
            imagenPrenda = R.drawable.vic8,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Verde",
            precio = 120,
            imagenPrenda = R.drawable.vic9,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Falda Larga de Yin",
            precio = 120,
            imagenPrenda = R.drawable.vic10,
            tienda = Nombre_tiendas.VICKYS_CASUAL,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Camisa Cafe",
            precio = 120,
            imagenPrenda = R.drawable.ben6,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Camisa Negra",
            precio = 120,
            imagenPrenda = R.drawable.ben7,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Camisa A Cuadros",
            precio = 120,
            imagenPrenda = R.drawable.ben8,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Rojo",
            precio = 120,
            imagenPrenda = R.drawable.ben9,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Plomo",
            precio = 120,
            imagenPrenda = R.drawable.ben10,
            tienda = Nombre_tiendas.BENNETON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Yin Azul",
            precio = 120,
            imagenPrenda = R.drawable.big11,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera Ploma",
            precio = 120,
            imagenPrenda = R.drawable.big12,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Camisa Beish",
            precio = 120,
            imagenPrenda = R.drawable.big13,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Saco Cafe",
            precio = 120,
            imagenPrenda = R.drawable.big14,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Blusa Negra",
            precio = 120,
            imagenPrenda = R.drawable.big15,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Deportivo",
            precio = 120,
            imagenPrenda = R.drawable.her6,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Camisa Celeste",
            precio = 120,
            imagenPrenda = R.drawable.her7,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Shor De Yin",
            precio = 120,
            imagenPrenda = R.drawable.her8,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Camisa Rosa",
            precio = 120,
            imagenPrenda = R.drawable.her9,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Saco Verde",
            precio = 120,
            imagenPrenda = R.drawable.her10,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polo Verde",
            precio = 120,
            imagenPrenda = R.drawable.somos6,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Yin Azul",
            precio = 120,
            imagenPrenda = R.drawable.somos7,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chaqueta de Yinn",
            precio = 120,
            imagenPrenda = R.drawable.somos8,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polo A Cuadros",
            precio = 120,
            imagenPrenda = R.drawable.somos9,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chaqueta De Yin",
            precio = 120,
            imagenPrenda = R.drawable.somos10,
            tienda = Nombre_tiendas.SOMOS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chompa Con Rayan",
            precio = 120,
            imagenPrenda = R.drawable.wha1,
            tienda = Nombre_tiendas.WHAPA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera a Rayas",
            precio = 120,
            imagenPrenda = R.drawable.wha2,
            tienda = Nombre_tiendas.WHAPA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Blusa Roja",
            precio = 120,
            imagenPrenda = R.drawable.wha3,
            tienda = Nombre_tiendas.WHAPA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chaqueta Rosa",
            precio = 120,
            imagenPrenda = R.drawable.wha4,
            tienda = Nombre_tiendas.WHAPA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Blusa Celeste Pastel",
            precio = 120,
            imagenPrenda = R.drawable.wha5,
            tienda = Nombre_tiendas.WHAPA,
            disponibilidad = "Disponible"
        ), Prendas(
            descripcion = "a",
            nombrePrenda = "Yin celeste",
            precio = 120,
            imagenPrenda = R.drawable.levis6,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Yin Negro",
            precio = 120,
            imagenPrenda = R.drawable.levis7,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chamarra De Colores",
            precio = 120,
            imagenPrenda = R.drawable.levis8,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera Blanca",
            precio = 120,
            imagenPrenda = R.drawable.levis9,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chaqueta De Yin",
            precio = 120,
            imagenPrenda = R.drawable.levis10,
            tienda = Nombre_tiendas.LEVIS_MEGACENTER,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Verde Pastel",
            precio = 120,
            imagenPrenda = R.drawable.yut6,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Negro",
            precio = 120,
            imagenPrenda = R.drawable.yut7,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Azul",
            precio = 120,
            imagenPrenda = R.drawable.yut8,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Blanco",
            precio = 120,
            imagenPrenda = R.drawable.yut9,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Blanco",
            precio = 120,
            imagenPrenda = R.drawable.yut10,
            tienda = Nombre_tiendas.YUTH,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Negro",
            precio = 120,
            imagenPrenda = R.drawable.play6,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Celeste Puma",
            precio = 120,
            imagenPrenda = R.drawable.play7,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Blanco Adidas",
            precio = 120,
            imagenPrenda = R.drawable.play8,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Negro",
            precio = 120,
            imagenPrenda = R.drawable.play9,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chauqueta Verde Adidas",
            precio = 120,
            imagenPrenda = R.drawable.play10,
            tienda = Nombre_tiendas.FAIR_PLAY,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Negro",
            precio = 120,
            imagenPrenda = R.drawable.sur11,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chaqueta Puma",
            precio = 120,
            imagenPrenda = R.drawable.sur12,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera Blanca con bandera",
            precio = 120,
            imagenPrenda = R.drawable.sur13,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Saco de flores",
            precio = 120,
            imagenPrenda = R.drawable.sur14,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Saco beish",
            precio = 120,
            imagenPrenda = R.drawable.sur15,
            tienda = Nombre_tiendas.SUR_MODA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polo Amarillo",
            precio = 120,
            imagenPrenda = R.drawable.adidas3,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Short Negro",
            precio = 120,
            imagenPrenda = R.drawable.adidas4,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Chaqueta Blanca",
            precio = 120,
            imagenPrenda = R.drawable.adidas5,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Shor Negro",
            precio = 120,
            imagenPrenda = R.drawable.adidas6,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Canguro Negro",
            precio = 120,
            imagenPrenda = R.drawable.adidas7,
            tienda = Nombre_tiendas.ADIDAS,
            disponibilidad = "Disponible"
            //pijama
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama PLomo",
            precio = 120,
            imagenPrenda = R.drawable.pijamamujer1,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama osito Espacial",
            precio = 120,
            imagenPrenda = R.drawable.pijamamujer2,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Celeste",
            precio = 120,
            imagenPrenda = R.drawable.pijamamujer3,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Panda",
            precio = 120,
            imagenPrenda = R.drawable.pijamamujer4,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Negro",
            precio = 120,
            imagenPrenda = R.drawable.pijamamujer5,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Conjunto",
            precio = 120,
            imagenPrenda = R.drawable.her11,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Conjunto Rosa",
            precio = 120,
            imagenPrenda = R.drawable.her12,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Conjunto Rosa Pastel",
            precio = 120,
            imagenPrenda = R.drawable.her13,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Conjunto Azul",
            precio = 120,
            imagenPrenda = R.drawable.her14,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Conejo",
            precio = 120,
            imagenPrenda = R.drawable.her15,
            tienda = Nombre_tiendas.HERING,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon Pijama",
            precio = 120,
            imagenPrenda = R.drawable.eye6,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon Pijama Azul",
            precio = 120,
            imagenPrenda = R.drawable.eye7,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon Pijama",
            precio = 120,
            imagenPrenda = R.drawable.eye8,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon Pijama Estrella",
            precio = 120,
            imagenPrenda = R.drawable.eye9,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon Pijama",
            precio = 120,
            imagenPrenda = R.drawable.eye10,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ) ,Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama De flores",
            precio = 120,
            imagenPrenda = R.drawable.women1,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Celeste",
            precio = 120,
            imagenPrenda = R.drawable.women2,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Rosa",
            precio = 120,
            imagenPrenda = R.drawable.women3,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Perrito",
            precio = 120,
            imagenPrenda = R.drawable.women4,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Celeste",
            precio = 120,
            imagenPrenda = R.drawable.women5,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Shor Pijama",
            precio = 120,
            imagenPrenda = R.drawable.tex1,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Rosa",
            precio = 120,
            imagenPrenda = R.drawable.tex2,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Short Pijama",
            precio = 120,
            imagenPrenda = R.drawable.tex3,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pantalon Pijama",
            precio = 120,
            imagenPrenda = R.drawable.tex4,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Pijama Beish",
            precio = 120,
            imagenPrenda = R.drawable.tex5,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
            //TROPICAL
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera Palmera",
            precio = 120,
            imagenPrenda = R.drawable.big16,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Malla Blanca",
            precio = 120,
            imagenPrenda = R.drawable.big17,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Camisa Celeste",
            precio = 120,
            imagenPrenda = R.drawable.big18,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Polera Celeste",
            precio = 120,
            imagenPrenda = R.drawable.big19,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Short Rosa",
            precio = 120,
            imagenPrenda = R.drawable.big20,
            tienda = Nombre_tiendas.BIG_SUR,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top Y Falda de Rosas",
            precio = 120,
            imagenPrenda = R.drawable.eye11,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Traje de Playa",
            precio = 120,
            imagenPrenda = R.drawable.eye12,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top Celeste Marino",
            precio = 120,
            imagenPrenda = R.drawable.eye13,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bata Beish",
            precio = 120,
            imagenPrenda = R.drawable.eye14,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Traje Negro de Playa",
            precio = 120,
            imagenPrenda = R.drawable.eye15,
            tienda = Nombre_tiendas.E_Y_E,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Brasier Con Flores",
            precio = 120,
            imagenPrenda = R.drawable.women6,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Enteriso De Rosa",
            precio = 120,
            imagenPrenda = R.drawable.women7,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top Blanco con Amarillo",
            precio = 120,
            imagenPrenda = R.drawable.women8,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido Con Flores",
            precio = 120,
            imagenPrenda = R.drawable.women9,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Bikini Con Flores Amarillas",
            precio = 120,
            imagenPrenda = R.drawable.women10,
            tienda = Nombre_tiendas.WOMEN_SECRET,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Traje de playa Con flores de colores",
            precio = 120,
            imagenPrenda = R.drawable.tex6,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Top Negro",
            precio = 120,
            imagenPrenda = R.drawable.tex7,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Taje de Playa Con Flores de Colores",
            precio = 120,
            imagenPrenda = R.drawable.tex8,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Traje de Bano",
            precio = 120,
            imagenPrenda = R.drawable.tex9,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Traje de bano",
            precio = 120,
            imagenPrenda = R.drawable.tex6 ,
            tienda = Nombre_tiendas.TEXTILON,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido De playa",
            precio = 120,
            imagenPrenda = R.drawable.sol1 ,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Deportivo",
            precio = 120,
            imagenPrenda = R.drawable.sol2 ,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Enteriso Verde",
            precio = 120,
            imagenPrenda = R.drawable.sol3 ,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Vestido de Playa Blanco Con Flores",
            precio = 120,
            imagenPrenda = R.drawable.sol4 ,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponible"
        ),Prendas(
            descripcion = "a",
            nombrePrenda = "Conjunto Blusa con Falda",
            precio = 120,
            imagenPrenda = R.drawable.sol5 ,
            tienda = Nombre_tiendas.SOLMANIA,
            disponibilidad = "Disponible"
        ))



    fun iniciarRecyclerView(){
/*        prendasAdapter.addPrendas(listaprendas.filter {
          it.tienda.equals(filtro)
        })*/
        val prendasfiltradas = mutableListOf<Prendas>()
        listaprendas.forEach {prenda ->
            if(prenda.tienda.equals(filtro) ) {
                prendasfiltradas.add(prenda)

            }


        }
        prendasAdapter.addPrendas(prendasfiltradas)


        binding.recyclerPrendas.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = prendasAdapter

        }

        binding.recyclerPrendas.adapter = prendasAdapter
        //la lista filtrada al adapter de tienda?


    }

}