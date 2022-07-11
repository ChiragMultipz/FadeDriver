package com.eclipsa.fadedriver.ui.insight

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository

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