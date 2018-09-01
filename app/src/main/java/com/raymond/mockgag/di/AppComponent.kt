package com.raymond.mockgag.di

import com.raymond.mockgag.MainApplication
import com.raymond.mockgag.shared.di.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            ActivityBindingModule::class,
            ViewModelModule::class,
            AppModule::class]
)
interface AppComponent: AndroidInjector<MainApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MainApplication>()
}