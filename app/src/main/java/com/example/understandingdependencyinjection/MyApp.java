package com.example.understandingdependencyinjection;

import android.app.Application;

import com.example.understandingdependencyinjection.di.ComputeComponent;
import com.example.understandingdependencyinjection.di.DaggerComputeComponent;
import com.example.understandingdependencyinjection.di.NetworkModuleSecond;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MyApp extends DaggerApplication {
    private ComputeComponent component;
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerComputeComponent.factory().create(3000, 10, new NetworkModuleSecond());
    }

    public ComputeComponent getAppComponent(){
        return component;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerComputeComponent.factory().create(1000, 10, new NetworkModuleSecond());
    }
}
