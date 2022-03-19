package com.glinboy.weather.router

import com.glinboy.weather.handler.WeatherHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration(proxyBeanMethods = false)
class WeatherRouter {
    @Bean
    fun weatherRoute(weatherHandler: WeatherHandler): RouterFunction<ServerResponse> =
        RouterFunctions
            .route(
                RequestPredicates.GET("/weather/climate/month")
                    .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                weatherHandler::climaticForecast30DaysHandler)
            .andRoute(
                RequestPredicates.GET("/weather/onecall/timemachine")
                    .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                weatherHandler::historicalWeatherHandler)