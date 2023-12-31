// Generated by Dagger (https://dagger.dev).
package com.example.samplearch.addPhoto.data.di;

import com.example.samplearch.addPhoto.data.remote.WeatherApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherModule_ProvideWeatherApiServiceFactory implements Factory<WeatherApiService> {
  private final WeatherModule module;

  private final Provider<Retrofit> retrofitProvider;

  public WeatherModule_ProvideWeatherApiServiceFactory(WeatherModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WeatherApiService get() {
    return provideWeatherApiService(module, retrofitProvider.get());
  }

  public static WeatherModule_ProvideWeatherApiServiceFactory create(WeatherModule module,
      Provider<Retrofit> retrofitProvider) {
    return new WeatherModule_ProvideWeatherApiServiceFactory(module, retrofitProvider);
  }

  public static WeatherApiService provideWeatherApiService(WeatherModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideWeatherApiService(retrofit));
  }
}
