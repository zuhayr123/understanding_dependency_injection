package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.ComputeLayer;

import dagger.Component;

@Component
public interface ComputeComponent {
    //annotation processing

    ComputeLayer getComputeLayer();
}
