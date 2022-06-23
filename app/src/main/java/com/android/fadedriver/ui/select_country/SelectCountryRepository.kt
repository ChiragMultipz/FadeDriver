package com.android.fadedriver.ui.select_country

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository


class SelectCountryRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getCountryCode() = safeApiCall {
        api.getCountryCode()
    }

}