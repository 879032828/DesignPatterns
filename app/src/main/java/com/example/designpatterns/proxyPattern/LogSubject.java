package com.example.designpatterns.proxyPattern;

import android.util.Log;

public class LogSubject implements ISubject {

    private static final String TAG = "LogSubject";

    private ISubject iSubject;

    public LogSubject(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void doSomething() {
        Log.d(TAG, "开始打印日志");
        this.iSubject.doSomething();
        Log.d(TAG, "结束打印日志");
    }
}
