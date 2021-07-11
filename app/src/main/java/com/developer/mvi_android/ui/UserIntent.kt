package com.developer.mvi_android.ui

/**
 * @author allef.santos on 11/07/21
 */
sealed class UserIntent{
    object FetchUser : UserIntent()
}
