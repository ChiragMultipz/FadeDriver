package com.eclipsa.fadedriver.ui.terms_privacy

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository

class TermsPrivacyRepository(private val api: MyApi) : BaseRepository() {

    // 2 = Driver
    suspend fun getTermsPolicy(
    ) = safeApiCall {
        api.getTermsPolicy("2")
    }

}