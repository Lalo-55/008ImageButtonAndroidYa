package com.luismorales17106494.a008_controlimagebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luismorales17106494.a008_controlimagebutton.databinding.ActivityMainBinding

/*
    8 - Control ImageButton
Hemos visto la creación de objetos de la clase Button,
ahora veremos otra clase muy similar a la anterior llamada ImageButton
que tiene la misma filosofía de manejo con la diferencia que puede
mostrar una imagen en su superficie.


Problema:
Disponer un objeto de la clase ImageButton que muestre una imagen
de un teléfono. Cuando se presione mostrar en un control TextView
el mensaje "Llamando".



 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ibCancelar.setOnClickListener(){
            binding.tvAccion.text = "Cancelado"
        }
    }
}