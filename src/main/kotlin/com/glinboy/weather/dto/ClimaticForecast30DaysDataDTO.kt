package com.glinboy.weather.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class ClimaticForecast30DaysDataDTO (
    val dt: Long,
    val humidity: Double,
    val pressure: Double,
    val temp: ClimaticForecast30DaysTempDTO,

    @JsonProperty("wind_speed")
    val windSpeed: Double
)
