package com.example.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.designpatterns.activity.DecoratorActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Activity mContext;

    Button bt_decorator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        initView();
        initListener();
    }

    private void initView() {
        bt_decorator = findViewById(R.id.bt_decorator);
    }

    private void initListener() {
        bt_decorator.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_decorator:
                DecoratorActivity.start(mContext, new Intent(mContext, DecoratorActivity.class));
                break;
        }
    }
}
