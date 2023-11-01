package com.example.losram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.losram.adapter.PrendasAdapter
import com.example.losram.databinding.ActivityRecyclerViewPrendasBinding
import com.example.losram.dataclases.Prendas
import com.example.losram.dataclases.Tiendas
import com.example.losram.models.Favorite
import com.example.losram.models.FavoriteManager
import android.util.Log

class RecyclerViewPrendasActivity : AppCompatActivity(),  PrendasAdapter.OnFavoritoClickListener{

    private lateinit var binding: ActivityRecyclerViewPrendasBinding
    private lateinit var favoritosManager: FavoriteManager
    private val prendasAdapter by lazy { PrendasAdapter() }

    private fun agregarDosFavoritos( nombre: String, position: Int) {
        val listaActual = favoritosManager.obtenerFavoritos().toMutableList()
        Log.d("DEBUG_TAG", "Lista Actual: $listaActual")
        listaActual.add(Favorite(id = position, nombre = nombre))
        Log.d("DEBUG_TAG", "Lista Final: $listaActual")
        favoritosManager.guardarFavoritos(listaActual)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        favoritosManager = FavoriteManager(this)
        setContentView(R.layout.activity_recycler_view_prendas)
        binding = ActivityRecyclerViewPrendasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        filtro = intent.getSerializableExtra("Key_Tienda") as Nombre_tiendas
        iniciarRecyclerView()
    }

    override fun onFavoritoClick(position: Int, nombre: String, id: Int) {
        Toast.makeText(this, "Favorito clickeado en posición $position con nombre $nombre", Toast.LENGTH_SHORT).show()
        agregarDosFavoritos(nombre, position)
        // Todo: set true o false when you clicked on the heart icon
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
                nombrePrenda = "Bikini con cinta cruzada",
                precio = 120,
                imagenPrenda = R.drawable.bikinis7,
                tienda = Nombre_tiendas.TEXTILON,
                disponibilidad = "En el proximo stock"
            ), Prendas(
                descripcion = "a",
                nombrePrenda = "Bikini6",
                precio = 120,
                imagenPrenda = R.drawable.bikinis8,
                tienda = Nombre_tiendas.E_Y_E,
                disponibilidad = "Disponible"
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
            ), Prendas(
                descripcion = "a",
                nombrePrenda = "Bikini Nagro con circulos",
                precio = 120,
                imagenPrenda = R.drawable.bikinis11,
                tienda = Nombre_tiendas.SOLMANIA,
                disponibilidad = "Disponiblee"
            ) )



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
        prendasAdapter.setOnFavoritoClickListener(this)

        binding.recyclerPrendas.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = prendasAdapter

        }

        binding.recyclerPrendas.adapter = prendasAdapter

        //la lista filtrada al adapter de tienda?
    }

}