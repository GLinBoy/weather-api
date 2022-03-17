package com.glinboy.weather.dto

data class SearchWeatherResponseDTO(
    val message: String,
    val cod: String,
    val count: Long,
    val list: List<SearchWeatherDataDTO>
)