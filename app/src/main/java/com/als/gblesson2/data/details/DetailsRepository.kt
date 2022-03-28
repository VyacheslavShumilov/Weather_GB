package com.als.gblesson2.data.details

import com.als.gblesson2.data.dto.WeatherDTO
import retrofit2.Callback

class DetailsRepository(private val remoteDataSource: RemoteDataSource) : IDetailsRepository {
    override fun getWeatherDetailsFromServer(lat: Double, lon: Double, callback: Callback<WeatherDTO>) {
        remoteDataSource.getWeatherDetails(lat, lon, callback)
    }
}
