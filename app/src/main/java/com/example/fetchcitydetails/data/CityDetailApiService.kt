package com.example.fetchcitydetails.data

import retrofit2.Retrofit
import retrofit2.http.GET

interface CityDetailApiService {
    @GET("/cities")
    suspend fun getCities(): List<CityDetail>
}