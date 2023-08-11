package com.example.understandingdependencyinjection;

public interface NetworkLayer {

    boolean sendDataToCloud(String data);

    boolean saveDataToStorage(String data);

}
