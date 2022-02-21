package com.als.gblesson2.data

interface IRepository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}