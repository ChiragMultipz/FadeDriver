package com.eclipsa.fadedriver.ui.select_radius

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository

class SelectRadiusRepository (private val api: MyApi) : BaseRepository(){
    suspend fun addDriverRadius(
        params: Map<String,String>
    ) = safeApiCall {
        api.addDriverRadius(params)
    }

}