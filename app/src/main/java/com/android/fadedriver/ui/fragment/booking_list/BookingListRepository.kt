package com.android.fadedriver.ui.fragment.booking_list

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository

class BookingListRepository constructor(private val api : MyApi): BaseRepository(){
    suspend fun getDriverOrders(
    ) = safeApiCall {
        api.getDriverOrders()
    }

    suspend fun getCancelReasons(
    ) = safeApiCall {
        api.getCancelReasons()
    }
    suspend fun completeOrder(
        params: Map<String,String>
    ) = safeApiCall {
        api.orderComplete(params)
    }

    suspend fun cancelOrder(
        params: Map<String,String>
    ) = safeApiCall {
        api.orderCancelByDriver(params)
    }
}
