package com.eclipsa.fadedriver

import android.app.Application
import com.eclipsa.fadedriver.utils.SocketConnector

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        SocketConnector.initSocket(this)
    }
}