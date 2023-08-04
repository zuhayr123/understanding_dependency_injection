package com.example.understandingdependencyinjection

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.understandingdependencyinjection.di.DaggerComputeComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    var calculate : Button? = null
    var TAG = this.javaClass.canonicalName

    @Inject
    lateinit var computation : ComputeLayer
//    var networkSetup: NetworkSetup? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate = findViewById(R.id.calculate_sum)
        val component = DaggerComputeComponent.create()
        component.inject(this)
        component.inject(computation)
        component.inject(computation.network)

//        networkSetup = NetworkSetup()
//        computation = ComputeLayer(networkSetup)

        calculate?.setOnClickListener {
            computation.add(1,1)
            Log.e(TAG, "Button click detected")
        }
    }
}