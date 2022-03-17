package com.glinboy.weather.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Forecast5Day3HourResponseDataDTO (
    val dt: Long,
    val main: Forecast5Day3HourMainDTO,
    val weather: List<WeatherDTO>,
    val clouds: CloudsDTO,
    val wind: WindDTO,
    val visibility: Long,
    val pop: Double,
    val sys: Forecast5Day3HourSysDTO,

    @JsonProperty("dt_txt")
    val dtTxt: String,

    val rain: RainDTO? = null
)
