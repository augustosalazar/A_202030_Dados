package com.uninorte.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
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
        val tvValorDado: TextView = findViewById(R.id.textView)
        tvValorDado.text = valorDado.toString()
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