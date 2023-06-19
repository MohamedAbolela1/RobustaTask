package com.example.samplearch.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.samplearch.source.local.dao.PhotoDao
import com.example.samplearch.source.local.model.PhotoEntity



@Database(entities = [PhotoEntity::class], version = 1, exportSchema = false)
abstract class PhotoDataBase : RoomDatabase() {
    abstract fun photoDao(): PhotoDao
}