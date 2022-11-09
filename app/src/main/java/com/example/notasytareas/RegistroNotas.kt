package com.example.notasytareas

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_registro_notas.*

class RegistroNotas : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_notas)

        //Creacion de un metodo en el cual se da click en el boton y manda otra actividad
    }
    fun nuevo(view: View){
        val intent = Intent(this, MainActivity::class.java )
        startActivity(intent)
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
    //Metodo para cuando de click el usuario mande llamar la camara
    fun TakePicture(view : View) {
        startActivity(dispatchTakePictureIntent())
    }

    //OBTENER LA MINIATURA
    /*override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imageView5.setImageBitmap(imageBitmap)

        }
    }*/

    //Metodo para guardar la miniatura de la foto tomada
   // private val starForResult = registerForActivityResult(ActivityResultContracts.StartIntentSenderForResult()){
     //   result: ActivityResult->
       // if (result.resultCode == Activity.RESULT_OK)
        //val intent = result.data
        //val imagebBitmap = intent?.extras?.get("data") as Bitmap
        //ir por el elemento de la vista
        //val imageView = findViewById<ImageView>(R.id.imageView5)
    //    imageView.setImageBitmap(imagebBitmap)
    //}

}

