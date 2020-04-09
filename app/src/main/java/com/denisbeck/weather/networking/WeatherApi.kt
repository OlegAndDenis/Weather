package com.denisbeck.weather.networking

import com.denisbeck.weather.models.Weather
import com.denisbeck.weather.models.WeatherData
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    suspend fun getForecast(@Query("q")location: String,
                            @Query("units") unit: String): WeatherData
}