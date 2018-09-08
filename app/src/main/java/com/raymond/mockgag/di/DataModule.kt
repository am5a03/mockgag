package com.raymond.mockgag.di

import com.raymond.mockgag.api.ApiService
import com.raymond.mockgag.data.ApiModule
import com.raymond.mockgag.data.PostRepository
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module(
        includes = [ApiModule::class]
)
class DataModule {
    @Provides @Singleton fun provideMoshi(): Moshi {
        return Moshi.Builder().build()
    }

    @Provides @Singleton fun providePostRepository(
            @Named("apiService") apiService: ApiService
    ): PostRepository {
        return PostRepository(apiService)
    }
}