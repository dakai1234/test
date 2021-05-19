package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View source)
    {
        // 获取UI界面中ID为R.id.show的文本框
        TextView tv = findViewById(R.id.show);
        // 改变文本框的文本内容
        tv.setText("Hello Android-" + new java.util.Date());
    }
}