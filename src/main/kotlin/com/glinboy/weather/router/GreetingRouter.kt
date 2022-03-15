package com.glinboy.weather.router

import com.glinboy.weather.handler.GreetingHandler
import com.glinboy.weather.service.OpenWeatherMapService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RequestPredicates.accept


@Configuration(proxyBeanMethods = false)
class GreetingRouter {
    @Bean
    fun route(greetingHandler: GreetingHandler): RouterFunction<ServerResponse> =
        RouterFunctions
            .route(GET("/").and(accept(MediaType.APPLICATION_JSON)),greetingHandler::hello)

}