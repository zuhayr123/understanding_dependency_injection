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

    ActivityComponent.Builder getActivityBuilder();
    @Component.Factory
    interface Factory{
        ComputeComponent create(@BindsInstance @Named("delay") int delay
                                , @BindsInstance @Named("status")int status,
                                NetworkModuleSecond networkModuleSecond);

    }
}
