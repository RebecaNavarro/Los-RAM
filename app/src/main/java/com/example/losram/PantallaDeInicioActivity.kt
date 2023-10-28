package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.losram.databinding.ActivityPantalladeinicioBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PantallaDeInicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPantalladeinicioBinding
    private lateinit var auth: FirebaseAuth

    val context: Context = this
    val activity: Activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inicializa el binding después de llamar a setContentView
        binding = ActivityPantalladeinicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.crearcuenta.setOnClickListener {
            val intent: Intent = Intent(context, CrearCuentaActivity::class.java)
            startActivity(intent)
        }

        binding.botondeinicio.setOnClickListener {
            loginUser(binding.textocorreootelefono.text.toString(), binding.contrasena.text.toString())
        }

    }

    fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val intent2: Intent = Intent(this, PantallaPrincipalActivivy::class.java)
                    startActivity(intent2)
                } else {
                    // Maneja la autenticación fallida aquí
                }
            }
    }
}
