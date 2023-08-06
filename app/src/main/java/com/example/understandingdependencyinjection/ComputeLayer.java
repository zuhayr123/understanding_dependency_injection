package com.example.understandingdependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class ComputeLayer {
    String TAG = this.getClass().getCanonicalName();
    String layer = "Computation";
    NetworkSetup network;

    @Inject
    ComputeLayer(NetworkSetup networkSetup){
        this.network = networkSetup;
        Log.e(TAG, "Compute Layer Created");
    }

    public boolean add (int a , int b){
        int c = a+b;
        System.out.println(layer + " addition result " + c );
        return network.sendDataToCloud(Integer.toString(c));
    }


    public void subtract (int a , int b){
        int c = a-b;
        Log.e(TAG, " subtraction result " + c );
        network.sendDataToCloud(Integer.toString(c));
    }

    public void divide (int a , int b){
        double c = a/b;
        Log.e(TAG, " division result " + c );
        network.sendDataToCloud(Double.toString(c));
    }

    public void multiply (int a , int b){
        int c = a*b;
        Log.e(TAG, " multiplication result " + c );
        network.sendDataToCloud(Integer.toString(c));
    }
}
