package com.glinboy.weather.dto

data class ClimaticForecast30DaysResponseDTO (
    val cod: String,
    val city: CityDTO,
    val message: Double,
    val list: List<ClimaticForecast30DaysDataDTO>
)
