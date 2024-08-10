package com.ajea.androidbasic12.homework.sebastianverastegui

import com.ajea.androidbasic12.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayInfoActivity : AppCompatActivity() {

    private lateinit var tvNombre: TextView
    private lateinit var tvApellido: TextView
    private lateinit var tvCorreo: TextView
    private lateinit var tvSexo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_info)

        // Inicializamos las vistas usando findViewById
        tvNombre = findViewById(R.id.tvNombre)
        tvApellido = findViewById(R.id.tvApellido)
        tvCorreo = findViewById(R.id.tvCorreo)
        tvSexo = findViewById(R.id.tvSexo)

        // Obtenemos los valores pasados en el Intent
        val nombre = intent.getStringExtra("nombre")
        val apellido = intent.getStringExtra("apellido")
        val correo = intent.getStringExtra("correo")
        val sexo = intent.getStringExtra("sexo")

        // Asignamos los valores a las vistas
        tvNombre.text = "Nombre: $nombre"
        tvApellido.text = "Apellido: $apellido"
        tvCorreo.text = "Correo Electrónico: $correo"
        tvSexo.text = "Sexo: $sexo"
    }
}
