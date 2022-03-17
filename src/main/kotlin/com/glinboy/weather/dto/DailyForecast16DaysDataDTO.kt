package com.glinboy.weather.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class DailyForecast16DaysDataDTO (
    val dt: Long,
    val sunrise: Long,
    val sunset: Long,
    val temp: TempDTO,

    @JsonProperty("feels_like")
    val feelsLike: FeelsLikeDTO,

    val pressure: Long,
    val humidity: Long,
    val weather: List<WeatherDTO>,
    val speed: Double,
    val deg: Long,
    val gust: Double,
    val clouds: Long,
    val pop: Double,
    val rain: Double? = null
)
