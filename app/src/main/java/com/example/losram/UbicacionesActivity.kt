package com.example.losram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.losram.databinding.ActivityUbicacionesBinding

import com.example.losram.fragment.MapaRehechoFragment

class UbicacionesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUbicacionesBinding

    lateinit var binding : ActivityUbicacionesBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityUbicacionesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val fragment = MapaRehechoFragment()
        supportFragmentManager.commit {
            replace(binding.mapa.id, fragment)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }
    }
}