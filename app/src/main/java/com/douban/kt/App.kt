package com.douban.kt

import android.app.Application


class App : Application() {
    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()

    }


    companion object {
        lateinit var instance: App

    }
}