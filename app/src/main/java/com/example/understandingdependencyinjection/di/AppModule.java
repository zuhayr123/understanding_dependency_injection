package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AppModule {

    @PerActivity
    @ContributesAndroidInjector
    public abstract MainActivity contributeMainActivity();
}
