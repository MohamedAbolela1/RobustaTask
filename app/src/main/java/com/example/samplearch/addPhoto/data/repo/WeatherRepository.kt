package com.example.samplearch.addPhoto.data.repo

import com.example.samplearch.addPhoto.data.remote.WeatherRemoteDataSource
import com.example.samplearch.addPhoto.data.model.WeatherResponse
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val weatherRemoteDataSource: WeatherRemoteDataSource) {
    suspend fun getWeather(): WeatherResponse? {
        return weatherRemoteDataSource.getWeather()
    }
}