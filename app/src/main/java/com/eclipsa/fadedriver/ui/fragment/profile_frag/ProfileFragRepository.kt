package com.eclipsa.fadedriver.ui.fragment.profile_frag
import com.eclipsa.fadedriver.network.MyApi
import com.eclipsa.fadedriver.repository.BaseRepository
import okhttp3.MultipartBody

class ProfileFragRepository constructor(private val api : MyApi): BaseRepository() {

    suspend fun logoutUser(
    ) = safeApiCall {
        api.logout()
    }

    suspend fun getOffer(
        params: Map<String,String>
    ) = safeApiCall {
        api.getOffer(params)
    }

    suspend fun barberOnOff(
        status: Int
    ) = safeApiCall {
        api.barberOnOff(status)
    }
}