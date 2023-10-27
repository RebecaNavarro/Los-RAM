package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.losram.databinding.ActivityCrearcuentaBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class CrearCuentaActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCrearcuentaBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var button: Button

    val context: Context = this
    val activity: Activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCrearcuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth
        binding.botonenter.setOnClickListener{
            clickCrearCuenta(binding.correoOnumTelCrearCuenta.text.toString(),binding.contrasenhaCrearCuenta.text.toString() )
        }

        binding.botonatras.setOnClickListener {
            val intent3: Intent = Intent(context, PantallaDeInicioActivity::class.java)
            startActivity(intent3)
        }

    }

    fun clickCrearCuenta(email:String, contrasena:String){//cuando llenamos la contraseña y email
        auth.createUserWithEmailAndPassword(email,contrasena)
            .addOnCompleteListener(this) { task ->
            if (task.isSuccessful) {
                val intent: Intent = Intent(context, PantallaDeInicioActivity::class.java)
                startActivity(intent)
            } else {}
        }

    }



}