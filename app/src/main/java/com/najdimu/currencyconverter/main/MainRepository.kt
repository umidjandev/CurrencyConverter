package com.najdimu.currencyconverter.main

import com.najdimu.currencyconverter.data.models.CurrencyResponse
import com.najdimu.currencyconverter.utils.Resource

interface MainRepository {

    suspend fun getRates(apikey: String): Resource<CurrencyResponse>
}