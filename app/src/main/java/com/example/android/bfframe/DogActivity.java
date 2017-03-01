package com.example.android.bfframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class DogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);
    }
}


class LearnGesture extends GestureDetector.SimpleOnGestureListener{

    public boolean onFling(MotionEvent eventNext, MotionEvent eventBack, float velocityX, float velocityY){

        if(eventBack.getX() > eventNext.getX()){
            //left to right swipe

        }else
        if(eventBack.getX() < eventNext.getX()){
            //right to left swipe

        }
        return true;

    }
}