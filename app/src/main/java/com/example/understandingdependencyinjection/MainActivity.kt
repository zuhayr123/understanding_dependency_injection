package com.example.understandingdependencyinjection

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject
import dagger.Lazy
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Provider


class MainActivity : DaggerAppCompatActivity() {
    var calculate : Button? = null
    var subtract : Button? = null
    var TAG = this.javaClass.canonicalName

    @Inject
    lateinit var lazyComputation: Provider<ComputeLayer>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate = findViewById(R.id.calculate_sum)
        subtract = findViewById(R.id.subtract)


        calculate?.setOnClickListener {
            Log.e(TAG, "Uses ComputeLayer instance with hash ${lazyComputation.get()}")
            lazyComputation.get()?.add(1,1)
        }

        subtract?.setOnClickListener {
            Log.e(TAG, "Uses ComputeLayer instance with hash ${lazyComputation.get()}")
            lazyComputation.get()?.subtract(1,1)
        }

    Log.e(TAG, "Main Activity Created")
    }
}