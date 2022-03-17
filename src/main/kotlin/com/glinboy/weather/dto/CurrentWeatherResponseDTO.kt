package com.glinboy.weather.dto

data class CurrentWeatherResponseDTO(
    val coord: CoordDTO,
    val weather: List<WeatherDTO>,
    val base: String,
    val main: MainDTO,
    val visibility: Long,
    val wind: WindDTO,
    val clouds: CloudsDTO,
    val dt: Long,
    val sys: SysDTO,
    val timezone: Long,
    val id: Long,
    val name: String,
    val cod: Long
)
