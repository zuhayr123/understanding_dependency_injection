package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.ComputeLayer;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = ComputeComponent.class)
public interface ActivityComponent {
    ComputeLayer getComputeLayer();

    @Component.Builder
    interface Builder{
        ActivityComponent build();

        Builder computeComponent (ComputeComponent computeComponent);
    }
}
