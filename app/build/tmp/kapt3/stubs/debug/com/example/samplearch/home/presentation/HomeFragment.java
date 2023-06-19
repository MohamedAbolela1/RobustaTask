package com.example.samplearch.home.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0017H\u0002J\u001c\u0010\u001e\u001a\u00020\u00142\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0 H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0016J\b\u0010#\u001a\u00020\u0014H\u0002R.\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/samplearch/home/presentation/HomeFragment;", "Lcom/example/samplearch/base/BaseFragment;", "Lcom/example/samplearch/databinding/FragmentHomeBinding;", "()V", "bindingInflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "getBindingInflater", "()Lkotlin/jvm/functions/Function3;", "mainViewModel", "Lcom/example/samplearch/home/presentation/MainViewModel;", "getMainViewModel", "()Lcom/example/samplearch/home/presentation/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "productsAdapter", "Lcom/example/samplearch/home/presentation/adapter/ProductsAdapter;", "initViewModel", "", "onITemClicked", "image", "", "onTaskListSuccess", "tasksList", "", "Lcom/example/samplearch/home/domain/model/PhotoItem;", "onTasksListError", "errorMessage", "onTasksListStateRetrieved", "status", "Lcom/example/samplearch/model/ViewState;", "setListeners", "setup", "setupRecyclerView", "app_debug"})
public final class HomeFragment extends com.example.samplearch.base.BaseFragment<com.example.samplearch.databinding.FragmentHomeBinding> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.example.samplearch.home.presentation.adapter.ProductsAdapter productsAdapter;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, com.example.samplearch.databinding.FragmentHomeBinding> getBindingInflater() {
        return null;
    }
    
    private final com.example.samplearch.home.presentation.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void setup() {
    }
    
    private final void setListeners() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void onITemClicked(java.lang.String image) {
    }
    
    private final void initViewModel() {
    }
    
    private final void onTasksListStateRetrieved(com.example.samplearch.model.ViewState<? extends java.util.List<com.example.samplearch.home.domain.model.PhotoItem>> status) {
    }
    
    private final void onTaskListSuccess(java.util.List<com.example.samplearch.home.domain.model.PhotoItem> tasksList) {
    }
    
    private final void onTasksListError(java.lang.String errorMessage) {
    }
}