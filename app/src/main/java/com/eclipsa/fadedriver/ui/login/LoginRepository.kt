package com.eclipsa.fadedriver.ui.login

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository


class LoginRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getCountryCode() = safeApiCall {
        api.getCountryCode()
    }

}