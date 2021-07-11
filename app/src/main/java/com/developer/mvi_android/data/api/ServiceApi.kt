package com.developer.mvi_android.data.api

import com.developer.mvi_android.data.model.User
import retrofit2.http.GET

/**
 * @author allef.santos on 16/06/21
 */
interface ServiceApi {

    @GET("users")
    suspend fun getUsers(): List<User>

}