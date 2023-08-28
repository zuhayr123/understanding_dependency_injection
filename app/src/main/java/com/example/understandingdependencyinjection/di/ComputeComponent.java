package com.example.understandingdependencyinjection.di;

import com.example.understandingdependencyinjection.MyApp;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component (modules = {AppModule.class, AndroidSupportInjectionModule.class, NetworkModuleSecond.class})
public interface ComputeComponent extends AndroidInjector<MyApp> {

    @Component.Factory
    interface Factory {
        ComputeComponent create(@BindsInstance @Named("delay") int delay
                , @BindsInstance @Named("status")int status,
                                NetworkModuleSecond networkModuleSecond);
    }
}
