package com.example.pmdmej10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmdmej10.databinding.CiudadeventBinding

class CiudadEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = CiudadeventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.entrar.setOnClickListener(){
            startActivity(Intent(this@CiudadEvent,Blank::class.java))
        }
        binding.ciucontinuar.setOnClickListener(){
            startActivity(Intent(this@CiudadEvent,Events::class.java))
        }
    }
}