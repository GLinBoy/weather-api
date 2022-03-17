package com.glinboy.weather.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class RainDTO (
    @JsonProperty("3h")
    val the3H: Double
)
