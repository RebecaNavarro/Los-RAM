package com.example.losram

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.example.losram.databinding.ActivityPantalladeinicioBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PantallaDeInicioActivity : AppCompatActivity() {

    lateinit var imageButton: ImageButton
    lateinit var editText: EditText

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
        imageButton = findViewById(R.id.showPasswordButton)
        editText = findViewById(R.id.contrasena)


        binding.showPasswordButton.setOnClickListener{
            if (editText.inputType == InputType.TYPE_TEXT_VARIATION_PASSWORD) {
                // Si la contraseña está oculta, muéstrala
                editText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            } else {
                // Si la contraseña está visible, ocúltala
                editText.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
            // Mueve el cursor al final del texto para mantener la visibilidad de la contraseña
            editText.setSelection(editText.text.length)
        }

    }

    fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val intent2: Intent = Intent(this, PantallaPrincipalActivivy::class.java)
//                    intent.putExtra(CLAVE_STRING, email)
                    startActivity(intent2)
                } else {
                    // Maneja la autenticación fallida aquí
                }
            }
    }
}
