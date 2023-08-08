package com.example.understandingdependencyinjection;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class MethodDependency {
    String TAG = this.getClass().getCanonicalName();
    @Inject
    MethodDependency(){
        Log.e(TAG, "Method dependency was created");
    }

    public void setActivity(MainActivity mainActivity){
        mainActivity.getCheckbox();
        Log.e(TAG, "Toast Message was created");
        Toast.makeText(mainActivity, "Toast from Method Dependency", Toast.LENGTH_SHORT).show();
    }
}
