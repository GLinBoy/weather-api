package com.glinboy.weather.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class HistoricalWeatherResponseDTO(
    val lat: Double,
    val lon: Double,
    val timezone: String,

    @JsonProperty("timezone_offset")
    val timezoneOffset: Long,

    val current: HistoricalWeatherDataDTO,
    val hourly: List<HistoricalWeatherDataDTO>
)