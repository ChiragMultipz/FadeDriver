package com.eclipsa.fadedriver.ui.payment_history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.eclipsa.fadedriver.base.BaseViewModel
import com.eclipsa.fadedriver.network.Resource
import kotlinx.coroutines.launch

class PaymentHistoryViewModel constructor(private val repository: PaymentHistoryRepository) : BaseViewModel(repository){

    private val _userOrderResponse: MutableLiveData<Resource<BarberPaymentHistoryResponse>> = MutableLiveData()
    val userOrderResponse: LiveData<Resource<BarberPaymentHistoryResponse>>
        get() = _userOrderResponse

    suspend fun getBarberPaymentHistory(
        userId: String
    ) = viewModelScope.launch {
        _userOrderResponse.value = Resource.Loading
        _userOrderResponse.value = repository.getUserOrders(userId)
    }
}

