package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.ComputeLayer;
import com.example.understandingdependencyinjection.NetworkLayer;

import dagger.Module;
import dagger.Provides;

@Module
public class ComputeModule {
    @Provides
    @PerActivity
    ComputeLayer provideComputeLayer(NetworkLayer networkLayer) {
        return new ComputeLayer(networkLayer);
    }
}
