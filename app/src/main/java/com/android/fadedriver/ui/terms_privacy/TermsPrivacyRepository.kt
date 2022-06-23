package com.android.fadedriver.ui.terms_privacy

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository

class TermsPrivacyRepository(private val api: MyApi) : BaseRepository() {

    // 2 = Driver
    suspend fun getTermsPolicy(
    ) = safeApiCall {
        api.getTermsPolicy("2")
    }

}