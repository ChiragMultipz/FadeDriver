package com.android.fadedriver.ui.your_availability

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.android.fadedriver.base.BaseViewModel
import com.android.fadedriver.network.CommonResponse
import com.android.fadedriver.network.Resource
import com.android.fadedriver.ui.select_services.ServiceResponseModel
import kotlinx.coroutines.launch

class YourAvailabilityViewModel constructor(private val repository: YourAvailabilityRepository) :
    BaseViewModel(repository) {

    private val _getTimeSlotsResponse: MutableLiveData<Resource<TimeSlotsResponse>> = MutableLiveData()
    val getTimeSlotsResponse: LiveData<Resource<TimeSlotsResponse>>
        get() = _getTimeSlotsResponse

    private val _addBarberTimeResponse: MutableLiveData<Resource<CommonResponse>> = MutableLiveData()
    val addBarberTimeResponse: LiveData<Resource<CommonResponse>>
        get() = _addBarberTimeResponse

    suspend fun getTimesSlots(
    ) = viewModelScope.launch {
        _getTimeSlotsResponse.value = Resource.Loading
        _getTimeSlotsResponse.value = repository.getTimesSlots()
    }

    suspend fun addBarberTime(
        dateList : ArrayList<String>,
        slotTimeList : ArrayList<String>,
    ) = viewModelScope.launch {
        _addBarberTimeResponse.value = Resource.Loading
        _addBarberTimeResponse.value = repository.addBarberTime(dateList, slotTimeList)
    }
}