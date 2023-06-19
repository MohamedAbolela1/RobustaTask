package com.example.samplearch.source.remote.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/samplearch/source/remote/di/RemoteModule;", "", "()V", "providesRetrofitBuilder", "Lretrofit2/Retrofit;", "baseUrl", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "app_debug"})
@dagger.Module
public final class RemoteModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.samplearch.source.remote.di.RemoteModule INSTANCE = null;
    
    private RemoteModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit providesRetrofitBuilder(@org.jetbrains.annotations.NotNull
    @BaseUrl
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}