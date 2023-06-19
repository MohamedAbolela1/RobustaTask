package com.example.samplearch.source.local.di

import android.content.Context
import androidx.room.Room
import com.example.samplearch.source.local.PhotoDataBase
import com.example.samplearch.source.local.dao.PhotoDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Singleton
    @Provides
    fun photoDataBase(context: Context): PhotoDataBase {
        return Room.databaseBuilder(context, PhotoDataBase::class.java, "PhotoDatabase.db")
            .build()
    }

    @Singleton
    @Provides
    fun providesPhotosDao(photoDataBase: PhotoDataBase): PhotoDao {
        return photoDataBase.photoDao()
    }

    @Provides
    fun provideContext(
        @ApplicationContext context: Context,
    ): Context {
        return context
    }
}