package com.example.smartvideo;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Button_record extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInsanceState){
        super.onCreate(savedInsanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.bigstone));
        setContentView(R.layout.layout_buttonrecord);


    }
}