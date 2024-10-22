package com.example.mibocata

import java.time.LocalDate

data class Bocata(
    val nombre : String,
    val tipo : Boolean,
    val precio : Double,
    val fecha : LocalDate,
    val ingredientes : List<String>,
    val alergenos : List<String>
)