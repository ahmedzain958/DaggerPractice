package com.zainco.daggerpractice.inflow

import android.util.Log
import javax.inject.Inject


class PatrolEngine @Inject constructor() : Engine {
    private val TAG = "Car"
    override fun start() {
        Log.d(TAG, "Patrol engine started")
    }
}