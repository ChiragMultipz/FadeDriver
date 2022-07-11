package com.eclipsa.fadedriver.ui.add_portfolio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.eclipsa.fadedriver.base.BaseViewModel
import com.eclipsa.fadedriver.network.Resource
import com.eclipsa.fadedriver.ui.show_case.BarberPortfolioResponse
import kotlinx.coroutines.launch
import okhttp3.MultipartBody

class AddPortfolioViewModel constructor(private val repository: AddPortfolioRepository) : BaseViewModel(repository){

    private val _addPortfolioResponse: MutableLiveData<Resource<BarberPortfolioResponse>> = MutableLiveData()
    val addPortfolioResponse: LiveData<Resource<BarberPortfolioResponse>>
        get() = _addPortfolioResponse


    suspend fun addPortfolioImage(
        imageList: List<MultipartBody.Part>,
    ) = viewModelScope.launch {
        _addPortfolioResponse.value = Resource.Loading
        _addPortfolioResponse.value = repository.addPortfolioImage(imageList)
    }
}