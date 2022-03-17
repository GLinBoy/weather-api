package com.glinboy.weather.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Forecast5Day3HourMainDTO (
    val temp: Double,

    @JsonProperty("feels_like")
    val feelsLike: Double,

    @JsonProperty("temp_min")
    val tempMin: Double,

    @JsonProperty("temp_max")
    val tempMax: Double,

    val pressure: Long,

    @JsonProperty("sea_level")
    val seaLevel: Long,

    @JsonProperty("grnd_level")
    val grndLevel: Long,

    val humidity: Long,

    @JsonProperty("temp_kf")
    val tempKf: Double
)
