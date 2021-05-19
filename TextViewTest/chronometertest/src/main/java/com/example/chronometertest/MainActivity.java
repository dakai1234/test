package com.example.chronometertest;



import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 获取计时器组件
        Chronometer ch = findViewById(R.id.test);
        // 获取“开始”按钮
        Button start = findViewById(R.id.start);
        start.setOnClickListener((view) ->
        {
            // 设置开始计时时间
            ch.setBase(SystemClock.currentThreadTimeMillis());
            // 启动计时器
            ch.start();
            start.setEnabled(false);
        });
        // 为Chronometer绑定事件监听器
        ch.setOnChronometerTickListener((source) -> {
            // 如果从开始计时到现在超过了30s
            if (SystemClock.elapsedRealtime() - ch.getBase() > 30 * 1000) {
                ch.stop();
                start.setEnabled(true);
            }
        });
    }
}