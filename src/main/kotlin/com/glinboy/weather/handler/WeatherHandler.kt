package com.glinboy.weather.handler

import com.glinboy.weather.service.OpenWeatherMapService
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
class WeatherHandler(val weatherService: OpenWeatherMapService) {
}