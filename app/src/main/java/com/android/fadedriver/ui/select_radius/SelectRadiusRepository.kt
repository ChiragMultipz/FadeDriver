package com.android.fadedriver.ui.select_radius

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository

class SelectRadiusRepository (private val api: MyApi) : BaseRepository(){
    suspend fun addDriverRadius(
        params: Map<String,String>
    ) = safeApiCall {
        api.addDriverRadius(params)
    }

}