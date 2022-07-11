package com.eclipsa.fadedriver.ui.review

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository
import okhttp3.MultipartBody

class ReviewRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getReview(
    ) = safeApiCall {
        api.getReview()
    }
}
