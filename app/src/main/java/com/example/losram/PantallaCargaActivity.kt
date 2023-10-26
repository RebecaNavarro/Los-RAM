package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import com.example.losram.databinding.ActivityPantallaCargaBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class PantallaCargaActivity : AppCompatActivity() {

    val context: Context = this
    val activity: Activity = this

    lateinit var binding: ActivityPantallaCargaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPantallaCargaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val handler = android.os.Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this, PantallaDeInicioActivity::class.java)
            startActivity(intent)
        }, 2000)
    }
//        binding.fondoSuperChero.setOnClickListener{
//            val intent: Intent = Intent(context, PantallaDeInicioActivity::class.java)
//            startActivity(intent)
//        }
//    }

//    class MainActivity : AppCompatActivity() {
//        private lateinit var binding: ActivityMainBinding
//        val context: Context = this
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            binding = ActivityMainBinding.inflate(layoutInflater)
//            setContentView(binding.root)
//            val handler = android.os.Handler(Looper.getMainLooper())
//            handler.postDelayed({
//                val intent = Intent(this, LoginActivity::class.java)
//                startActivity(intent)
//                finish()
//            }, 2000)
//        }
//    }


}