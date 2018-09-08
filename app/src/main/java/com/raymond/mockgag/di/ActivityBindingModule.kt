package com.raymond.mockgag.di

import com.raymond.mockgag.MainActivity
import com.raymond.mockgag.data.ApiModule
import com.raymond.mockgag.shared.di.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(
            modules = [
                ApiModule::class
            ]
    )
    internal abstract fun mainActivity(): MainActivity
}