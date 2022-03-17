package com.glinboy.weather.service.impl

import com.glinboy.weather.dto.*
import com.glinboy.weather.service.OpenWeatherMapService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.util.MultiValueMap
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.server.ResponseStatusException
import reactor.core.publisher.Mono

@Service
class OpenWeatherMapServiceImpl : OpenWeatherMapService {

    @Value("\${application.secrets.key}")
    private val key: String? = null
    @Value("\${application.secrets.host}")
    private val host: String? = null

    private val client: WebClient =
        WebClient.create("https://community-open-weather-map.p.rapidapi.com")
    val logger: Logger = LoggerFactory.getLogger(OpenWeatherMapServiceImpl::class.java)

    override fun climaticForecast30Days(parameters: MultiValueMap<String, String>): Mono<ClimaticForecast30DaysResponseDTO> {
        return client
            .get()
            .uri {
                it.path("/climate/month").queryParams(parameters).build()
            }
            .headers {
                it.set("x-rapidapi-key", key)
                it.set("x-rapidapi-host", host)
            }
            .retrieve()
            .bodyToMono(ClimaticForecast30DaysResponseDTO::class.java)
    }

    override fun historicalWeather(parameters: MultiValueMap<String, String>): Mono<HistoricalWeatherResponseDTO> {
        return client
            .get()
            .uri {
                it.path("/onecall/timemachine").queryParams(parameters).build()
            }
            .headers {
                it.set("x-rapidapi-key", key)
                it.set("x-rapidapi-host", host)
            }
            .retrieve()
            .bodyToMono(HistoricalWeatherResponseDTO::class.java)
            .onErrorResume {
                Mono.error(
                    ResponseStatusException(
                        HttpStatus.BAD_REQUEST,
                        "username is required", it
                    )
                )
            }
    }

    override fun forecast5Day3Hour(parameters: MultiValueMap<String, String>): Mono<Forecast5Day3HourResponseDTO> {
        return client
            .get()
            .uri {
                it.path("/forecast").queryParams(parameters).build()
            }
            .headers {
                it.set("x-rapidapi-key", key)
                it.set("x-rapidapi-host", host)
            }
            .retrieve()
            .bodyToMono(Forecast5Day3HourResponseDTO::class.java)
    }

    override fun searchWeather(parameters: MultiValueMap<String, String>): Mono<SearchWeatherResponseDTO> {
        return client
            .get()
            .uri {
                it.path("/find").queryParams(parameters).build()
            }
            .headers {
                it.set("x-rapidapi-key", key)
                it.set("x-rapidapi-host", host)
            }
            .retrieve()
            .bodyToMono(SearchWeatherResponseDTO::class.java)
    }

}