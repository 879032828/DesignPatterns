package com.example.designpatterns.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.designpatterns.R;
import com.example.designpatterns.decoratorPattern.Component.Human;
import com.example.designpatterns.decoratorPattern.ConcreteComponent.Student;
import com.example.designpatterns.decoratorPattern.ConcreteDecorator.StudentDecorator;

public class DecoratorActivity extends AppCompatActivity {

    public static void start(Activity activity, Intent intent) {
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);

        //定义一个接口Human
        //定义一个被装饰的类Man
        //定义一个装饰的抽象类，内部持有被装饰类的引用
        //定义一个装饰的实现类

        Human human = new Student();
        StudentDecorator studentDecorator = new StudentDecorator(human);
        studentDecorator.run();
    }
}
