package com.android.fadedriver

import android.app.Application
import com.android.fadedriver.utils.SocketConnector
import com.stripe.android.PaymentConfiguration

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        SocketConnector.initSocket(this)
    }
}