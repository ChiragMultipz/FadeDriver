package com.android.fadedriver.ui.show_case

import com.android.fadedriver.network.MyApi
import com.android.fadedriver.repository.BaseRepository

class ShowCaseRepository constructor(private val api: MyApi) : BaseRepository() {

    suspend fun getBarberPortfolio(
    ) = safeApiCall {
        api.getBarberPortfolio()
    }

    suspend fun deletePortfolioImage(
        portfolioId: String
    ) = safeApiCall {
        api.removePortfolio(portfolioId)
    }
}