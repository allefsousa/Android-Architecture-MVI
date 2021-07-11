package com.developer.mvi_android.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.developer.mvi_android.data.repository.UserRepository
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch
import java.lang.Exception

class UserViewModel(private val repository: UserRepository) :ViewModel()  {

    val userIntent = Channel<UserIntent>(Channel.UNLIMITED)
    private val _state = MutableStateFlow<UserState>(UserState.Idle)
    val state:StateFlow<UserState>
    get() = _state

    init {
        handlerIntent()
    }

    private fun handlerIntent() {
        viewModelScope.launch {
            userIntent.consumeAsFlow().collect {
                when(it){
                    is UserIntent.FetchUser -> fetchUser()
                }
            }
        }
    }

    private fun fetchUser() {
        viewModelScope.launch {
            _state.value = UserState.Loading
            _state.value = try {
                UserState.Users(repository.getUsers())
            }catch (exception:Exception){
                UserState.Error(exception.localizedMessage)
            }
        }
    }

}