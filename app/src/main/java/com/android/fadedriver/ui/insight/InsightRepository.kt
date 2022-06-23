package com.android.fadedriver.ui.insight

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository
import java.util.HashMap

class InsightRepository(private val api: MyApi) : BaseRepository() {

    suspend fun getRevenueData(
        driverId : String,
        searchString: String
    ) = safeApiCall {
        api.getRevenueData(driverId, searchString)
    }

    suspend fun getRevenueDataWithoutSearch(
        driverId : String
    ) = safeApiCall {
        api.getRevenueDataWithoutSearch(driverId)
    }

    suspend fun getMostBookedServices(
    ) = safeApiCall {
        api.getMostBookedServices()
    }
}