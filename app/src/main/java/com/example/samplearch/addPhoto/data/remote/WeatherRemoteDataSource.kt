package com.example.samplearch.addPhoto.data.remote

import com.example.samplearch.addPhoto.data.model.WeatherResponse
import com.example.samplearch.source.remote.executer.RemoteExecutor
import javax.inject.Inject

class WeatherRemoteDataSource @Inject constructor(private val weatherApiService: WeatherApiService) :
    RemoteExecutor() {
    suspend fun getWeather(): WeatherResponse? {
        return executeApiCall { weatherApiService.getWeather() }
    }
}