package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.NetworkLayer;
import com.example.understandingdependencyinjection.NetworkSetupSecond;
import com.example.understandingdependencyinjection.StorageLayer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModuleSecond {
    @Singleton
    @Provides
    NetworkLayer provideNetworkSetupSecond(NetworkSetupSecond networkSetupSecond){
        return networkSetupSecond;
    }
}
