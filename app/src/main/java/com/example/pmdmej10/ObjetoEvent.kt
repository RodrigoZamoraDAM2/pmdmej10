package com.example.pmdmej10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmdmej10.databinding.ObjetoeventBinding

class ObjetoEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ObjetoeventBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.recoger.setOnClickListener(){
            startActivity(Intent(this@ObjetoEvent,Blank::class.java))
        }
        binding.objcontinuar.setOnClickListener(){
            startActivity(Intent(this@ObjetoEvent,Events::class.java))
        }
    }
}