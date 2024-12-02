package com.example.mibocata

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)


        val btn_invoice : ImageView = findViewById(R.id.invoice_icon)
        val btn_profile : ImageView = findViewById(R.id.icon_profile)
        val btn_calendar : ImageView = findViewById(R.id.icon_calendar)

        btn_invoice.setOnClickListener{
            var intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        btn_profile.setOnClickListener{
            var intent = Intent(this, MainActivity3::class.java) //CAMBIAR A LA PANTALLA DEL PERFIL MAINACTIVITY5
            startActivity(intent)
        }
        btn_calendar.setOnClickListener{
            var intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }


    }
}