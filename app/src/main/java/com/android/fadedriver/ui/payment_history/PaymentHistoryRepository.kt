package com.android.fadedriver.ui.payment_history


import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository
import okhttp3.MultipartBody

class PaymentHistoryRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getUserOrders(
        user_id: String
    ) = safeApiCall {
        api.getPaymentHistory()
    }

}
