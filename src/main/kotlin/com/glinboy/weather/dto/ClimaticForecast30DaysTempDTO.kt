package com.glinboy.weather.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class ClimaticForecast30DaysTempDTO (
    val average: Double,

    @JsonProperty("average_max")
    val averageMax: Double,

    @JsonProperty("average_min")
    val averageMin: Double,

    @JsonProperty("record_max")
    val recordMax: Double,

    @JsonProperty("record_min")
    val recordMin: Double
)
