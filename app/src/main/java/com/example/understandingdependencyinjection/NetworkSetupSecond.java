package com.example.understandingdependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class NetworkSetupSecond implements NetworkLayer{
    String TAG = this.getClass().getCanonicalName();
    StorageLayer storageLayer;
    @Inject
    public NetworkSetupSecond(StorageLayer storageLayer, int delay){
        this.storageLayer = storageLayer;
        try {
            Log.e(TAG, "Initialising network second and delay is " + delay );
            Thread.sleep(delay);
            Log.e(TAG,"Network Second initialization done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.e(TAG, "Network Layer Second Created");
    }

    @Override
    public boolean sendDataToCloud(String data) {
        Log.e(TAG,"Sending Data to cloud from second :: " + data);
        return true;
    }

    @Override
    public boolean saveDataToStorage(String data) {
        storageLayer.saveDataToStorage(data);
        return true;
    }
}
