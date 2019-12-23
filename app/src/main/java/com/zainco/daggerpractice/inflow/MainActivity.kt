package com.zainco.daggerpractice.inflow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.zainco.daggerpractice.R.layout.activity_main)
        val component = DaggerCarComponent.builder()
            .horsePower(100)

//        car = component.getCar()
        component.inject(this)
        car.drive()
    }
}
