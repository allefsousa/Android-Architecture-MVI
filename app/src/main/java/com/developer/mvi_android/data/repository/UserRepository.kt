package com.developer.mvi_android.data.repository

import com.developer.mvi_android.data.model.User

/**
 * @author allef.santos on 16/06/21
 */
interface UserRepository {
    suspend fun getUsers(): List<User>

}