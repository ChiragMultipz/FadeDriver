package com.android.fadedriver.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.fadedriver.repository.BaseRepository
import com.android.fadedriver.ui.fragment.booking_list.BookingListRepository
import com.android.fadedriver.ui.fragment.booking_list.BookingListViewModel
import com.android.fadedriver.ui.fragment.chat_list.ChatMessageRepository
import com.android.fadedriver.ui.fragment.chat_list.ChatMessageViewModel
import com.android.fadedriver.ui.fragment.dashboard.HomeRepository
import com.android.fadedriver.ui.fragment.dashboard.HomeViewModel
import com.android.fadedriver.ui.fragment.profile_frag.ProfileFragRepository
import com.android.fadedriver.ui.fragment.profile_frag.ProfileFragViewModel
import com.android.fadedriver.ui.profile.ProfileViewModel

class ViewModelFactory(private val repository: BaseRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel(repository as HomeRepository) as T
            modelClass.isAssignableFrom(BookingListViewModel::class.java) -> BookingListViewModel(repository as BookingListRepository) as T
            modelClass.isAssignableFrom(ProfileFragViewModel::class.java) -> ProfileFragViewModel(repository as ProfileFragRepository) as T
            modelClass.isAssignableFrom(ChatMessageViewModel::class.java) -> ChatMessageViewModel(repository as ChatMessageRepository) as T

            else -> throw IllegalAccessException("ViewModel Class Not Found!")
        }
    }

}