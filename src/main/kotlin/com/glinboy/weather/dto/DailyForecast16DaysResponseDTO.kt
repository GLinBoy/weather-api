package com.glinboy.weather.dto

data class DailyForecast16DaysResponseDTO(
    val city: CityDTO,
    val cod: String,
    val message: Double,
    val cnt: Long,
    val list: List<DailyForecast16DaysDataDTO>
)