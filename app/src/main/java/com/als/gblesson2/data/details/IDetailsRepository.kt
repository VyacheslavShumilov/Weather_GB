package com.als.gblesson2.data.details

import com.als.gblesson2.data.dto.WeatherDTO
import retrofit2.Callback


interface IDetailsRepository {
    fun getWeatherDetailsFromServer(lat: Double, lon: Double, callback: Callback<WeatherDTO>)
}