package com.example.samplearch.home.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/samplearch/home/presentation/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "addPhoto", "Lcom/example/samplearch/addPhoto/data/repo/SavePhotoRepository;", "(Lcom/example/samplearch/addPhoto/data/repo/SavePhotoRepository;)V", "getTasksList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/samplearch/model/ViewState;", "", "Lcom/example/samplearch/home/domain/model/PhotoItem;", "mapTasksList", "tasksList", "", "Lcom/example/samplearch/source/local/model/PhotoEntity;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.samplearch.addPhoto.data.repo.SavePhotoRepository addPhoto = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.samplearch.addPhoto.data.repo.SavePhotoRepository addPhoto) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.samplearch.model.ViewState<java.util.List<com.example.samplearch.home.domain.model.PhotoItem>>> getTasksList() {
        return null;
    }
    
    private final com.example.samplearch.model.ViewState<java.util.List<com.example.samplearch.home.domain.model.PhotoItem>> mapTasksList(java.util.List<com.example.samplearch.source.local.model.PhotoEntity> tasksList) {
        return null;
    }
}