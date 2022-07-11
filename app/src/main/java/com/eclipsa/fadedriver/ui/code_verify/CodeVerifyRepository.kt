package com.eclipsa.fadedriver.ui.code_verify

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository
import okhttp3.MultipartBody

class CodeVerifyRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun login(
        mobile: String,
        phone_code : String
    ) = safeApiCall {
        api.login(mobile,phone_code)
    }

}
