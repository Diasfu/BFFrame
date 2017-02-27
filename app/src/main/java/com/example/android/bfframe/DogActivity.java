package com.example.android.bfframe;

import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by diasf on 27/02/2017.
 */

public class DogActivity {



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
