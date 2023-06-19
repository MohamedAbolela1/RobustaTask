package com.example.samplearch.addPhoto.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.samplearch.addPhoto.data.model.WeatherResponse
import com.example.samplearch.addPhoto.data.repo.SavePhotoRepository
import com.example.samplearch.addPhoto.data.repo.WeatherRepository
import com.example.samplearch.addPhoto.domain.mapper.toWeatherDetails
import com.example.samplearch.addPhoto.domain.model.WeatherDetails
import com.example.samplearch.base.BaseViewModel
import com.example.samplearch.model.ErrorTypes
import com.example.samplearch.model.ViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddNewPhotoViewModel @Inject constructor(
    private val addPhoto: SavePhotoRepository,
    private val getDetails: WeatherRepository
) : BaseViewModel() {

    private val _weatherState =
        MutableLiveData<ViewState<WeatherDetails>>()
    val weatherState: LiveData<ViewState<WeatherDetails>> =
        _weatherState

    init {
        getWeatherService()
    }

     private fun getWeatherService() {
        viewModelScope.launch {
            val dataState = executeProductsListState()
            if (dataState is ViewState.Success)
            emitWeatherSate(dataState)
        }
    }

    private suspend fun executeProductsListState(): ViewState<WeatherDetails> {
        val customizedServicesState =
            validateResponse { getDetails.getWeather() }
        return mapWeatherState(customizedServicesState)
    }

    private fun mapWeatherState(state: ViewState<WeatherResponse>): ViewState<WeatherDetails> {
        return when (state) {
            is ViewState.Valid -> onDataValid(state.data)
            is ViewState.Error -> state
            else -> ViewState.Idle
        }
    }

    private fun onDataValid(data: WeatherResponse?): ViewState<WeatherDetails> {
        return if (data==null) {
            ViewState.Error(ErrorTypes.NoData())
        } else {
            ViewState.Success(data.toWeatherDetails())
        }
    }

    private fun emitWeatherSate(weatherDetailsState: ViewState<WeatherDetails>) {
        _weatherState.value = weatherDetailsState
    }

    suspend fun saveTask(
        place: String?,
        temp: String?,
        image : String?
    ): Flow<ViewState<Unit>> {
        addPhoto.savePhoto(place!!, temp!!, image!!)
        return flowOf(ViewState.Success(Unit))
    }

}