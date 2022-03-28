package com.als.gblesson2.data.localData.db

import com.als.gblesson2.data.dto.Weather

interface IDbRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}
