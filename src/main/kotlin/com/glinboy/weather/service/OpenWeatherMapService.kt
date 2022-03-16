package com.glinboy.weather.service

import com.glinboy.weather.dto.*
import org.springframework.util.MultiValueMap
import reactor.core.publisher.Mono

interface OpenWeatherMapService {
    fun climaticForecast30Days(parameters: MultiValueMap<String, String>): Mono<ClimaticForecast30DaysResponseDTO>
}