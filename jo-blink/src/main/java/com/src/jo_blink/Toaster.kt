package com.src.jo_blink

import android.content.Context
import android.widget.Toast

 class Toaster {
    companion object {
        lateinit var text:String
        fun setToaster(msg:String):String{
            text = msg+"jo lib got this message"
            return text
        }
    }
}