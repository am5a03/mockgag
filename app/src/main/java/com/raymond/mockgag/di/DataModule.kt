package com.raymond.mockgag.di

import android.app.Application
import com.raymond.mockgag.api.ApiService
import com.raymond.mockgag.data.ApiModule
import com.raymond.mockgag.data.PostRepository
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import java.io.File
import javax.inject.Named
import javax.inject.Singleton

@Module(
        includes = [ApiModule::class]
)
class DataModule {
    @Provides @Singleton fun provideMoshi(): Moshi {
        return Moshi.Builder().build()
    }

    @Provides @Singleton fun provideOkHttpClient(
            application: Application
    ): OkHttpClient {
        val cacheDir = File(application.cacheDir, "http")
        val cache = Cache(cacheDir, 50 * 1024 * 1024)

        return OkHttpClient.Builder()
                .cache(cache)
                .build()
    }

    @Provides @Singleton fun providePostRepository(
            @Named("apiService") apiService: ApiService
    ): PostRepository {
        return PostRepository(apiService)
    }
}