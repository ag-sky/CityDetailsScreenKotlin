package com.example.fetchcitydetails.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CityRepository(private val apiService: CityDetailApiService) {
    suspend fun fetchCities(): List<CityDetail> = withContext(Dispatchers.IO) {
        apiService.getCities()
    }
}