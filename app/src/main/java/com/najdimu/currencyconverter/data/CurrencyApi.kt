package com.najdimu.currencyconverter.data

import com.najdimu.currencyconverter.data.models.ConvertResponse
import com.najdimu.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("fixer/convert")
    suspend fun getConvert(
        @Query("apikey") apikey: String,
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: Double
    ): Response<ConvertResponse>

    @GET("fixer/latest")
    suspend fun getRates(
        @Query("apikey") apikey: String
    ): Response<CurrencyResponse>

}