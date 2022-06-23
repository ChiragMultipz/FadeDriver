package com.android.fadedriver.ui.fragment.dashboard
import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository
import okhttp3.MultipartBody

class HomeRepository constructor(private val api : MyApi): BaseRepository() {

    suspend fun getOffer(
        params: Map<String,String>
    ) = safeApiCall {
        api.getOffer(params)
    }

    /*

    suspend fun getNearestDrivers(
    ) = safeApiCall {
        api.getNearestDriver()
    }

    suspend fun searchDriver(
        params: Map<String,String>
    ) = safeApiCall {
        api.searchDriver(params)
    }*/
}