package com.als.gblesson2.data.localData.data

import com.als.gblesson2.data.dto.Weather
import com.als.gblesson2.data.dto.getRussianCities
import com.als.gblesson2.data.dto.getWorldCities

class Repository : IRepository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorageRus(): List<Weather> = getRussianCities()

    override fun getWeatherFromLocalStorageWorld(): List<Weather> = getWorldCities()
}