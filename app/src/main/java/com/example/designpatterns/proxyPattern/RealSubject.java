package com.example.designpatterns.proxyPattern;

import android.util.Log;

public class RealSubject implements ISubject{

    private static final String TAG = "RealSubject";

    @Override
    public void doSomething() {
        Log.d(TAG, "doSomething: 执行中");
    }
}
