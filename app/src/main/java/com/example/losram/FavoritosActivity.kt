package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.losram.databinding.ActivityFavoritosBinding
import com.example.losram.databinding.ActivityPerfilBinding

class FavoritosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoritosBinding

    val context: Context = this
    val activity: Activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFavoritosBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.botonatras.setOnClickListener {
            val intent: Intent = Intent(context, PantallaPrincipalActivivy::class.java)
            startActivity(intent)
        }
    }
}