package com.developer.mvi_android.ui

import com.developer.mvi_android.data.model.User

sealed class UserState {
    object Idle : UserState()
    object Loading : UserState()
    data class Users(val user: List<User>) : UserState()
    data class Error(val error: String?) : UserState()
}