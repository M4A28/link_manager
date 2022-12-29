package com.mohammed.mosa.eg.link_manager.data

import androidx.room.TypeConverter
import java.util.*


class DateConverter {
    companion object{
        @TypeConverter
        fun toLong(date: Date?): Long{
            val currentTime = Date().time
            return date?.time ?: currentTime
        }

        @TypeConverter
        fun toDate(time: Long?): Date{
            val currentTime = Date()
            return if(time != null)
                Date(time)
            else currentTime
        }
    }
}