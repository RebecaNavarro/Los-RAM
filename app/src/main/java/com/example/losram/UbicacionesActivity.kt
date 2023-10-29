package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.losram.databinding.ActivityUbicacionesBinding

import com.example.losram.fragment.MapaRehechoFragment

class UbicacionesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUbicacionesBinding

    val context: Context = this
    val activity: Activity = this
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityUbicacionesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.botonatras.setOnClickListener {
            val intent: Intent = Intent(context, PantallaPrincipalActivivy::class.java)
            startActivity(intent)
        }

        val fragment = MapaRehechoFragment()
        supportFragmentManager.commit {
            replace(binding.mapa.id, fragment)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }
    }
}