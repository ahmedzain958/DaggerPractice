package com.zainco.daggerpractice.inflow

import dagger.Module
import dagger.Binds


@Module
abstract class DieselEngineModule {
    @Binds
     abstract fun bindEngine(engine: DieselEngine): Engine
}