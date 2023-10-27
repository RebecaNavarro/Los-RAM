package com.example.losram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.losram.databinding.ActivityUbicacionesBinding
import com.example.losram.fragment.MapaFragment


class UbicacionesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUbicacionesBinding
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

//        val fragment = MapsFragment()
//        supportFragmentManager.commit {
//            replace((binding.mapsFragment.id,fragment))
//        }

    }
}