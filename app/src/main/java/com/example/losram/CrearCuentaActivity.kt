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
            val nombreCom = binding.nombreCompletoUsuarioCrearCuenta.text.toString()

            clickCrearCuenta(email, contrasena, usuario, nombreCom)
        }

        binding.botonatras.setOnClickListener {
            val intent3: Intent = Intent(context, PantallaDeInicioActivity::class.java)
            startActivity(intent3)
        }

    }

    fun clickCrearCuenta(email: String, contrasena: String, usuario: String, nombre: String) {//cuando llenamos la contraseña y email
        val TAG = "CrearCuentaTag"

        auth.createUserWithEmailAndPassword(email, contrasena).addOnCompleteListener(this) { task ->
            if (task.isSuccessful) {
                val db = Firebase.firestore

                val user = hashMapOf(
                    "email" to email,
                    "nombreUsuario" to usuario,
                    "nombreCompleto" to nombre
                )

                db.collection("users")
                    .add(user)
                    .addOnSuccessListener { documentReference ->
                        val documentSnapshot = "${documentReference.id}"

                        Log.d(TAG, "DocumentSnapshot added with ID: $documentSnapshot")
                        // Ahora puedes redirigir al usuario a la siguiente pantalla o realizar otras acciones.
                        val intent: Intent = Intent(context, PantallaDeInicioActivity::class.java)
                        startActivity(intent)
                    }
                    .addOnFailureListener { e ->
                        Log.w(TAG, "Error adding document", e)
                        // Manejar el error de Firestore de acuerdo a tus necesidades
                    }
            } else {
            }


        }

    }
}


