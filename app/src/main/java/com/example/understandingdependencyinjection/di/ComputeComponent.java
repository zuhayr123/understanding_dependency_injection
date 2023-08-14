package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.ComputeLayer;
import com.example.understandingdependencyinjection.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component (modules = NetworkModuleSecond.class)
public interface ComputeComponent {
    //annotation processing

    ComputeLayer getComputeLayer();

    void inject  (MainActivity mainActivity);
    @Component.Builder
    interface Builder{
        ComputeComponent build();

        @BindsInstance
        Builder delay(@Named("delay") int delay);

        @BindsInstance
        Builder status(@Named("status")int status);

        Builder networkModuleSecond(NetworkModuleSecond networkModuleSecond);
    }
}
