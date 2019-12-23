package com.zainco.daggerpractice.inflow

import android.util.Log
import javax.inject.Inject
import javax.inject.Named


class PatrolEngine @Inject
constructor(
    @Named("horsePower") val horsePower: Int,
    @Named("engineCapacity") val engineCapacity: Int
) :
    Engine {
    private val TAG = "Car"
    override fun start() {
        Log.d(TAG, "Patrol engine started $horsePower  $engineCapacity")
    }
}