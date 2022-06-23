package com.android.fadedriver.ui.notification

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository
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