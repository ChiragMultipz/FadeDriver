package com.eclipsa.fadedriver.ui.payment_history


import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository
import okhttp3.MultipartBody

class PaymentHistoryRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getUserOrders(
        user_id: String
    ) = safeApiCall {
        api.getPaymentHistory()
    }

}
