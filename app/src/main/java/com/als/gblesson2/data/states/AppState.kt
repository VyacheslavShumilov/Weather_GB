package com.als.gblesson2.data.states

import com.als.gblesson2.data.dto.Weather

sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    data class SuccessDetails(val weatherData: Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
