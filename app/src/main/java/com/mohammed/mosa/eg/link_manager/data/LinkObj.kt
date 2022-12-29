package com.mohammed.mosa.eg.link_manager.data

import android.graphics.Bitmap
import java.util.*

class LinkObj(var id: Int,
              var url:String,
              var date: Date,
              var note: String,
              var subDomain:String?,
              var logo: Bitmap
        ){

//    constructor(id: Int, url: String, date: Date, logo: Bitmap) : this(id, url, date, extractSubDomain(url), logo)

    private fun extractSubDomain(domain: String): String{
        return "gocc"
    }

}