package com.app.diagnoU.resp


import androidx.lifecycle.LiveData
import com.app.diagnoU.data.EventDao
import com.app.diagnoU.model.Event



class EventResp(private val eventDao: EventDao) {
    val readAllData: LiveData<List<Event>> =eventDao.readAllData()
    val LatestLength:LiveData<Int?> =eventDao.funGetLength()
    suspend fun deleteInfo(event: Event) {
        eventDao.deleteInfo(event)
    }
    suspend fun addEvent(event: Event){
        eventDao.insert(event)
    }
}