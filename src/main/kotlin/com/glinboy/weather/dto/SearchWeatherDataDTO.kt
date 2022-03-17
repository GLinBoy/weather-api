package com.glinboy.weather.dto

data class SearchWeatherData (
    val id: Long,
    val name: String,
    val coord: CoordDTO,
    val main: MainDTO,
    val dt: Long,
    val wind: WindDTO,
    val sys: SysDTO,
    val rain: Any? = null,
    val snow: Any? = null,
    val clouds: CloudsDTO,
    val weather: List<WeatherDTO>
)
