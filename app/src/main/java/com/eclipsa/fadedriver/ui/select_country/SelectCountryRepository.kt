package com.eclipsa.fadedriver.ui.select_country

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository


class SelectCountryRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getCountryCode() = safeApiCall {
        api.getCountryCode()
    }

}