package com.example.samplearch.addPhoto.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0002J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002J;\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/samplearch/addPhoto/presentation/AddNewPhotoViewModel;", "Lcom/example/samplearch/base/BaseViewModel;", "addPhoto", "Lcom/example/samplearch/addPhoto/data/repo/SavePhotoRepository;", "getDetails", "Lcom/example/samplearch/addPhoto/data/repo/WeatherRepository;", "(Lcom/example/samplearch/addPhoto/data/repo/SavePhotoRepository;Lcom/example/samplearch/addPhoto/data/repo/WeatherRepository;)V", "_weatherState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/samplearch/model/ViewState;", "Lcom/example/samplearch/addPhoto/domain/model/WeatherDetails;", "weatherState", "Landroidx/lifecycle/LiveData;", "getWeatherState", "()Landroidx/lifecycle/LiveData;", "emitWeatherSate", "", "weatherDetailsState", "executeProductsListState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherService", "mapWeatherState", "state", "Lcom/example/samplearch/addPhoto/data/model/WeatherResponse;", "onDataValid", "data", "saveTask", "Lkotlinx/coroutines/flow/Flow;", "place", "", "temp", "image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AddNewPhotoViewModel extends com.example.samplearch.base.BaseViewModel {
    private final com.example.samplearch.addPhoto.data.repo.SavePhotoRepository addPhoto = null;
    private final com.example.samplearch.addPhoto.data.repo.WeatherRepository getDetails = null;
    private final androidx.lifecycle.MutableLiveData<com.example.samplearch.model.ViewState<com.example.samplearch.addPhoto.domain.model.WeatherDetails>> _weatherState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.samplearch.model.ViewState<com.example.samplearch.addPhoto.domain.model.WeatherDetails>> weatherState = null;
    
    @javax.inject.Inject
    public AddNewPhotoViewModel(@org.jetbrains.annotations.NotNull
    com.example.samplearch.addPhoto.data.repo.SavePhotoRepository addPhoto, @org.jetbrains.annotations.NotNull
    com.example.samplearch.addPhoto.data.repo.WeatherRepository getDetails) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.samplearch.model.ViewState<com.example.samplearch.addPhoto.domain.model.WeatherDetails>> getWeatherState() {
        return null;
    }
    
    private final void getWeatherService() {
    }
    
    private final java.lang.Object executeProductsListState(kotlin.coroutines.Continuation<? super com.example.samplearch.model.ViewState<com.example.samplearch.addPhoto.domain.model.WeatherDetails>> continuation) {
        return null;
    }
    
    private final com.example.samplearch.model.ViewState<com.example.samplearch.addPhoto.domain.model.WeatherDetails> mapWeatherState(com.example.samplearch.model.ViewState<com.example.samplearch.addPhoto.data.model.WeatherResponse> state) {
        return null;
    }
    
    private final com.example.samplearch.model.ViewState<com.example.samplearch.addPhoto.domain.model.WeatherDetails> onDataValid(com.example.samplearch.addPhoto.data.model.WeatherResponse data) {
        return null;
    }
    
    private final void emitWeatherSate(com.example.samplearch.model.ViewState<com.example.samplearch.addPhoto.domain.model.WeatherDetails> weatherDetailsState) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveTask(@org.jetbrains.annotations.Nullable
    java.lang.String place, @org.jetbrains.annotations.Nullable
    java.lang.String temp, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.samplearch.model.ViewState<kotlin.Unit>>> continuation) {
        return null;
    }
}