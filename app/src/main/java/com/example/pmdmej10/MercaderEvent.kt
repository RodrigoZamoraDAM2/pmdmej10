package com.example.pmdmej10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmdmej10.databinding.MercadereventBinding

class MercaderEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = MercadereventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.comerciar.setOnClickListener(){
            startActivity(Intent(this@MercaderEvent,Blank::class.java))
        }
        binding.mercontinuar.setOnClickListener(){
            startActivity(Intent(this@MercaderEvent,Events::class.java))
        }

    }
}