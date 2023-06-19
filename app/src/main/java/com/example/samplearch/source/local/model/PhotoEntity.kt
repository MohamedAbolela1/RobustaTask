package com.example.samplearch.source.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photos")
data class PhotoEntity(
    @ColumnInfo(name = "place") var place: String,
    @ColumnInfo(name = "temp") var temp: String,
    @ColumnInfo(name = "image") var image: String,
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id: Int = 0
)