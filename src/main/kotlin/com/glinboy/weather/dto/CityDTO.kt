package com.glinboy.weather.dto

data class CityDTO(
    val id: Long,
    val name: String,
    val coord: CoordDTO,
    val country: String,
    val population: Long,
    val timezone: Long,
    val sunrise: Long,
    val sunset: Long,
)
