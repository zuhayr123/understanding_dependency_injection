package com.example.understandingdependencyinjection;

import android.util.Log;

import com.example.understandingdependencyinjection.di.PerActivity;

import java.util.Map;
import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Singleton;

@PerActivity
public class ComputeLayer {
    String TAG = this.getClass().getCanonicalName();
    String layer = "Computation";
    Map<String, NetworkLayer> network;

    @Inject
    public ComputeLayer(Map<String, NetworkLayer> networkLayer){
        this.network = networkLayer;
        Log.e(TAG, "Compute Layer Created uses network layer as " + networkLayer);
    }

    public boolean add (int a , int b){
        int c = a+b;
        System.out.println(layer + " addition result " + c );
        return Objects.requireNonNull(network.get("provideNetworkSetup")).sendDataToCloud(Integer.toString(c));
    }


    public void subtract (int a , int b){
        int c = a-b;
        Log.e(TAG, " subtraction result " + c );
        Objects.requireNonNull(network.get("provideNetworkSetupSecond")).sendDataToCloud(Integer.toString(c));
    }

    public void divide (int a , int b){
        double c = a/b;
        Log.e(TAG, " division result " + c );
        Objects.requireNonNull(network.get("provideNetworkSetupSecond")).sendDataToCloud(Double.toString(c));
    }

    public void multiply (int a , int b){
        int c = a*b;
        Log.e(TAG, " multiplication result " + c );
        Objects.requireNonNull(network.get("provideNetworkSetupSecond")).sendDataToCloud(Integer.toString(c));
    }
}
