package com.eclipsa.fadedriver.ui.fragment.profile_frag

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.eclipsa.fadedriver.base.BaseViewModel
import com.eclipsa.fadedriver.network.CommonResponse
import com.eclipsa.fadedriver.network.Resource
import com.eclipsa.fadedriver.ui.fragment.dashboard.HomeOfferResponse
import com.eclipsa.fadedriver.ui.profile.CityResponse
import com.eclipsa.fadedriver.ui.profile.StateResponse
import kotlinx.coroutines.launch

class ProfileFragViewModel(val repository: ProfileFragRepository) : BaseViewModel(repository) {

    private val _getOfferResponse: MutableLiveData<Resource<HomeOfferResponse>> = MutableLiveData()
    val getOfferResponse: LiveData<Resource<HomeOfferResponse>>
        get() = _getOfferResponse

    private val _logoutResponse: MutableLiveData<Resource<CommonResponse>> = MutableLiveData()
    val logoutResponse: LiveData<Resource<CommonResponse>>
        get() = _logoutResponse

    private val _barberOnOffResponse: MutableLiveData<Resource<CommonResponse>> = MutableLiveData()
    val barberOnOffResponse: LiveData<Resource<CommonResponse>>
        get() = _barberOnOffResponse

    suspend fun logoutUser(
    ) = viewModelScope.launch {
        _logoutResponse.value = Resource.Loading
        _logoutResponse.value = repository.logoutUser()
    }

    suspend fun getOffer(
        params: Map<String,String>
    ) = viewModelScope.launch {
        _getOfferResponse.value = Resource.Loading
        _getOfferResponse.value = repository.getOffer(params)
    }

    suspend fun barberOnOff(
        status: Int
    ) = viewModelScope.launch {
        _barberOnOffResponse.value = Resource.Loading
        _barberOnOffResponse.value = repository.barberOnOff(status)
    }



}