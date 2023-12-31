package com.example.samplearch.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0014H\u0002\u00a2\u0006\u0002\u0010\u0016J=\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u001e\u0010\u0018\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00140\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/samplearch/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_messageStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/samplearch/model/StringModel;", "messageStateLiveData", "Landroidx/lifecycle/LiveData;", "getMessageStateLiveData", "()Landroidx/lifecycle/LiveData;", "emitMessageState", "", "message", "getApiExceptionState", "Lcom/example/samplearch/model/ViewState$Error;", "exception", "Lcom/example/samplearch/source/remote/executer/ApiException;", "getNoNetworkExceptionState", "getResponseState", "Lcom/example/samplearch/model/ViewState;", "T", "apiResponse", "(Ljava/lang/Object;)Lcom/example/samplearch/model/ViewState;", "validateResponse", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.samplearch.model.StringModel> _messageStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.samplearch.model.StringModel> messageStateLiveData = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.samplearch.model.StringModel> getMessageStateLiveData() {
        return null;
    }
    
    protected final void emitMessageState(@org.jetbrains.annotations.NotNull
    com.example.samplearch.model.StringModel message) {
    }
    
    @org.jetbrains.annotations.Nullable
    protected final <T extends java.lang.Object>java.lang.Object validateResponse(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> call, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.samplearch.model.ViewState<? extends T>> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>com.example.samplearch.model.ViewState<T> getResponseState(T apiResponse) {
        return null;
    }
    
    private final com.example.samplearch.model.ViewState.Error getNoNetworkExceptionState() {
        return null;
    }
    
    private final com.example.samplearch.model.ViewState.Error getApiExceptionState(com.example.samplearch.source.remote.executer.ApiException exception) {
        return null;
    }
}