package com.example.samplearch.addPhoto.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0003J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0003J \u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u001dH\u0003J\b\u0010*\u001a\u00020\u001dH\u0017J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\'H\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\'H\u0002J\f\u0010/\u001a\u00020\u0016*\u00020\u0016H\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R.\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u00128\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/example/samplearch/addPhoto/presentation/AddNewPhotoFragment;", "Lcom/example/samplearch/base/BaseFragment;", "Lcom/example/samplearch/databinding/FragmentAddNewPhotoBinding;", "()V", "addNewPhotoViewModel", "Lcom/example/samplearch/addPhoto/presentation/AddNewPhotoViewModel;", "getAddNewPhotoViewModel", "()Lcom/example/samplearch/addPhoto/presentation/AddNewPhotoViewModel;", "addNewPhotoViewModel$delegate", "Lkotlin/Lazy;", "bindingInflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "getBindingInflater", "()Lkotlin/jvm/functions/Function3;", "cameraResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "finalImage", "Landroid/graphics/Bitmap;", "isValid", "uri", "Landroid/net/Uri;", "weatherDetails", "Lcom/example/samplearch/addPhoto/domain/model/WeatherDetails;", "bindState", "", "state", "Lcom/example/samplearch/model/ViewState;", "bindWeatherData", "data", "checkCameraPermission", "observeViewModel", "openCameraIntent", "saveImage", "place", "", "temp", "setListeners", "setup", "shareImage", "app", "showToast", "message", "drawImages", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AddNewPhotoFragment extends com.example.samplearch.base.BaseFragment<com.example.samplearch.databinding.FragmentAddNewPhotoBinding> {
    private final kotlin.Lazy addNewPhotoViewModel$delegate = null;
    private android.graphics.Bitmap finalImage;
    private boolean isValid = false;
    private android.net.Uri uri;
    private com.example.samplearch.addPhoto.domain.model.WeatherDetails weatherDetails;
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> cameraResultLauncher = null;
    
    public AddNewPhotoFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, com.example.samplearch.databinding.FragmentAddNewPhotoBinding> getBindingInflater() {
        return null;
    }
    
    private final com.example.samplearch.addPhoto.presentation.AddNewPhotoViewModel getAddNewPhotoViewModel() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    @java.lang.Override
    public void setup() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    private final void setListeners() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    private final void checkCameraPermission() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    private final void openCameraIntent() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    private final android.graphics.Bitmap drawImages(android.graphics.Bitmap $this$drawImages) {
        return null;
    }
    
    private final void saveImage(java.lang.String place, java.lang.String temp, android.net.Uri uri) {
    }
    
    private final void shareImage(java.lang.String app) {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final void observeViewModel() {
    }
    
    private final void bindState(com.example.samplearch.model.ViewState<com.example.samplearch.addPhoto.domain.model.WeatherDetails> state) {
    }
    
    private final void bindWeatherData(com.example.samplearch.addPhoto.domain.model.WeatherDetails data) {
    }
}