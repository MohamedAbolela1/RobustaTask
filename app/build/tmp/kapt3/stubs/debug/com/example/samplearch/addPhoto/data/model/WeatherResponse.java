package com.example.samplearch.addPhoto.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/samplearch/addPhoto/data/model/WeatherResponse;", "", "weather", "", "Lcom/example/samplearch/addPhoto/data/model/WeatherResponse$Weather;", "main", "Lcom/example/samplearch/addPhoto/data/model/WeatherResponse$Main;", "(Ljava/util/List;Lcom/example/samplearch/addPhoto/data/model/WeatherResponse$Main;)V", "getMain", "()Lcom/example/samplearch/addPhoto/data/model/WeatherResponse$Main;", "getWeather", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Main", "Weather", "app_debug"})
public final class WeatherResponse {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.samplearch.addPhoto.data.model.WeatherResponse.Weather> weather = null;
    @org.jetbrains.annotations.Nullable
    private final com.example.samplearch.addPhoto.data.model.WeatherResponse.Main main = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.samplearch.addPhoto.data.model.WeatherResponse copy(@org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.example.samplearch.addPhoto.data.model.WeatherResponse.Weather> weather, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "main")
    com.example.samplearch.addPhoto.data.model.WeatherResponse.Main main) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherResponse(@org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.example.samplearch.addPhoto.data.model.WeatherResponse.Weather> weather, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "main")
    com.example.samplearch.addPhoto.data.model.WeatherResponse.Main main) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.samplearch.addPhoto.data.model.WeatherResponse.Weather> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.samplearch.addPhoto.data.model.WeatherResponse.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.samplearch.addPhoto.data.model.WeatherResponse.Main component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.samplearch.addPhoto.data.model.WeatherResponse.Main getMain() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/samplearch/addPhoto/data/model/WeatherResponse$Weather;", "", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Weather {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String description = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.addPhoto.data.model.WeatherResponse.Weather copy(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "description")
        java.lang.String description) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Weather(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "description")
        java.lang.String description) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getDescription() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/samplearch/addPhoto/data/model/WeatherResponse$Main;", "", "temp", "", "(F)V", "getTemp", "()F", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Main {
        private final float temp = 0.0F;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.addPhoto.data.model.WeatherResponse.Main copy(float temp) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Main(float temp) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getTemp() {
            return 0.0F;
        }
    }
}