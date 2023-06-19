package com.example.samplearch.addPhoto.domain.mapper

import com.example.samplearch.addPhoto.data.model.WeatherResponse
import com.example.samplearch.addPhoto.domain.model.WeatherDetails


fun WeatherResponse.toWeatherDetails(): WeatherDetails {
    return with(this) {
        WeatherDetails(
            condition = weather[0].description,
            temp = main?.temp
        )
    }
}
