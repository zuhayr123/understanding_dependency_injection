package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.ComputeLayer;
import com.example.understandingdependencyinjection.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent
public interface ActivityComponent {
    ComputeLayer getComputeLayer();

    void inject  (MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder{
        ActivityComponent build();
    }
}
