package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.losram.databinding.ActivityPantallaprincipalBinding
import com.example.losram.databinding.ActivityPerfilBinding
import com.example.losram.dataclases.Perfil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class PerfilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPerfilBinding
    private var user = FirebaseAuth.getInstance().currentUser

    val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.infoemail.text = user?.email ?: "email.ejemplo@gmail.com"
        binding.infousuario.text = user?.displayName ?: "Lola Juarez"


        binding.cerrarsesion.setOnClickListener {
            val intent2: Intent = Intent(context, PantallaDeInicioActivity::class.java)
            startActivity(intent2)
        }

        binding.botonatras.setOnClickListener {
            val intent3: Intent = Intent(context, PantallaPrincipalActivivy::class.java)
            startActivity(intent3)
        }



    }
}