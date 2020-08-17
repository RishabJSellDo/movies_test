package com.raywenderlich.kotlin.coroutines.data.model

data class Result<out T>(val data: T?, val error: Throwable? = null) {
}