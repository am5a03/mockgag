package com.raymond.mockgag.di

import com.raymond.mockgag.data.ApiModule
import dagger.Module

@Module(
        includes = [ApiModule::class]
)
class DataModule {
}