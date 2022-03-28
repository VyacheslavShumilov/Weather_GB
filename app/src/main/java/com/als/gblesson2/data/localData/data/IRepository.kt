package com.als.gblesson2.data.localData.data

import com.als.gblesson2.data.dto.Weather

interface IRepository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}