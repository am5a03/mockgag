package com.raymond.mockgag.di

import com.raymond.mockgag.MainActivity
import com.raymond.mockgag.data.ApiModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(
            modules = [
                ApiModule::class
            ]
    )
    internal abstract fun mainActivity(): MainActivity
}