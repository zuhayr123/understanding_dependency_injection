package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.ComputeLayer;
import com.example.understandingdependencyinjection.MainActivity;

import dagger.Component;

@Component (modules = NetworkModuleSecond.class)
public interface ComputeComponent {
    //annotation processing

    ComputeLayer getComputeLayer();

    void inject  (MainActivity mainActivity);
}
