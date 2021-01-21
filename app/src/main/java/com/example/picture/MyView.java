package com.example.picture;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) { super (context); }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.rgb(0, 128, 0));
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0, getHeight() * 0.75f, getRight(), getBottom(), paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(0, getHeight() * 0.75f, getRight(), getBottom(), paint);

        //drawing a bench
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GRAY);
        canvas.drawRect(getWidth() * 0.74f, getHeight() * 0.78f, getWidth() * 0.95f, getHeight() * 0.83f, paint);
        canvas.drawRect(getWidth() * 0.79f, getHeight() * 0.83f, getWidth() * 0.82f, getHeight() * 0.9f, paint);
        canvas.drawRect(getWidth() * 0.868f, getHeight() * 0.83f, getWidth() * 0.895f, getHeight() * 0.9f, paint);

        // drawing a tree
        paint.setColor(Color.parseColor("#8B4513"));
        canvas.drawRect(getWidth() * 0.5f, getHeight() * 0.83f, getWidth() * 0.55f, getHeight() * 0.93f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        canvas.drawRect(getWidth() * 0.5f, getHeight() * 0.83f, getWidth() * 0.55f, getHeight() * 0.93f, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawOval(getWidth() * 0.42f, getHeight() * 0.3f, getWidth() * 0.63f, getHeight() * 0.87f, paint);

        // drawing the sun
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(0, 0, getWidth() * 0.105f, paint);
        for (int i = 0; i < 18; i++){
            canvas.rotate(5, 0,0);
            canvas.drawLine(0, 0 , getWidth() * 0.25f, 0, paint);
        }
        canvas.rotate(-90, 0,0);

        //drawing a house
        paint.setColor(Color.parseColor("#8B4513"));
        canvas.drawRect(getWidth() * 0.1f, getHeight() * 0.6f, getWidth() * 0.3f, getHeight() * 0.9f, paint);
        Path path = new Path();
        path.moveTo(getWidth() * 0.1f, getHeight() * 0.6f);
        path.lineTo(getWidth() * 0.2f, getHeight() * 0.4f);
        path.lineTo(getWidth() * 0.3f, getHeight() * 0.6f);
        canvas.drawPath(path, paint);


        //drawing outline
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(getWidth() * 0.74f, getHeight() * 0.78f, getWidth() * 0.95f, getHeight() * 0.83f, paint);
        canvas.drawRect(getWidth() * 0.79f, getHeight() * 0.83f, getWidth() * 0.82f, getHeight() * 0.9f, paint);
        canvas.drawRect(getWidth() * 0.868f, getHeight() * 0.83f, getWidth() * 0.895f, getHeight() * 0.9f, paint);
        canvas.drawOval(getWidth() * 0.42f, getHeight() * 0.3f, getWidth() * 0.63f, getHeight() * 0.87f, paint);
        canvas.drawPath(path, paint);
        canvas.drawRect(getWidth() * 0.1f, getHeight() * 0.6f, getWidth() * 0.3f, getHeight() * 0.9f, paint);

        //drawing details of a house
        canvas.drawRect(getWidth() * 0.17f, getHeight() * 0.65f, getWidth() * 0.23f, getHeight() * 0.85f, paint);
        float delta = getHeight() * 0.2f / 10;
        float x1 = getWidth() * 0.17f, y1 = getHeight() * 0.85f;
        float xx1 = x1, yy1 = y1;
        float deltaup = delta;
        for (int i = 0; i < 10; i++){
            if (x1 + delta <= getWidth() * 0.23f){
                canvas.drawLine(xx1, y1 - delta, x1 + delta, yy1, paint);
                y1 -= delta;
                x1 += delta;
            }
            else{
                canvas.drawLine(xx1, y1 - delta, getWidth() * 0.23f, getHeight() * 0.85f - deltaup, paint);
                deltaup += delta;
                y1 -= delta;
            }
        }

    }
}
