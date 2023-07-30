package ru.levprav.weatherapp.domain.weather

data class WeatherInfo(
    val weatherDataDerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
