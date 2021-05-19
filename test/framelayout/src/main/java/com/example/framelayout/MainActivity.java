package com.example.framelayout;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    int[] names = new int[] {R.id.view01, R.id.view02, R.id.view03, R.id.view04,
            R.id.view05, R.id.view06, R.id.view07, R.id.view08};

    TextView[] views = new TextView[names.length];

    class MyHandler extends Handler
    {
        private WeakReference<MainActivity> activity;
        public MyHandler(WeakReference<MainActivity> activity)
        {
            this.activity = activity;
        }

    private int currentColor = 0;
    // 定义一个颜色数组
    int[] colors = new int[] {R.color.color1, R.color.color2, R.color.color3, R.color.color4,
            R.color.color5, R.color.color6, R.color.color7, R.color.color8};
        @Override
        public void handleMessage(Message msg)
        {
            //表明消息是来自本程序发送的
            if (msg.what == 0x123)
            {
                for (int i = 0, len = activity.get().names.length; i < len; i++)
                {
                    activity.get().views[i].setBackgroundResource(
                        colors[ (i + currentColor) % colors.length]);
                }
                 currentColor++;
            }
            super.handleMessage(msg);
        }
    }
    private  Handler handler = new MyHandler(new WeakReference(this));
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < names.length; i++)
        {
            views[i] = findViewById(names[i]);
        }
        //定义一个线程周期性改变currentColor
        new Timer().schedule(new TimerTask()
        {
            public void run()
            {
                //发送一条空消息通知系统改变8个TextView组件的背景色
                handler.sendEmptyMessage(0x123);
            }
        },0, 200);
    }
}