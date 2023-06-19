package com.example.samplearch.source.remote.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/samplearch/source/remote/di/RemoteHttpModule;", "", "()V", "TIME_OUT", "", "providesOkHttpClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "Lcom/example/samplearch/source/remote/interceptors/LoggingInterceptor;", "connectionInterceptor", "Lcom/example/samplearch/source/remote/interceptors/ConnectionInterceptor;", "app_debug"})
@dagger.Module
public final class RemoteHttpModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.samplearch.source.remote.di.RemoteHttpModule INSTANCE = null;
    private static final long TIME_OUT = 60L;
    
    private RemoteHttpModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient providesOkHttpClient(@org.jetbrains.annotations.NotNull
    com.example.samplearch.source.remote.interceptors.LoggingInterceptor loggingInterceptor, @org.jetbrains.annotations.NotNull
    com.example.samplearch.source.remote.interceptors.ConnectionInterceptor connectionInterceptor) {
        return null;
    }
}