package com.als.gblesson2.presentation.history

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.als.gblesson2.App.Companion.getHistoryDao
import com.als.gblesson2.data.localData.db.DbRepository
import com.als.gblesson2.data.localData.db.IDbRepository
import com.als.gblesson2.data.states.AppState

class HistoryViewModel(
    val historyLiveData: MutableLiveData<AppState> = MutableLiveData(),
    private val historyRepository: IDbRepository =
        DbRepository(getHistoryDao())
) : ViewModel() {
    fun getAllHistory() {
        historyLiveData.postValue(AppState.Loading)
        historyLiveData.postValue(
            AppState.Success(historyRepository.getAllHistory())
        )
    }

}