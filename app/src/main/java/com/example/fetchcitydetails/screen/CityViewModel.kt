package com.example.fetchcitydetails.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fetchcitydetails.data.CityDetail
import com.example.fetchcitydetails.data.CityRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CityViewModel(private val repository: CityRepository) : ViewModel() {
    private val _cities = MutableStateFlow<List<CityDetail>>(emptyList())
    val cities: StateFlow<List<CityDetail>> = _cities


    init {
        fetchCities()
    }

    private fun fetchCities() {
        viewModelScope.launch {
            _cities.value = repository.fetchCities()
        }
    }
}