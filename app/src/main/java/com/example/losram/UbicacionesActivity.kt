package com.example.losram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.losram.databinding.ActivityUbicacionesBinding
import com.example.losram.fragment.MapaFragment


class UbicacionesActivity : AppCompatActivity() {

    lateinit var binding : ActivityUbicacionesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityUbicacionesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val fragment = MapaFragment()
        supportFragmentManager.commit {
            replace(binding.mapa.id, fragment)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }
        setContentView(R.layout.activity_ubicaciones)
        binding = ActivityUbicacionesBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val fragment = MapsFragment()
//        supportFragmentManager.commit {
//            replace((binding.mapsFragment.id,fragment))
//        }

    }
}