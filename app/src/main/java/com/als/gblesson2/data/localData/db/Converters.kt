package com.als.gblesson2.data.localData.db

import com.als.gblesson2.data.db.HistoryEntity
import com.als.gblesson2.data.dto.City
import com.als.gblesson2.data.dto.Weather

fun convertEntityToWeather(entityList: List<HistoryEntity>): List<Weather> =
    entityList.map {
        Weather(
            city = City(it.city, 0.0, 0.0), temperature = it.temperature, feelsLike = 0,
            condition = it.condition, id = it.id
        )
    }

fun convertWeatherToEntity(weather: Weather): HistoryEntity =
    HistoryEntity(
        0, weather.city?.city ?: "", weather.temperature,
        weather.condition
    )