package com.example.notasytareas

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "tblNota")
data class Nota(@PrimaryKey (autoGenerate = true) val uid: Int =0, @ColumnInfo(name= "NotaNombre") val nombre : String?,@ColumnInfo(name= "Titulo") val titulo : String?,@ColumnInfo(name= "NotaDescripcion") val descripcion : String? )
