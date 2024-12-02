package com.example.mibocata

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2);

            val btn_frio : View = findViewById(R.id.view_frio)
            val btn_caliente : View = findViewById(R.id.view_caliente)
            val btn_invoice : ImageView = findViewById(R.id.invoice_icon)
            val btn_profile : ImageView = findViewById(R.id.icon_profile)
            val btn_calendar : ImageView = findViewById(R.id.icon_calendar)

            btn_frio.setOnClickListener {
                var intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
            btn_caliente.setOnClickListener {
                var intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
            btn_invoice.setOnClickListener{
                var intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
            btn_profile.setOnClickListener{
                var intent = Intent(this, MainActivity3::class.java) //CAMBIAR A LA PANTALLA DEL PERFIL MAINACTIVITY5
                startActivity(intent)
            }
            btn_calendar.setOnClickListener{
                var intent = Intent(this, MainActivity4::class.java)  //CAMBIAR A LA PANTALLA DEL CALENDARIO MAINACTIVITY4
                startActivity(intent)
            }



    }
}