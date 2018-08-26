package com.raymond.mockgag.data

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApiModule {
    companion object {
        @JvmField val API_URL = HttpUrl.parse("https://mock-api.9gaginc.com/")
        fun createApiClient(okHttpClient: OkHttpClient): OkHttpClient {
            return okHttpClient.newBuilder()
                    .build()
        }
    }

    @Provides @Singleton internal fun provideRetrofit(httpUrl: HttpUrl,
                                                      @Named("Api") client: OkHttpClient,
                                                      moshi: Moshi): Retrofit {
        return Retrofit.Builder()
                .client(client)
                .baseUrl(httpUrl)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    @Provides @Singleton internal fun provideBaseUrl(): HttpUrl {
        return API_URL!!
    }

    @Provides @Singleton @Named("Api") internal fun provideApiClient(okHttpClient: OkHttpClient): OkHttpClient {
        return createApiClient(okHttpClient)
    }
}