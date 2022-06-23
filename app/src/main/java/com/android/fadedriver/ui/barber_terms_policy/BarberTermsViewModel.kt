package com.android.fadedriver.ui.barber_terms_policy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.android.fadedriver.base.BaseViewModel
import com.android.fadedriver.network.CommonResponse
import com.android.fadedriver.network.Resource
import com.android.fadedriver.ui.notification.NotificationListRepository
import com.android.fadedriver.ui.notification.NotificationListResponse
import com.google.android.gms.common.internal.service.Common
import kotlinx.coroutines.launch

class BarberTermsViewModel constructor(private val repository: BarberTermsRepository) :
    BaseViewModel(repository) {

    private val _getBarberProfileResponse: MutableLiveData<Resource<BarberProfileResponse>> = MutableLiveData()
    val getBarberProfileResponse: LiveData<Resource<BarberProfileResponse>>
        get() = _getBarberProfileResponse

    private val _updateTermsResponse: MutableLiveData<Resource<CommonResponse>> = MutableLiveData()
    val updateTermsResponse: LiveData<Resource<CommonResponse>>
        get() = _updateTermsResponse

    suspend fun getBarberProfile (
        barberId : String,
    ) = viewModelScope.launch {
        _getBarberProfileResponse.value = Resource.Loading
        _getBarberProfileResponse.value = repository.getDriverProfile(barberId)
    }

    suspend fun updateTermsPolicy (
        params : Map<String, String>,
    ) = viewModelScope.launch {
        _updateTermsResponse.value = Resource.Loading
        _updateTermsResponse.value = repository.updateTermsPolicy(params)
    }
}