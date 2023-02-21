package com.example.pmdmej10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmdmej10.databinding.EnemigoeventBinding

class EnemigoEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = EnemigoeventBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.luchar.setOnClickListener(){
            startActivity(Intent(this@EnemigoEvent,Blank::class.java))
        }
        binding.huir.setOnClickListener(){
            startActivity(Intent(this@EnemigoEvent,Events::class.java))
        }
    }
}