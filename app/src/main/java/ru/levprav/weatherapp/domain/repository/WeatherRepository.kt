package ru.levprav.weatherapp.domain.repository

import ru.levprav.weatherapp.domain.util.Resource
import ru.levprav.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}