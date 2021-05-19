package com.example.togglebuttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton toggle = findViewById(R.id.toggle);
        Switch switcher = findViewById(R.id.switcher);
        LinearLayout test = findViewById(R.id.test);
        CompoundButton.OnCheckedChangeListener listener = (button, isChecked) -> {
            if (isChecked) {
                // 设置LinearLayout垂直布局
                test.setOrientation(LinearLayout.VERTICAL);
                toggle.setChecked(true);
                switcher.setChecked(true);
            } else {
                // 设置LinearLayout水平布局
                test.setOrientation(LinearLayout.HORIZONTAL);
                toggle.setChecked(false);
                switcher.setChecked(false);
            }
        };
        toggle.setOnCheckedChangeListener(listener);
        switcher.setOnCheckedChangeListener(listener);
    }
}