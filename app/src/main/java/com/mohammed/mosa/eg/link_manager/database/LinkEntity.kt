package com.mohammed.mosa.eg.link_manager.database

import android.graphics.Bitmap
import android.util.Patterns
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.mohammed.mosa.eg.link_manager.data.Category
import java.net.URI
import java.util.*

@Entity(tableName = "LINKS_TB",
    foreignKeys = [ForeignKey(entity = Category::class,
    childColumns = arrayOf("category"), parentColumns = arrayOf("id"))])
data class LinkEntity(
    @PrimaryKey(autoGenerate = true) var id: Int,
    var url:String,
    var date: Date,
    var subject: String,
    var domain:String? = getDomainName(url),
    var logo: Bitmap?,
    var category: Category
) {
    companion object{
        fun getDomainName(url: String): String{
            if(isUrlVilde(url))
                return URI(url).host
            return "url Not vilde"
        }

        fun isUrlVilde(url: String): Boolean{
            return Patterns.WEB_URL.matcher(url).matches()
        }

        fun extractUrlFromText(text: String): List<String>{
            val urlMatcher = Patterns.WEB_URL.matcher(text)
            val urlList = mutableListOf<String>()

            while(urlMatcher.find()){
                val foundedUrl = urlMatcher.group()
                urlList.add(foundedUrl)
            }
            return urlList
        }
    }
}