package com.glinboy.weather.handler

import com.glinboy.weather.service.OpenWeatherMapService
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
class WeatherHandler(val weatherService: OpenWeatherMapService) {
    fun climaticForecast30DaysHandler(request: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok().body(weatherService.climaticForecast30Days(request.queryParams()))
    fun historicalWeatherHandler(request: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok().body(weatherService.historicalWeather(request.queryParams()))
    fun forecast5Day3HourHandler(request: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok().body(weatherService.forecast5Day3Hour(request.queryParams()))
    fun searchWeatherHandler(request: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok().body(weatherService.searchWeather(request.queryParams()))
    fun dailyForecast16DaysHandler(request: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok().body(weatherService.dailyForecast16Days(request.queryParams()))
    fun currentWeatherHandler(request: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok().body(weatherService.currentWeather(request.queryParams()))
}