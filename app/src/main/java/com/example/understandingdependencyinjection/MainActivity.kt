package com.example.understandingdependencyinjection

import android.app.admin.NetworkEvent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.understandingdependencyinjection.di.ComputeComponent
import com.example.understandingdependencyinjection.di.DaggerComputeComponent
import com.example.understandingdependencyinjection.di.NetworkModuleSecond
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

        //Notice how the create method is chaned with a builder method instead

        val component = DaggerComputeComponent.builder().delay(100).status(10).networkModuleSecond(NetworkModuleSecond()).build()
        component.inject(this)

//        networkSetup = NetworkSetup()
//        computation = ComputeLayer(networkSetup)

        calculate?.setOnClickListener {
            computation.add(1,1)
            Log.e(TAG, "Button click detected")
        }
    Log.e(TAG, "Main Activity Created")
    }
}