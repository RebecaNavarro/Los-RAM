package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.losram.databinding.ActivityCrearcuentaBinding
import com.example.losram.databinding.ActivityPantallaCargaBinding
import com.example.losram.databinding.ActivityPantalladeinicioBinding
import com.google.firebase.auth.FirebaseAuth

class PantallaDeInicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPantalladeinicioBinding
    private lateinit var auth: FirebaseAuth
    lateinit var textView: TextView

    val context: Context = this
    val activity: Activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalladeinicio)

        textView = findViewById(R.id.crearcuenta)

        textView.setOnClickListener{
            val intent: Intent = Intent(context, CrearCuentaActivity::class.java)
            startActivity(intent)
        }


//        setContentView(binding.root)
//
//        binding = ActivityPantalladeinicioBinding.inflate(layoutInflater)
//        binding.crearcuenta.setOnClickListener {
//            val intent: Intent = Intent(context, CrearCuentaActivity::class.java)
//            startActivity(intent)
//        }
    }

    fun loginUser(email:String, password:String){
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener{task ->
                if(task.isSuccessful){
                    val intent: Intent = Intent(context, PantallaPrincipalActivivy::class.java)
                    startActivity(intent)
                }else{}
            }
    }

}