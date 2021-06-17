package com.developer.mvi_android.di.servicefactory

import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.BuildConfig


/**
 * @author allef.santos on 11/01/21
 */

object OkHttpLoggingFactory {
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = if (BuildConfig.DEBUG)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
    }


}