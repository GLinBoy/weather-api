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
            .andRoute(
                RequestPredicates.GET("/weather/forecast")
                    .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                weatherHandler::forecast5Day3HourHandler)
            .andRoute(
                RequestPredicates.GET("/weather/find")
                    .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                weatherHandler::searchWeatherHandler)
            .andRoute(
                RequestPredicates.GET("/weather/forecast/daily")
                    .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                weatherHandler::dailyForecast16DaysHandler)
            .andRoute(
                RequestPredicates.GET("/weather")
                    .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                weatherHandler::currentWeatherHandler)
}