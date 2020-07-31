package com.uninorte.dados

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // aquí cargamos el layout
        setContentView(R.layout.activity_main)

    }

    private fun lanzarDado() {
        // instanciamos un dado con 6 lados
        val dado = Dado(6)
        val valorDado = dado.lanzar()
        // el método findById permite conectar una instancia de TextView con nuestra variable
        // el Id es el mismo que declaramos en el Layout
        val imagenDado: ImageView = findViewById(R.id.imageView)
        // dependiendo del valor del dado cargamos el recurso
        when (valorDado) {
            1 -> imagenDado.setImageResource(R.drawable.dice_1)
            2 -> imagenDado.setImageResource(R.drawable.dice_2)
            3 -> imagenDado.setImageResource(R.drawable.dice_3)
            4 -> imagenDado.setImageResource(R.drawable.dice_4)
            5 -> imagenDado.setImageResource(R.drawable.dice_5)
            6 -> imagenDado.setImageResource(R.drawable.dice_6)
        }
    }

    // método que se llama cada vez que se presiona el botón
    fun onClickLanzarDado(view: View) {
        // Mensaje visible por el usuario en la pantalla
        Toast.makeText(this, "Dado lanzado",Toast.LENGTH_LONG).show()
        // Mensaje para tiempo de desarrollo, solo visible en la consola de
        // logcat en AndroidStudio
        Log.d("AplicacionDados", "Dado lanzado")
        lanzarDado();
    }


}