package com.example.samplearch.source.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/samplearch/source/local/dao/PhotoDao;", "", "addPhoto", "", "task", "Lcom/example/samplearch/source/local/model/PhotoEntity;", "(Lcom/example/samplearch/source/local/model/PhotoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhotosList", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
public abstract interface PhotoDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM photos")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.samplearch.source.local.model.PhotoEntity>> getPhotosList();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object addPhoto(@org.jetbrains.annotations.NotNull
    com.example.samplearch.source.local.model.PhotoEntity task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}