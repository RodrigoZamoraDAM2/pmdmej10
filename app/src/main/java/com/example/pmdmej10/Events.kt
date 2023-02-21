package com.example.pmdmej10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmdmej10.databinding.EventsBinding
import kotlin.random.Random

class Events : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = EventsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dado.setOnClickListener(){
            val n = Random.nextInt(1,5)

            if (n == 1){
                startActivity(Intent(this@Events,ObjetoEvent::class.java))
            }
            else if (n == 2){
                startActivity(Intent(this@Events,CiudadEvent::class.java))
            }
            else if (n == 3){
                startActivity(Intent(this@Events,MercaderEvent::class.java))
            }
            else {
                startActivity(Intent(this@Events,EnemigoEvent::class.java))
            }
        }

    }
}