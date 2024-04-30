package com.example.viajes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class LugaresActivity : AppCompatActivity() {

    // Declaración de los botones circulares
    private lateinit var btnHome: ImageButton
    private lateinit var btnHoteles: ImageButton
    private lateinit var btnLugares: ImageButton
    private lateinit var btnVuelos: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lugares)

        // Asociar los elementos del layout con las variables
        btnHome = findViewById(R.id.btnHome)
        btnHoteles = findViewById(R.id.btnHoteles)
        btnLugares = findViewById(R.id.btnLugares)
        btnVuelos = findViewById(R.id.btnVuelos)

        // Asignar botones
        val lugar1Button: Button = findViewById(R.id.lugar1Button)
        val lugar2Button: Button = findViewById(R.id.lugar2Button)
        val lugar3Button: Button = findViewById(R.id.lugar3Button)
        val lugar4Button: Button = findViewById(R.id.lugar4Button)
        val lugar5Button: Button = findViewById(R.id.lugar5Button)

        // Lógica para los botones circulares
        btnHome.setOnClickListener {
            // Agrega aquí la lógica para el botón Home
            val intent = Intent(this, DestinosActivity::class.java)
            startActivity(intent)
        }

        btnHoteles.setOnClickListener {
            // Agrega aquí la lógica para el botón Hoteles
            val intent = Intent(this, HotelesActivity::class.java)
            startActivity(intent)
        }

        btnLugares.setOnClickListener {
            // Agrega aquí la lógica para el botón Lugares
            val intent = Intent(this, LugaresActivity::class.java)
            startActivity(intent)
        }

        btnVuelos.setOnClickListener {
            // Agrega aquí la lógica para el botón Vuelos
            val intent = Intent(this, VuelosActivity::class.java)
            startActivity(intent)
        }

        // Configurar OnClickListener para cada botón
        lugar1Button.setOnClickListener {
            mostrarMensaje()
        }

        lugar2Button.setOnClickListener {
            mostrarMensaje()
        }

        lugar3Button.setOnClickListener {
            mostrarMensaje()
        }

        lugar4Button.setOnClickListener {
            mostrarMensaje()
        }

        lugar5Button.setOnClickListener {
            mostrarMensaje()
        }
    }

    // Función para mostrar un mensaje
    private fun mostrarMensaje() {
        val mensaje = "Se enviará mas informacion a su correo electronico."
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}