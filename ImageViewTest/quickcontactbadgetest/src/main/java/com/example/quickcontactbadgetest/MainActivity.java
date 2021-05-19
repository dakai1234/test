package com.example.quickcontactbadgetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*获取QuickContactBadge组件*/
        QuickContactBadge badge = findViewById(R.id.badge);
        badge.assignContactFromPhone("1234-567-8899", false);
    }
}