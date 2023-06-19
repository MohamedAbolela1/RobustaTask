package com.example.samplearch.addPhoto.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J)\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/samplearch/addPhoto/data/repo/SavePhotoRepository;", "", "photoDao", "Lcom/example/samplearch/source/local/dao/PhotoDao;", "(Lcom/example/samplearch/source/local/dao/PhotoDao;)V", "getAllPhotos", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/samplearch/source/local/model/PhotoEntity;", "savePhoto", "", "place", "", "temp", "image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton
public final class SavePhotoRepository {
    private final com.example.samplearch.source.local.dao.PhotoDao photoDao = null;
    
    @javax.inject.Inject
    public SavePhotoRepository(@org.jetbrains.annotations.NotNull
    com.example.samplearch.source.local.dao.PhotoDao photoDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object savePhoto(@org.jetbrains.annotations.NotNull
    java.lang.String place, @org.jetbrains.annotations.NotNull
    java.lang.String temp, @org.jetbrains.annotations.NotNull
    java.lang.String image, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.samplearch.source.local.model.PhotoEntity>> getAllPhotos() {
        return null;
    }
}