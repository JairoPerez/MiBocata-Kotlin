package com.example.mibocata

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2);

            val btnFrio : View = findViewById(R.id.ViewFrio)
            val btnCaliente : View = findViewById(R.id.ViewCaliente)

            btnFrio.setOnClickListener {
            var intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            }
            btnCaliente.setOnClickListener {
                var intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
    }
}