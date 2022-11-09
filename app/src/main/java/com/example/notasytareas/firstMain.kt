package com.example.notasytareas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class firstMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_main)


        //importar las dependencias de las base de datos en el gradle module
        //en el gradle propiertes poner:
        // android.useAndroidX=true
        //se cambio la version de sdk a la 33

        //codigo para pasar de una pantalla a otra con un determinado tiempo para pasar a la otra ventana
        Handler(Looper.getMainLooper()).postDelayed({
            //abrir otra pantalla de esta a otra
            //un intent es para pasar de una pantalla a otra
            val intent = Intent(this,firstMain::class.java)

            //se indica que quiero que inicie la intencion *intent la variable *
            startActivity(intent)
            //este codigo cierra la pantalla anterior
            //el delay es que va a mandar llamar el otro layaut en 5 segundos
            finish()
        },4000)
    }
}