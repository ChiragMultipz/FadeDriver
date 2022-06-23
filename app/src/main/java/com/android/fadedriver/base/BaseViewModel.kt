package com.android.fadedriver.base

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.fadedriver.repository.BaseRepository
import kotlin.properties.Delegates

abstract class BaseViewModel(
    private val repository: BaseRepository
) : ViewModel() {

        var profilePic = MutableLiveData("imagePath")
        var userName = MutableLiveData("userName")

   /* val userImage = MutableLiveData<String>()
    var image: String by Delegates.observable("") { _, _, newValue ->
        userImage.postValue(newValue)
    }*/

}