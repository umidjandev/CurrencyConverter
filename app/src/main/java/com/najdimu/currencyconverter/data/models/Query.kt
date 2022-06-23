package com.najdimu.currencyconverter.data.models

data class Query(
    val amount: Double,
    val from: String,
    val to: String
)