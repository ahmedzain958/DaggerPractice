package com.zainco.daggerpractice.di

import android.app.Application
//import com.zainco.daggerpractice.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
/*

@Component(
    modules =
    [AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class]
)
interface AppComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        //mandatory step
        fun build(): AppComponent
    }
}*/
