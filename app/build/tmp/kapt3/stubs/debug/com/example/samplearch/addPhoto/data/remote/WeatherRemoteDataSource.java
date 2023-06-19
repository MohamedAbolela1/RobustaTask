package com.example.samplearch.addPhoto.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/samplearch/addPhoto/data/remote/WeatherRemoteDataSource;", "Lcom/example/samplearch/source/remote/executer/RemoteExecutor;", "weatherApiService", "Lcom/example/samplearch/addPhoto/data/remote/WeatherApiService;", "(Lcom/example/samplearch/addPhoto/data/remote/WeatherApiService;)V", "getWeather", "Lcom/example/samplearch/addPhoto/data/model/WeatherResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRemoteDataSource extends com.example.samplearch.source.remote.executer.RemoteExecutor {
    private final com.example.samplearch.addPhoto.data.remote.WeatherApiService weatherApiService = null;
    
    @javax.inject.Inject
    public WeatherRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.example.samplearch.addPhoto.data.remote.WeatherApiService weatherApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getWeather(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.samplearch.addPhoto.data.model.WeatherResponse> continuation) {
        return null;
    }
}