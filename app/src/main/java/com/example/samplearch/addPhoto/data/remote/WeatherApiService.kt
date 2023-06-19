package com.example.samplearch.addPhoto.data.remote

import com.example.samplearch.addPhoto.data.model.WeatherResponse
import com.example.samplearch.utils.*
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("weather")
    suspend fun getWeather(
        @Query(AppId) apiKey: String = ApiKey,
        @Query(Q) cityName: String = City,
        @Query(Units) unit: String = Metric
    ): WeatherResponse
}