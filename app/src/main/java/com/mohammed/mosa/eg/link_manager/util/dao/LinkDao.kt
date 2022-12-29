package com.mohammed.mosa.eg.link_manager.util.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.mohammed.mosa.eg.link_manager.database.LinkEntity

@Dao
interface LinkDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addLink(links: List<LinkEntity>)

    @Update
    suspend fun updateLink(links: List<LinkEntity>)

    @Delete
    suspend fun deleteLinks(links: List<LinkEntity>)

    @Query("SELECT * FROM LINKS_TB ORDER BY id DESC")
    suspend fun getAllLinks(): LiveData<List<LinkEntity>>

    @Query("DELETE  FROM LINKS_TB")
    suspend fun deleteAllLinks()

}
