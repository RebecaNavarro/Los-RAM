package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.losram.adapter.BotonesSeccionesAdapter
import com.example.losram.databinding.ActivityPantallaprincipalBinding
import com.example.losram.databinding.ActivityPerfilBinding
import com.example.losram.dataclases.Perfil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class PerfilActivity : AppCompatActivity() {

    val TAG = "CrearCuentaTag"

    private lateinit var binding: ActivityPerfilBinding

    val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cerrarsesion.setOnClickListener {
            val intent2: Intent = Intent(context, PantallaDeInicioActivity::class.java)
            startActivity(intent2)
        }

        binding.botonatras.setOnClickListener {
            val intent3: Intent = Intent(context, PantallaPrincipalActivivy::class.java)
            startActivity(intent3)
        }

        val db = Firebase.firestore

        val userEmail = "correo@ejemplo.com"

//        db.collection("users").document(userEmail)
//            .get()
//            .addOnSuccessListener { documentSnapshot ->
//                if (documentSnapshot.exists()) {
//                    val userData = documentSnapshot.data
//                    if (userData != null) {
//                        var nombreUsuario = userData["nombreUsuario"] as String
//
//                        // Asigna el nombre de usuario a un elemento de la interfaz de usuario
//                        binding.infousuario.text = nombreUsuario
//
//                        var nombreCompleto = userData["nombreCompleto"] as String
//
//                        // Asigna el nombre de usuario a un elemento de la interfaz de usuario
//                        binding.infonombre.text = nombreCompleto
//                    }
//                }
//
//            }

//        db.collection("users").document(userEmail)
//            .get()
//            .addOnSuccessListener { documentSnapshot ->
//                if (documentSnapshot.exists()) {
//                    val userData = documentSnapshot.data
//                    if (userData != null) {
//                        val nombreUsuario = userData["nombreUsuario"] as String
//                        val nombreCompleto = userData["nombreCompleto"] as String
//
//                        // Asigna el nombre de usuario a un elemento de la interfaz de usuario
//                        binding.infousuario.text = nombreUsuario
//
//                        // Asigna el nombre completo a otro elemento de la interfaz de usuario
//                        binding.infonombre.text = nombreCompleto
//                    }
//                }
//            }


        db.collection("users").document(userEmail)
            .get()
            .addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {
                    val userData = documentSnapshot.data
                    if (userData != null) {
                        val nombreUsuario = userData["nombreUsuario"] as String
                        val nombreCompleto = userData["nombreCompleto"] as String

                        Log.d(TAG, "Nombre de usuario: $nombreUsuario, Nombre completo: $nombreCompleto")

                        val perfil = Perfil(
                            usuario = nombreUsuario,
                            nombre = nombreCompleto)
                        binding.infousuario.text = perfil.usuario
                        binding.infonombre.text = perfil.nombre

                        // Puedes hacer más con la instancia de perfil si es necesario
                    }
                }
            }


    }
}