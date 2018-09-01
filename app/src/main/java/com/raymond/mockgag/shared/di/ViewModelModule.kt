package com.raymond.mockgag.shared.di

import androidx.lifecycle.ViewModelProvider
import dagger.Module

@Module
abstract class ViewModelModule {
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory):
            ViewModelProvider.Factory
}