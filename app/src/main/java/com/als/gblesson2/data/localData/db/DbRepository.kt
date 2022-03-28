package com.als.gblesson2.data.localData.db

import com.als.gblesson2.data.db.HistoryDao
import com.als.gblesson2.data.dto.Weather

class DbRepository(private val dataSource: HistoryDao): IDbRepository {
    override fun getAllHistory(): List<Weather> =
        convertEntityToWeather(dataSource.all())

    override fun saveEntity(weather: Weather) {
        dataSource.insert(convertWeatherToEntity(weather))
    }
}