package com.app.diagnoU.model
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "events")
data class Event(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date :Long,
    val stamp :String ,
    val name: String,
    val time: String
)