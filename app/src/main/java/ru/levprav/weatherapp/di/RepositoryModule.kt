package ru.levprav.weatherapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.levprav.weatherapp.data.repository.WeatherRepositoryImpl
import ru.levprav.weatherapp.domain.repository.WeatherRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindLocationRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository
}