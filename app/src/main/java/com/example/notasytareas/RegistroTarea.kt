package com.example.notasytareas

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.core.app.ActivityCompat.startActivityForResult
import kotlinx.android.synthetic.main.activity_registro_notas.*

class RegistroTarea : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_tarea)
    }


    //Metodo para cuando de click el usuario mande llamar la camara
    fun Take_Picture(view: View) {
        startActivity(dispatchTakePictureIntent())
    }


////////////////////////////////  TOMAR UNA FOTO  ///////////////////////////////////////

    val REQUEST_IMAGE_CAPTURE = 1

    //metodo para tomar una foto al dar click en el boton de PICTURE
    private fun dispatchTakePictureIntent(): Intent? {
        return Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }



}