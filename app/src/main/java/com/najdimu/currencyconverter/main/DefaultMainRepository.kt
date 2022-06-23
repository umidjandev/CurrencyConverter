package com.najdimu.currencyconverter.main

import com.najdimu.currencyconverter.data.CurrencyApi
import com.najdimu.currencyconverter.data.models.ConvertResponse
import com.najdimu.currencyconverter.data.models.CurrencyResponse
import com.najdimu.currencyconverter.utils.Resource
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
): MainRepository {
    override suspend fun getRates(apikey: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(apikey)
            val result = response.body()
            if (response.isSuccessful && result != null) {
                Resource.Success(result)
            }else{
                Resource.Error(response.message())
            }

        }catch (e: Exception){
            Resource.Error(e.message ?: "An error occurred")
        }
    }

    override suspend fun getConvert(
        apikey: String,
        base: String,
        symbols: String
    ): Resource<ConvertResponse> {
        return try {
            val response = api.getConvert(apikey, base, symbols)
            val result = response.body()
            if (response.isSuccessful && result != null) {
                Resource.Success(result)
            }else{
                Resource.Error(response.message())
            }

        }catch (e: Exception){
            Resource.Error(e.message ?: "An error occurred")
        }
    }
}