package com.android.fadedriver.ui.select_country

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.fade.ui.login.CountryCodeResponseModel
import com.android.fadedriver.network.Resource
import kotlinx.coroutines.launch

class SelectCountryViewModel constructor(private val repository: SelectCountryRepository): ViewModel() {

    private val _countryCodeResponse: MutableLiveData<Resource<CountryCodeResponseModel>> = MutableLiveData()
    val countryCodeResponse: LiveData<Resource<CountryCodeResponseModel>> get() = _countryCodeResponse

    suspend fun countryCode() = viewModelScope.launch {
        _countryCodeResponse.value = Resource.Loading
        _countryCodeResponse.value = repository.getCountryCode()
    }
}