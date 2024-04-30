package com.example.viajes

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DestinosActivity : AppCompatActivity() {
    // Declaración de los botones circulares
    private lateinit var btnHome: ImageButton
    private lateinit var btnHoteles: ImageButton
    private lateinit var btnLugares: ImageButton
    private lateinit var btnVuelos: ImageButton

    // Declaración de los botones de imagen
    private lateinit var btnImagen1: ImageButton
    private lateinit var btnImagen2: ImageButton
    private lateinit var btnImagen3: ImageButton
    private lateinit var btnImagen4: ImageButton
    private lateinit var btnImagen5: ImageButton
    private lateinit var btnImagen6: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destinos)

        // Asociar los elementos del layout con las variables
        btnHome = findViewById(R.id.btnHome)
        btnHoteles = findViewById(R.id.btnHoteles)
        btnLugares = findViewById(R.id.btnLugares)
        btnVuelos = findViewById(R.id.btnVuelos)

        btnImagen1 = findViewById(R.id.btnImagen1)
        btnImagen2 = findViewById(R.id.btnImagen2)
        btnImagen3 = findViewById(R.id.btnImagen3)
        btnImagen4 = findViewById(R.id.btnImagen4)
        btnImagen5 = findViewById(R.id.btnImagen5)
        btnImagen6 = findViewById(R.id.btnImagen6)

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

        // Lógica para los botones de imagen
        btnImagen1.setOnClickListener {
            // Agrega aquí la lógica para el botón de imagen 1
            val intent = Intent(this, ParisActivity::class.java)
            startActivity(intent)
        }

        btnImagen2.setOnClickListener {
            // Agrega aquí la lógica para el botón de imagen 2
            val intent = Intent(this, RomaActivity::class.java)
            startActivity(intent)
        }

        btnImagen3.setOnClickListener {
            // Agrega aquí la lógica para el botón de imagen 3
            val intent = Intent(this, TokioActivity::class.java)
            startActivity(intent)
        }

        btnImagen4.setOnClickListener {
            // Agrega aquí la lógica para el botón de imagen 4
            val intent = Intent(this, SantoriniActivity::class.java)
            startActivity(intent)
        }

        btnImagen5.setOnClickListener {
            // Agrega aquí la lógica para el botón de imagen 5
            val intent = Intent(this, BerlinActivity::class.java)
            startActivity(intent)
        }

        btnImagen6.setOnClickListener {
            // Agrega aquí la lógica para el botón de imagen 6
            val intent = Intent(this, DubaiActivity::class.java)
            startActivity(intent)
        }
    }
}