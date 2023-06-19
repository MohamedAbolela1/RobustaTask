package com.example.samplearch.source.local.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/samplearch/source/local/di/LocalModule;", "", "()V", "photoDataBase", "Lcom/example/samplearch/source/local/PhotoDataBase;", "context", "Landroid/content/Context;", "provideContext", "providesPhotosDao", "Lcom/example/samplearch/source/local/dao/PhotoDao;", "app_debug"})
@dagger.Module
public final class LocalModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.samplearch.source.local.di.LocalModule INSTANCE = null;
    
    private LocalModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.samplearch.source.local.PhotoDataBase photoDataBase(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.samplearch.source.local.dao.PhotoDao providesPhotosDao(@org.jetbrains.annotations.NotNull
    com.example.samplearch.source.local.PhotoDataBase photoDataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}