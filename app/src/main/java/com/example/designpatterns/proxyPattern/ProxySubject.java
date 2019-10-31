package com.example.designpatterns.proxyPattern;

import android.util.Log;

public class ProxySubject implements ISubject{

    private static final String TAG = "ProxySubject";

    @Override
    public void doSomething() {
        Log.d(TAG, "ProxySubject");
    }
}
