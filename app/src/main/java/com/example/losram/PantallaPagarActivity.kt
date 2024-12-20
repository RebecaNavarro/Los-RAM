package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.losram.databinding.ActivityCrearcuentaBinding
import com.example.losram.databinding.ActivityGraciasBinding
import com.example.losram.databinding.ActivityPantallaPagarBinding
import com.google.firebase.auth.FirebaseAuth

class PantallaPagarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaPagarBinding
    private lateinit var auth: FirebaseAuth

    val context: Context = this
    val activity: Activity = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaPagarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonenter.setOnClickListener{
            val intent2 :Intent = Intent(context, GraciasActivity::class.java)
            startActivity(intent2)
        }
    }
}
