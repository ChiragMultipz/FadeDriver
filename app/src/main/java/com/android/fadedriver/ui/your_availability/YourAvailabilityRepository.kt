package com.android.fadedriver.ui.your_availability

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository

class YourAvailabilityRepository(private val api: MyApi) : BaseRepository() {

    suspend fun getTimesSlots(
    ) = safeApiCall {
        api.getTimesSlots()
    }

    suspend fun addBarberTime(
        dateList : ArrayList<String>,
        slotTimeList : ArrayList<String>,
    ) = safeApiCall {
        api.addBarberTime(dateList, slotTimeList)
    }

}