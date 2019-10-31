package com.example.designpatterns.decoratorPattern.ConcreteDecorator;

import android.util.Log;

import com.example.designpatterns.decoratorPattern.Component.Human;
import com.example.designpatterns.decoratorPattern.Decorator.AbstractDecorator;

/**
 * 定义一个具体的装饰类
 */
public class StudentDecorator extends AbstractDecorator {

    public StudentDecorator(Human human) {
        super(human);
    }

    private void fly() {
        Log.d(TAG, "学生飞起来了");
    }

    @Override
    public void run() {
        super.run();
        fly();
    }
}
