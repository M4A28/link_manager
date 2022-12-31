package com.mohammed.mosa.eg.link_manager.data

import androidx.room.Entity

import androidx.room.PrimaryKey

@Entity(tableName = "LINK_CATEGORY")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var subject: String,

) {
}