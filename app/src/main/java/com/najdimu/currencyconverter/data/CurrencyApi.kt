package com.najdimu.currencyconverter.data

import com.najdimu.currencyconverter.data.models.ConvertResponse
import com.najdimu.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("fixer/latest")
    suspend fun getRates(
        @Query("apikey") apikey: String
    ): Response<CurrencyResponse>


    @GET("fixer/latest")
    suspend fun getConvert(
        @Query("apikey") apikey: String,
        @Query("symbols") symbols: String,
        @Query("base") base: String
    ): Response<ConvertResponse>

}