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
}