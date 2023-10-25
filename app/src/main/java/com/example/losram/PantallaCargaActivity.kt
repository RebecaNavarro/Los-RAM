package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.losram.databinding.ActivityCrearcuentaBinding
import com.example.losram.databinding.ActivityPantallaCargaBinding
import com.example.losram.databinding.ActivityPantalladeinicioBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PantallaCargaActivity : AppCompatActivity() {

    val context: Context = this
    val activity: Activity = this

    //lateinit var binding: ActivityPantallaCargaBinding
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding= ActivityPantallaCargaBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_pantalla_carga)

        imageView = findViewById(R.id.fondo_super_chero)

        imageView.setOnClickListener{
            val intent: Intent = Intent(context, PantallaDeInicioActivity::class.java)
            startActivity(intent)
        }

//        binding.fondoSuperChero.setOnClickListener{
//            val intent: Intent = Intent(context, PantallaDeInicioActivity::class.java)
//            startActivity(intent)
//        }
    }



}