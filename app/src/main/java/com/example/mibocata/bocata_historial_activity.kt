package com.example.mibocata

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class bocata_historial_activity(context: Context, products: List<Bocata>) : ArrayAdapter<Bocata>(context, 0, products) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item, parent, false)


        val product = getItem(position)


        val nombreBocata = view.findViewById<TextView>(R.id.nombreBocata)
        val fechaBocata = view.findViewById<TextView>(R.id.fechaBocata)



        nombreBocata.text = product?.nombre
        fechaBocata.text =

        return view
    }
}