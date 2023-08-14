package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.NetworkLayer;
import com.example.understandingdependencyinjection.NetworkSetupSecond;
import com.example.understandingdependencyinjection.StorageLayer;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModuleSecond {

    @Provides
    NetworkLayer provideNetworkSetupSecond(NetworkSetupSecond networkSetupSecond){
        return networkSetupSecond;
    }
}
