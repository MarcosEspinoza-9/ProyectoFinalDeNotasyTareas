package com.example.notasytareas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View

class MainActivity : AppCompatActivity() {
    //crear dos variables de tipo boton y de tipo imagen





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //se creo un evento del boton que mandara llamar otro activity layout al precionar el boton de notas
    fun MandaraNotas(view: View) {
        val intent = Intent(this, RegistroNotas::class.java )
        startActivity(intent)
    }

    ////se creo un evento del boton que mandara llamar otro activity layout al precionar el boton de tareas
    fun MandaraTareas(view: View) {
        val intent = Intent(this, RegistroTarea::class.java )
        startActivity(intent)
    }








}

