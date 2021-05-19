package com.example.drawview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.jar.Attributes;

public class DrawView extends View {
    private float currentX = 40f;
    private  float currentY = 50f;
    //定义并创建画笔
    private Paint p = new Paint();
    public DrawView(Context context)
    {
        super(context);
    }

    public DrawView(Context context, AttributeSet set)
    {
        super(context, set);
    }
    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        //设置画笔的颜色
        p.setColor(Color.BLUE);
        //绘制一个小园
        canvas.drawCircle(currentX, currentY, 50F, p);

    }
    //为该组件的触碰事件重写事件处理方法
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        //修改currentX, currentY两个成员变量
        currentX = event.getX();
        currentY = event.getY();
        //通知当前组件重绘自己
        invalidate();
        //返回ture表明该处理方法已经处理该事件
        return true;
    }
}
