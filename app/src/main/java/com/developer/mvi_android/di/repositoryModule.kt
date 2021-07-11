package com.developer.mvi_android.di

import com.developer.mvi_android.data.repository.UserRepository
import com.developer.mvi_android.data.repository.UserRepositoryImpl
import org.koin.dsl.module

/**
 * @author allef.santos on 06/02/21
 */


val repositoryModule = module() {
    single<UserRepository> { UserRepositoryImpl(serviceApi = get()) }

}