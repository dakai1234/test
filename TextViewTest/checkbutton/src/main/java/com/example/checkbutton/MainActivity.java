package com.example.checkbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取界面上的rg,show两个组件
        RadioGroup rg = findViewById(R.id.rg);
        TextView show = findViewById(R.id.show);
        //为RadioGroup组件的OnCheckedChange事件绑定事件监听器
        rg.setOnCheckedChangeListener((group, checkedId) -> {
            String tip = checkedId == R.id.male ? "您的性别是男人" :
            "您的性别是女人";
            show.setText(tip);
        });
    }
}