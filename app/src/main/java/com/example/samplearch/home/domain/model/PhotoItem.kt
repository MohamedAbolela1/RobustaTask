package com.example.samplearch.home.domain.model

import com.example.samplearch.source.local.model.PhotoEntity

data class PhotoItem(
    val place: String?,
    val temp: String?,
    val image: String?
)

fun List<PhotoEntity>.toTaskItem(): MutableList<PhotoItem> {
    return this.map {
        PhotoItem(it.place, it.temp,it.image)
    }.toMutableList()
}