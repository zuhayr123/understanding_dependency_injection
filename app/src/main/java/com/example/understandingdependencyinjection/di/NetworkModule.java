package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.NetworkSetup;
import com.example.understandingdependencyinjection.StorageLayer;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    StorageLayer provideStorageLayer(){
        return new StorageLayer();
    }

    @Provides
    NetworkSetup provideNetworkSetup(StorageLayer storageLayer){
        return new NetworkSetup(storageLayer);
    }
}
