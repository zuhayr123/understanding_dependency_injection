package com.example.understandingdependencyinjection;

import android.util.Log;

public class NetworkSetup {
    String TAG = this.getClass().getCanonicalName();

    NetworkSetup(long delay){
        try {
            Log.e(TAG, "Initialising network" );
            Thread.sleep(delay);
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
