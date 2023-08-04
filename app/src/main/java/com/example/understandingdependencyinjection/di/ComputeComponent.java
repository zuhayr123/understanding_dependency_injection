package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.ComputeLayer;
import com.example.understandingdependencyinjection.MainActivity;
import com.example.understandingdependencyinjection.NetworkSetup;

import dagger.Component;

@Component
public interface ComputeComponent {
    //annotation processing

    ComputeLayer getComputeLayer();

    void inject  (MainActivity mainActivity);

    void inject  (ComputeLayer computeLayer);

    void inject  (NetworkSetup networkSetup);
}
