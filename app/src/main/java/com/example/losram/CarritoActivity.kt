package com.example.losram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.losram.databinding.ActivityCarritoBinding
import com.example.losram.databinding.ActivityRecyclerViewPrendasBinding
import com.example.losram.dataclases.Carrito

class CarritoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCarritoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarritoBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var cantidad: Int = 1
//        var precio: Int = cantidad*

        fun binding(data: Carrito) {

            binding.prendaDesc.text = "" //aca tiene que ir el nombre de la prenda

            binding.mas.setOnClickListener {
                cantidad ++
                binding.prendaCant.text = data.cantidad.toString()

            }

            binding.menos.setOnClickListener {
                cantidad --
                if(cantidad == 0){
                    binding.prendaCant.text = "No hay prendas"
                } else {
                    binding.prendaCant.text = data.cantidad.toString()
                }
            }

            binding.basurero.setOnClickListener{
                binding.prendaDesc.text = "Se borraron las prendas"
            }

        }
    }
}