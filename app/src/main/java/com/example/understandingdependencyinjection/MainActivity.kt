package com.example.understandingdependencyinjection

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    var calculate : Button? = null
    var TAG = this.javaClass.canonicalName

    @Inject
    lateinit var computation : ComputeLayer

    @Inject
    lateinit var computation2 : ComputeLayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate = findViewById(R.id.calculate_sum)

        //Notice how the create method is chaned with a builder method instead

//        val component = DaggerActivityComponent.builder().computeModule(ComputeModule(computation.network)).build()
//        component.inject(this)

//        networkSetup = NetworkSetup()
//        computation = ComputeLayer(networkSetup)

    Log.e(TAG, "computation 1 is : $computation + and second computation is $computation2" )

        calculate?.setOnClickListener {
            computation.add(1,1)
            Log.e(TAG, "Button click uses computeLayer to be ")
        }
    Log.e(TAG, "Main Activity Created")
    }
}