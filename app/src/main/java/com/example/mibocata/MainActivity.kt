package com.example.mibocata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import tech.developingdeveloper.toaster.DefaultToasterType
import tech.developingdeveloper.toaster.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.user)
        val password = findViewById<EditText>(R.id.password)
        val btnlogin : Button = findViewById(R.id.login)


        btnlogin.setOnClickListener {

            val usercheck = user.text.toString()
            val passwordcheck = password.text.toString()

            if (usercheck == "admin" && passwordcheck == "1234") {
                var intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }else{
                Toaster.pop(
                    this,
                    "Usuario o contraseña incorrectas",
                    Toast.LENGTH_SHORT,
                    DefaultToasterType.ERROR
                ).show()
            }
        }
    }
}