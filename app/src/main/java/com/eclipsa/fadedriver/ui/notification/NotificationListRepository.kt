package com.eclipsa.fadedriver.ui.notification

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository
import java.util.HashMap

class NotificationListRepository(private val api: MyApi) : BaseRepository() {

    suspend fun getNotification(
    ) = safeApiCall {
        api.getNotification()
    }

    suspend fun readNotification(
    ) = safeApiCall {
        api.readNotification()
    }

}