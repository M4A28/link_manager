package com.mohammed.mosa.eg.link_manager.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mohammed.mosa.eg.link_manager.util.dao.LinkDao

@Database(entities = [LinkEntity::class], version = 1)
abstract class LinkDatabase : RoomDatabase(){
    abstract fun linkDao(): LinkDao

    companion object{
        private const val DATABASE_NAME = "Links_db"
        private var instance: LinkDatabase? = null

        fun init(context: Context): LinkDatabase {
            return instance ?: synchronized(this){ buildDatabase(context).also { database -> instance = database } }
        }

        fun getInstants() = instance!!

        private fun buildDatabase(context: Context): LinkDatabase {
            return Room.databaseBuilder(context, LinkDatabase::class.java, DATABASE_NAME).build()
        }

    }
}