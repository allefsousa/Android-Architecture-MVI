package com.developer.mvi_android.data.repository

import com.developer.mvi_android.data.api.ServiceApi
import com.developer.mvi_android.data.model.User

class UserRepositoryImpl(private val serviceApi: ServiceApi) :UserRepository {
    override suspend fun getUsers(): List<User> {
        return serviceApi.getUsers()
    }
}