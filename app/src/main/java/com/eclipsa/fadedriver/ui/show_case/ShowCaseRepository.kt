package com.eclipsa.fadedriver.ui.show_case

import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository

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