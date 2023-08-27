package com.example.understandingdependencyinjection

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject
import dagger.Lazy
import javax.inject.Provider


class MainActivity : AppCompatActivity() {
    var calculate : Button? = null
    var TAG = this.javaClass.canonicalName

//    @Inject
//    lateinit var computation : ComputeLayer

    @Inject
    lateinit var lazyComputation: Provider<ComputeLayer>

//    @Inject
//    lateinit var computation2 : ComputeLayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate = findViewById(R.id.calculate_sum)

        val component = (application as MyApp).appComponent.activityBuilder.build()

        component.inject(this)

//    Log.e(TAG, "computation 1 is : $computation + and second computation is $computation2" )

        calculate?.setOnClickListener {
            Log.e(TAG, "Uses ComputeLayer instance with hash ${lazyComputation.get()}")
            lazyComputation.get()?.add(1,1)
        }
    Log.e(TAG, "Main Activity Created")
    }
}