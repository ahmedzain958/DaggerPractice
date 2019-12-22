package com.zainco.daggerpractice.inflow

import android.util.Log
import javax.inject.Inject


class DieselEngine @Inject constructor() : Engine {
    private val TAG = "Car"
    override fun start() {
        Log.d(TAG, "Diesel engine started")
    }
}