package com.eclipsa.fadedriver.ui.add_portfolio

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository
import okhttp3.MultipartBody

class AddPortfolioRepository constructor(private val api: MyApi) : BaseRepository() {

    suspend fun addPortfolioImage(
        imageList: List<MultipartBody.Part>,
    ) = safeApiCall {
        api.addPortfolioImage(imageList)
    }
}