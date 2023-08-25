package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.ComputeLayer;
import com.example.understandingdependencyinjection.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
@Singleton
@Component (modules = NetworkModuleSecond.class)
public interface ComputeComponent {

    ActivityComponent getActivityComponent();
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
