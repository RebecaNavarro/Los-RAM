package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.losram.databinding.ActivityPantallaCargaBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class PantallaCargaActivity : AppCompatActivity() {

    val context: Context = this
    val activity: Activity = this

    lateinit var binding: ActivityPantallaCargaBinding
    //lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPantallaCargaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fondoSuperChero.setOnClickListener{
            val intent: Intent = Intent(context, PantallaDeInicioActivity::class.java)
            startActivity(intent)
        }
    }



}