package com.example.designpatterns.decoratorPattern.Component;

/**
 * 定义一个被装饰的类Man
 */
public abstract class Man implements Human {
    protected final String TAG = this.getClass().getSimpleName();
}
