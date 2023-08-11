package com.example.understandingdependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class StorageLayer {
    String TAG = this.getClass().getCanonicalName();

    @Inject
    StorageLayer(){
        try {
            Log.e(TAG, "Initialising Storage" );
            Thread.sleep(1000);
            Log.e(TAG,"Storage initialization done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.e(TAG, "Storage Layer Created");
    }

    public boolean saveDataToStorage(String data){
        Log.e(TAG,"Saving data to storage:: " + data);
        return true;
    }
}
