package com.example.samplearch.addPhoto.data.model

import com.squareup.moshi.Json

data class WeatherResponse(
    @Json(name = "weather")
    val weather: List<Weather>,
    @Json(name = "main")
    val main: Main?

){
    data class Weather(
        @Json(name = "description")
        val description: String?
    )

    data class Main(
        val temp: Float
    )
}
