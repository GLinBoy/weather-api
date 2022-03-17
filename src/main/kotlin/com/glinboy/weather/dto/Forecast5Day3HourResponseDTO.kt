package com.glinboy.weather.dto

data class Forecast5Day3HourResponseDTO (
    val cod: String,
    val message: Long,
    val cnt: Long,
    val list: List<Forecast5Day3HourResponseDataDTO>,
    val city: CityDTO
)