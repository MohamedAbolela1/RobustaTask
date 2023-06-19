// Generated by Dagger (https://dagger.dev).
package com.example.samplearch.source.remote.di;

import com.example.samplearch.source.remote.interceptors.ConnectionInterceptor;
import com.example.samplearch.source.remote.interceptors.LoggingInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteHttpModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<LoggingInterceptor> loggingInterceptorProvider;

  private final Provider<ConnectionInterceptor> connectionInterceptorProvider;

  public RemoteHttpModule_ProvidesOkHttpClientFactory(
      Provider<LoggingInterceptor> loggingInterceptorProvider,
      Provider<ConnectionInterceptor> connectionInterceptorProvider) {
    this.loggingInterceptorProvider = loggingInterceptorProvider;
    this.connectionInterceptorProvider = connectionInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return providesOkHttpClient(loggingInterceptorProvider.get(), connectionInterceptorProvider.get());
  }

  public static RemoteHttpModule_ProvidesOkHttpClientFactory create(
      Provider<LoggingInterceptor> loggingInterceptorProvider,
      Provider<ConnectionInterceptor> connectionInterceptorProvider) {
    return new RemoteHttpModule_ProvidesOkHttpClientFactory(loggingInterceptorProvider, connectionInterceptorProvider);
  }

  public static OkHttpClient providesOkHttpClient(LoggingInterceptor loggingInterceptor,
      ConnectionInterceptor connectionInterceptor) {
    return Preconditions.checkNotNullFromProvides(RemoteHttpModule.INSTANCE.providesOkHttpClient(loggingInterceptor, connectionInterceptor));
  }
}
