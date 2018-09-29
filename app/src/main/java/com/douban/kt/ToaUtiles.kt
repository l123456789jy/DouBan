package com.douban.kt

import android.widget.Toast


object ToaUtiles {
    fun show(msg: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(App.instance, msg, length).show()
    }
}

