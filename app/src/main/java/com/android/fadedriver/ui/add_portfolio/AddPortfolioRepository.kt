package com.android.fadedriver.ui.add_portfolio

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository
import okhttp3.MultipartBody

class AddPortfolioRepository constructor(private val api: MyApi) : BaseRepository() {

    suspend fun addPortfolioImage(
        imageList: List<MultipartBody.Part>,
    ) = safeApiCall {
        api.addPortfolioImage(imageList)
    }
}