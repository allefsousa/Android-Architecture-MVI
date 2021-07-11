package com.developer.mvi_android.di

import com.developer.mvi_android.ui.UserViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * @author allef.santos on 07/02/21
 */

val viewModelModule = module(override = true) {
    viewModel { UserViewModel(get()) }
}