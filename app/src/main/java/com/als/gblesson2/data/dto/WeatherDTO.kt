package com.als.gblesson2.data.dto

data class WeatherDTO(
    val fact: FactDTO?
)

fun convertDtoToModel(weatherDTO: WeatherDTO): Weather {
    val fact: FactDTO = weatherDTO.fact!!
    return Weather(getDefaultCity(), fact.temp!!, fact.feelsLike!!,
        fact.condition!!)

}