package com.app.diagnoU.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.app.diagnoU.data.EventDatabase
import com.app.diagnoU.model.Event
import com.app.diagnoU.resp.EventResp

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EventViewModel(application: Application): AndroidViewModel(application) {
    val readAllData: LiveData<List<Event>>
    private val repository: EventResp
    var latestLength : LiveData<Int?>
    init {

        val eventDao = EventDatabase.getDatabase(application).eventDao()

        repository = EventResp(eventDao)

        readAllData = repository.readAllData
        latestLength=repository.LatestLength
    }

    fun addEvent(event: Event){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addEvent(event)
        }
    }
    fun deleteInfo(event: Event){
        viewModelScope.launch(Dispatchers.IO){
            repository.deleteInfo(event)
        }
    }


//    fun deleteSubject(subject: Subject){
//        viewModelScope.launch(Dispatchers.IO) {
//            repository.deleteSubject(subject)
//        }
//    }

//    fun updateSubject(subject: Subject){
//        viewModelScope.launch(Dispatchers.IO) {
//            repository.updateSubject(subject)
//        }
//    }

}