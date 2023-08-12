package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.NetworkLayer;
import com.example.understandingdependencyinjection.NetworkSetupSecond;
import com.example.understandingdependencyinjection.StorageLayer;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModuleSecond {

    int delay;

    public NetworkModuleSecond(int delay){
        this.delay = delay;
    }

    @Provides
    NetworkLayer provideNetworkSetupSecond(StorageLayer storageLayer){
        return new NetworkSetupSecond(storageLayer, delay);
    }
}
