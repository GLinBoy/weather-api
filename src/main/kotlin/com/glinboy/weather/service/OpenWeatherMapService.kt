package com.glinboy.weather.service

import com.glinboy.weather.dto.*
import org.springframework.util.MultiValueMap
import reactor.core.publisher.Mono

interface OpenWeatherMapService {
    fun climaticForecast30Days(parameters: MultiValueMap<String, String>): Mono<ClimaticForecast30DaysResponseDTO>
    fun historicalWeather(parameters: MultiValueMap<String, String>): Mono<HistoricalWeatherResponseDTO>
    fun forecast5Day3Hour(parameters: MultiValueMap<String, String>): Mono<Forecast5Day3HourResponseDTO>
}