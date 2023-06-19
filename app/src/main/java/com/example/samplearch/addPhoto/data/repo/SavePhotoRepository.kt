package com.example.samplearch.addPhoto.data.repo

import com.example.samplearch.source.local.dao.PhotoDao
import com.example.samplearch.source.local.model.PhotoEntity
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class SavePhotoRepository @Inject constructor(
    private val photoDao: PhotoDao
)  {
     suspend fun savePhoto(place: String, temp: String, image: String)  =
        photoDao.addPhoto(PhotoEntity(place = place,temp = temp , image = image))

    fun getAllPhotos() = photoDao.getPhotosList()

}