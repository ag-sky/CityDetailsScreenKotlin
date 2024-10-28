package com.example.fetchcitydetails.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.example.fetchcitydetails.data.CityDetail

@Composable
fun CityScreen(
    viewModel: CityViewModel = hiltViewModel()
) {
    val cities = viewModel.cities.collectAsState().value

    LazyColumn {
        items(cities) { city ->
            CityItem(city)
        }
    }
}

@Composable
fun CityItem(city: CityDetail) {
    Text(text = city.name)
}