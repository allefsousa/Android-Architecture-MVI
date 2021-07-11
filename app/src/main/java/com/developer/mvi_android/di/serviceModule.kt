package com.developer.mvi_android.di

import com.developer.mvi_android.BuildConfig
import com.developer.mvi_android.di.servicefactory.OkHttpFactory
import com.developer.mvi_android.di.servicefactory.OkHttpLoggingFactory
import com.developer.mvi_android.di.servicefactory.RetrofitFactory
import com.developer.mvi_android.data.api.ServiceApi
import org.koin.dsl.module

/**
 * @author allef.santos on 06/02/21
 */

val serviceModule = module(override = true) {
    single { OkHttpLoggingFactory.provideHttpLoggingInterceptor() }
    single { OkHttpFactory.providesOkHttpClient(get()) }
    single { RetrofitFactory.createWebService<ServiceApi>(get(), BuildConfig.API_HOST) }

}