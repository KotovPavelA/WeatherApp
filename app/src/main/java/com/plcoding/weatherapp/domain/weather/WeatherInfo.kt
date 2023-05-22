package com.plcoding.weatherapp.domain.weather

data class WeatherInfo(
    //0 - today, 1 - tomorrow etc.
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)