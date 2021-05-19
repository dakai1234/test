package com.example.directionpage;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn = findViewById(R.id.bn);
        bn.setOnClickListener(view -> {
            Configuration config = getResources().getConfiguration();

            if (config.orientation == Configuration.ORIENTATION_LANDSCAPE){
                MainActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }

            if (config.orientation == Configuration.ORIENTATION_PORTRAIT) {
                MainActivity.this.setRequestedOrientation(
                        ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        String screen = newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE? "横向屏幕":"竖向屏幕";
        Toast.makeText(this,"系统的屏幕方向发生改变" + "\n修改后的屏幕方向为：" + screen, Toast.LENGTH_LONG).show();
    }
}