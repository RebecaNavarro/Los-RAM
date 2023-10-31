package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.losram.databinding.ActivityCrearcuentaBinding
import com.example.losram.dataclases.Perfil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class CrearCuentaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCrearcuentaBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var button: Button

    val context: Context = this
    val activity: Activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearcuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth
        binding.botonenter.setOnClickListener {
            val email = binding.correoOnumTelCrearCuenta.text.toString()
            val contrasena = binding.contrasenhaCrearCuenta.text.toString()
            val usuario = binding.nombreUsuarioCrearCuenta.text.toString()

            clickCrearCuenta(email, contrasena, usuario)
        }

        binding.botonatras.setOnClickListener {
            val intent3: Intent = Intent(context, PantallaDeInicioActivity::class.java)
            startActivity(intent3)
        }

    }

    fun clickCrearCuenta(email: String, contrasena: String, usuario: String) {//cuando llenamos la contraseña y email

        auth.createUserWithEmailAndPassword(email, contrasena).addOnCompleteListener(this) { task ->
            if (task.isSuccessful) {
                actualizarNombreUsuario(usuario)
                val intent: Intent = Intent(context, PantallaDeInicioActivity::class.java)
                startActivity(intent)
            } else {
            }
        }
    }

    private fun actualizarNombreUsuario(nombre: String) {
        val user = auth.currentUser
        val profileUpdates =
            UserProfileChangeRequest.Builder().setDisplayName(nombre).build()
        user?.updateProfile(profileUpdates)
    }
}


