package com.example.understandingdependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class NetworkSetup {
    String TAG = this.getClass().getCanonicalName();
    StorageLayer storageLayer;


    public NetworkSetup(StorageLayer storageLayer){
        this.storageLayer = storageLayer;
        try {
            Log.e(TAG, "Initialising network" );
            Thread.sleep(6000);
            Log.e(TAG,"Network initialization done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.e(TAG, "Network Layer Created");
    }

    public boolean sendDataToCloud(String data){
        Log.e(TAG,"Sending Data to cloud :: " + data);
        saveDataToStorage(data);
        return true;
    }

    public boolean saveDataToStorage(String data){
        storageLayer.saveDataToStorage(data);
        return true;
    }
}
