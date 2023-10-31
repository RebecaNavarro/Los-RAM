package com.example.losram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.losram.adapter.CarritoAdapter
import com.example.losram.databinding.ActivityCarritoBinding
import com.example.losram.dataclases.Prendas

class CarritoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCarritoBinding
    private lateinit var adapter: CarritoAdapter

    var carroCompras = ArrayList<Prendas>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        carroCompras = intent.getSerializableExtra("carro_compras") as ArrayList<Prendas>

        setupRecyclerView()
    }

    fun setupRecyclerView() {
        binding.rvListaCarro.layoutManager = LinearLayoutManager(this)
        adapter = CarritoAdapter(binding.tvTotal, carroCompras)
        binding.rvListaCarro.adapter = adapter
    }
}