package com.glinboy.weather.dto

data class SearchWeatherResponse(
    val message: String,
    val cod: String,
    val count: Long,
    val list: List<SearchWeatherData>
)