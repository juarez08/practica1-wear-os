package com.example.actividad2

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.actividad2.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//asigna valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*var leyenda=findViewById<TextView>(R.id.text)
        leyenda.text="saludos a todos"*/

        /*binding.text.text="UNIVERSIDAD"*/


    }
}