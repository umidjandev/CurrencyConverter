package com.najdimu.currencyconverter.data.models

data class ConvertResponse(
    val base: String,
    val date: String,
    val rates: Unit,
    val success: Boolean,
    val timestamp: Int
)
