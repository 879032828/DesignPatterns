package com.example.designpatterns.proxyPattern;

import android.util.Log;

public class TimeSubject implements ISubject {

    private static final String TAG = "TimeSubject";

    private ISubject iSubject;

    public TimeSubject(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void doSomething() {
        Log.d(TAG, "记录开始时间");
        this.iSubject.doSomething();
        Log.d(TAG, "记录结束时间");
    }
}
