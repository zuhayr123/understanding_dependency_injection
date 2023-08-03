package com.example.understandingdependencyinjection;

import android.util.Log;

public class ComputeLayer {
    String TAG = this.getClass().getCanonicalName();
    String layer = "Computation";
    NetworkSetup network;

    ComputeLayer(NetworkSetup networkSetup){
        this.network = networkSetup;
    }

    public void add (int a , int b){
        int c = a+b;
        System.out.println(layer + " addition result " + c );
        network.sendDataToCloud(Integer.toString(c));
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
