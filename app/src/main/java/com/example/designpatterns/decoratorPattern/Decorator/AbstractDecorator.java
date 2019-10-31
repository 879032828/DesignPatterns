package com.example.designpatterns.decoratorPattern.Decorator;

import com.example.designpatterns.decoratorPattern.Component.Human;

/**
 * 定义一个装饰的抽象类
 */
public abstract class AbstractDecorator implements Human {

    protected final String TAG = this.getClass().getSimpleName();

    //持有被装饰类的引用
    private Human human;

    //构造函数注入被装饰者
    //模块间的依赖通过抽象Human产生，而不是通过Man，符合依赖倒置原则
    public AbstractDecorator(Human human) {
        this.human = human;
    }

    //调用被装饰类的方法
    @Override
    public void run() {
        if (this.human != null) {
            this.human.run();
        }
    }
}
