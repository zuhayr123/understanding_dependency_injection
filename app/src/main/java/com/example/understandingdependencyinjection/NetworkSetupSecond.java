package com.example.understandingdependencyinjection;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class NetworkSetupSecond implements NetworkLayer{
    String TAG = this.getClass().getCanonicalName();
    StorageLayer storageLayer;
    @Inject
    public NetworkSetupSecond(StorageLayer storageLayer, @Named("delay") int delay, @Named("status") int status){
        this.storageLayer = storageLayer;
        try {
            Log.e(TAG, "Initialising network second and delay is :: " + delay + " and status is :: " + status );
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
