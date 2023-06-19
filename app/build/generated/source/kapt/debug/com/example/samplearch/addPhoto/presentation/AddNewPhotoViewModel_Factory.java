// Generated by Dagger (https://dagger.dev).
package com.example.samplearch.addPhoto.presentation;

import com.example.samplearch.addPhoto.data.repo.SavePhotoRepository;
import com.example.samplearch.addPhoto.data.repo.WeatherRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddNewPhotoViewModel_Factory implements Factory<AddNewPhotoViewModel> {
  private final Provider<SavePhotoRepository> addPhotoProvider;

  private final Provider<WeatherRepository> getDetailsProvider;

  public AddNewPhotoViewModel_Factory(Provider<SavePhotoRepository> addPhotoProvider,
      Provider<WeatherRepository> getDetailsProvider) {
    this.addPhotoProvider = addPhotoProvider;
    this.getDetailsProvider = getDetailsProvider;
  }

  @Override
  public AddNewPhotoViewModel get() {
    return newInstance(addPhotoProvider.get(), getDetailsProvider.get());
  }

  public static AddNewPhotoViewModel_Factory create(Provider<SavePhotoRepository> addPhotoProvider,
      Provider<WeatherRepository> getDetailsProvider) {
    return new AddNewPhotoViewModel_Factory(addPhotoProvider, getDetailsProvider);
  }

  public static AddNewPhotoViewModel newInstance(SavePhotoRepository addPhoto,
      WeatherRepository getDetails) {
    return new AddNewPhotoViewModel(addPhoto, getDetails);
  }
}
