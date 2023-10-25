package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.losram.databinding.ActivityCrearcuentaBinding
import com.example.losram.databinding.ActivityPantalladeinicioBinding
import com.google.firebase.auth.FirebaseAuth

class pantalladeinicio : AppCompatActivity() {

    private lateinit var binding: ActivityPantalladeinicioBinding
    private lateinit var auth: FirebaseAuth

    val context: Context = this
    val activity: Activity = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalladeinicio)
    }

    fun loginUser(email:String, password:String){
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener{task ->
                if(task.isSuccessful){
                    val intent: Intent = Intent(context, pantallaprincipal::class.java)
                    startActivity(intent)
                }else{}
            }
    }
}