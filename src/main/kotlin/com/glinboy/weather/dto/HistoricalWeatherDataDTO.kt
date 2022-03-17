package com.glinboy.weather.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class HistoricalWeatherDataDTO (
    val dt: Long,
    val sunrise: Long? = null,
    val sunset: Long? = null,
    val temp: Double,

    @JsonProperty("feels_like")
    val feelsLike: Double,

    val pressure: Long,
    val humidity: Long,

    @JsonProperty("dew_point")
    val dewPoint: Double,

    val uvi: Double,
    val clouds: Long,
    val visibility: Long,

    @JsonProperty("wind_speed")
    val windSpeed: Double,

    @JsonProperty("wind_deg")
    val windDeg: Long,

    @JsonProperty("wind_gust")
    val windGust: Double,

    val weather: List<WeatherDTO>
)
