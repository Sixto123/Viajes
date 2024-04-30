package com.example.viajes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar el botón
        val btnStart = findViewById<Button>(R.id.btnStart)

        // Configurar el listener del botón
        btnStart.setOnClickListener {
            // Crear un Intent para pasar a SecondActivity
            val intent = Intent(this, DestinosActivity::class.java)
            startActivity(intent)
        }
    }
}