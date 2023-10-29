package com.example.losram.dataclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.losram.R
import com.example.losram.adapter.PrendasAdapter
import com.example.losram.databinding.ActivityRecyclerViewPrendasBinding

class RecyclerViewPrendasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewPrendasBinding
    private val prendasAdapter by lazy { PrendasAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_prendas)
        binding = ActivityRecyclerViewPrendasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciarRecyclerView()
    }
    fun iniciarRecyclerView(){

        val listaprendas = mutableListOf<Prendas>()


    }
}