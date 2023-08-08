package com.example.understandingdependencyinjection

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.example.understandingdependencyinjection.di.DaggerComputeComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    var calculate : Button? = null
    var checkbox : CheckBox? = null
    var TAG = this.javaClass.canonicalName

    @Inject
    lateinit var computation : ComputeLayer

    lateinit var methodDependency: MethodDependency
//    var networkSetup: NetworkSetup? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    Log.e(TAG, "Main Activity Created Ready to be Injected")
        calculate = findViewById(R.id.calculate_sum)
        checkbox = findViewById(R.id.checkbox)
        val component = DaggerComputeComponent.create()
        component.inject(this)

//        networkSetup = NetworkSetup()
//        computation = ComputeLayer(networkSetup)

        calculate?.setOnClickListener {
            computation.add(1,1)
            Log.e(TAG, "Button click detected")
        }
    Log.e(TAG, "Main Activity Created")
    }

    @Inject
    fun setMyDependency(methodDependency: MethodDependency ) {
        this.methodDependency = methodDependency
        this.methodDependency.setActivity(this)
    }
}