package com.example.understandingdependencyinjection

import android.app.admin.NetworkEvent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var calculate : Button? = null
    var TAG = this.javaClass.canonicalName
    var computation : ComputeLayer? = null
    var networkSetup: NetworkSetup? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate = findViewById(R.id.calculate_sum)

        networkSetup = NetworkSetup(6000)
        computation = ComputeLayer(networkSetup)

        calculate?.setOnClickListener {
            computation?.add(1,1)
            Log.e(TAG, "Button click detected")
        }
    }
}