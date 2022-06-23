package com.android.fadedriver.ui.review

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository
import okhttp3.MultipartBody

class ReviewRepository constructor(private val api : MyApi) : BaseRepository() {

    suspend fun getReview(
    ) = safeApiCall {
        api.getReview()
    }
}
