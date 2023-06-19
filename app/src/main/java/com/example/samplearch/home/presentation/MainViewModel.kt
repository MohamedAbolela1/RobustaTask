package com.example.samplearch.home.presentation

import androidx.lifecycle.ViewModel
import com.example.samplearch.addPhoto.data.repo.SavePhotoRepository
import com.example.samplearch.home.domain.model.PhotoItem
import com.example.samplearch.home.domain.model.toTaskItem
import com.example.samplearch.model.ErrorTypes
import com.example.samplearch.model.ViewState
import com.example.samplearch.source.local.model.PhotoEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val addPhoto: SavePhotoRepository
): ViewModel() {
    fun getTasksList(): Flow<ViewState<MutableList<PhotoItem>>> {
        return addPhoto.getAllPhotos()
            .map(::mapTasksList)
    }

    private fun mapTasksList(tasksList: List<PhotoEntity>): ViewState<MutableList<PhotoItem>> {
        return if (tasksList.isNullOrEmpty()) {
            ViewState.Error(ErrorTypes.NoData())
        } else {
            ViewState.Success(tasksList.toTaskItem())
        }
    }
}
