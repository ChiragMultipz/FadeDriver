package com.android.fadedriver.ui.login

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository


class LoginRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getCountryCode() = safeApiCall {
        api.getCountryCode()
    }

}