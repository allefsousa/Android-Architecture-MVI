package com.developer.mvi_android

import android.app.Application
import com.developer.mvi_android.di.viewModelModule
import com.developer.mvi_android.di.repositoryModule
import com.developer.mvi_android.di.serviceModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level


class ApplicationApp :Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@ApplicationApp)
            modules(repositoryModule + serviceModule + viewModelModule)
        }
    }
}