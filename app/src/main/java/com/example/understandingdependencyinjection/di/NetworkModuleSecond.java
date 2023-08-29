package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.NetworkLayer;
import com.example.understandingdependencyinjection.NetworkSetupSecond;
import com.example.understandingdependencyinjection.StorageLayer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@Module
public class NetworkModuleSecond {
    @Singleton
    @Provides
    @IntoMap
    @StringKey("provideNetworkSetupSecond")
    NetworkLayer provideNetworkSetupSecond(NetworkSetupSecond networkSetupSecond){
        return networkSetupSecond;
    }
}
