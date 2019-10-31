package com.example.designpatterns.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatterns.R;
import com.example.designpatterns.proxyPattern.DynamicProxy;
import com.example.designpatterns.proxyPattern.ISubject;
import com.example.designpatterns.proxyPattern.LogSubject;
import com.example.designpatterns.proxyPattern.RealSubject;
import com.example.designpatterns.proxyPattern.TimeSubject;

import java.lang.reflect.Proxy;

public class ProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);

        RealSubject realSubject = new RealSubject();
        TimeSubject timeSubject = new TimeSubject(realSubject);
        LogSubject logSubject = new LogSubject(timeSubject);
        logSubject.doSomething();

//        RealSubject realSubject = new RealSubject();
//        DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
//        ClassLoader classLoader = realSubject.getClass().getClassLoader();
//        ISubject proxyInstance = (ISubject) Proxy.newProxyInstance(classLoader, realSubject.getClass().getInterfaces(), dynamicProxy);
//        proxyInstance.doSomething();
    }
}
