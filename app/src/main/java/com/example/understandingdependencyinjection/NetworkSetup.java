package com.example.understandingdependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class NetworkSetup {
    String TAG = this.getClass().getCanonicalName();

    @Inject
    NetworkSetup(){
        try {
            Log.e(TAG, "Initialising network" );
            Thread.sleep(6000);
            Log.e(TAG,"Network initialization done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean sendDataToCloud(String data){
        Log.e(TAG,"Sending Data to cloud :: " + data);
        return true;
    }
}
