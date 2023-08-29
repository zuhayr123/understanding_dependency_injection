package com.example.understandingdependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class NetworkSetup implements NetworkLayer {
    String TAG = this.getClass().getCanonicalName();
    StorageLayer storageLayer;

    @Inject
    public NetworkSetup(StorageLayer storageLayer){
        this.storageLayer = storageLayer;
        try {
            Log.e(TAG, "Initialising network first and delay is :: ");
            Thread.sleep(6000);
            Log.e(TAG,"Network initialization done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.e(TAG, "Network Layer Created");
    }

    @Override
    public boolean sendDataToCloud(String data) {
        Log.e(TAG,"Sending Data to cloud from networkSetup:: " + data);
        return true;
    }

    @Override
    public boolean saveDataToStorage(String data) {
        storageLayer.saveDataToStorage(data);
        return true;
    }
}
