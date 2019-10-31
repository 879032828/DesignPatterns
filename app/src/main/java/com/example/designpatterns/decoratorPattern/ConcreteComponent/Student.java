package com.example.designpatterns.decoratorPattern.ConcreteComponent;

import android.util.Log;

import com.example.designpatterns.decoratorPattern.Component.Man;

/**
 * 被装饰的具体实现类
 */
public class Student extends Man {

    @Override
    public void run() {
        Log.d(TAG, "学生跑起来了");
    }
}
