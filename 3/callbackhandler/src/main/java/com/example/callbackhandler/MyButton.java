package com.example.callbackhandler;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class MyButton extends androidx.appcompat.widget.AppCompatButton
{
    public MyButton(Context context, AttributeSet set)
    {
        super(context, set);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)

    {
        super.onTouchEvent(event);
        Log.v("-crazyit.org-", "the onTouchEvent in MyButton");
        // 返回true，表明该事件不会向外传播
        return true;
    }
}