package com.mohammed.mosa.eg.link_manager.database

import android.graphics.Bitmap
import android.util.Patterns
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "LINKS_TB")
class LinkEntity(
    @PrimaryKey(autoGenerate = true) var id: Int,
    var url:String,
    var date: Date,
    var note: String,
    var domain:String? = getDomain(url),
    var logo: Bitmap?
) {
    companion object{
        fun getDomain(url: String): String{
            if(isUrlVilde(url))
                return "url domine"
            else return "url"
        }

        fun isUrlVilde(url: String): Boolean{
            return Patterns.WEB_URL.matcher(url).matches()
        }
    }
}