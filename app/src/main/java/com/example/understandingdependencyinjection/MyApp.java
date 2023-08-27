package com.example.understandingdependencyinjection;

import android.app.Application;

import com.example.understandingdependencyinjection.di.ComputeComponent;
import com.example.understandingdependencyinjection.di.DaggerComputeComponent;
import com.example.understandingdependencyinjection.di.NetworkModuleSecond;

public class MyApp extends Application {
    private ComputeComponent component;
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerComputeComponent.factory().create(100, 10, new NetworkModuleSecond());
    }

    public ComputeComponent getAppComponent(){
        return component;
    }
}
