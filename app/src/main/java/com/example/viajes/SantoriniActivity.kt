package com.example.viajes

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SantoriniActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_santorini)

        // Obtener referencias a los botones
        val botonInfo: Button = findViewById(R.id.botonInfo)
        val botonInfo1: Button = findViewById(R.id.botonInfo1)
        val botonInfo2: Button = findViewById(R.id.botonInfo2)
        val botonInfo3: Button = findViewById(R.id.botonInfo3)

        // Configurar el clic de los botones para mostrar un mensaje
        botonInfo.setOnClickListener {
            mostrarMensaje()
        }

        botonInfo1.setOnClickListener {
            mostrarMensaje()
        }

        botonInfo2.setOnClickListener {
            mostrarMensaje()
        }

        botonInfo3.setOnClickListener {
            mostrarMensaje()
        }
    }

    // Función para mostrar un mensaje Toast
    private fun mostrarMensaje() {
        Toast.makeText(this, "Se enviarán más detalles por mensaje", Toast.LENGTH_SHORT).show()
    }
}