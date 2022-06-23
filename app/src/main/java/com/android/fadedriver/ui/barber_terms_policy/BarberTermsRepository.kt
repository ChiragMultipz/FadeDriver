package com.android.fadedriver.ui.barber_terms_policy

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository

class BarberTermsRepository(private val api: MyApi) : BaseRepository() {

    suspend fun getDriverProfile(
        barberId: String,
    ) = safeApiCall {
        api.getDriverProfile(barberId)
    }

    suspend fun updateTermsPolicy(
        params: Map<String, String>,
    ) = safeApiCall {
        api.updateTermsPolicy(params)
    }

}