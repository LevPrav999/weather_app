package ru.levprav.weatherapp.data.repository

import ru.levprav.weatherapp.data.mappers.toWeatherInfo
import ru.levprav.weatherapp.data.remote.WeatherApi
import ru.levprav.weatherapp.domain.repository.WeatherRepository
import ru.levprav.weatherapp.domain.util.Resource
import ru.levprav.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try{
            Resource.Success(
                data = api.getWeather(lat=lat, long=long).toWeatherInfo()
            )
        } catch (e: Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "Неизвестная ошибка")
        }
    }
}