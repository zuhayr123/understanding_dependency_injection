package com.example.understandingdependencyinjection;

public interface NetworkLayer {

    public boolean sendDataToCloud(String data);

    public boolean saveDataToStorage(String data);

}
