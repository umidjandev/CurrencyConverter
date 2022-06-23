package com.najdimu.currencyconverter.utils

sealed class ResourceConvert<T>(val data: T?, val message: String?) {
    class Success<T>(data: T?): ResourceConvert<T>(data, null)
    class Error<T>(message: String): ResourceConvert<T>(null, message)

}