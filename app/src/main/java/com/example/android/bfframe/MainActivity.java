package com.example.android.bfframe;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.android.bfframe.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    //for adding swipe functionallity
    private GestureDetectorCompat gestureObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //swipe functionality
        gestureObject = new GestureDetectorCompat(this, new LearnGesture());
    }

    public void onClickCatButton(View view){
        //method that gets executed when CAT button on main customer screen gets pressed
        Intent intent = new Intent(this, CatActivity.class);
        startActivity(intent);
    }

    public void onClickDogButton(View view){
        //method that gets executed when DOG button on main customer screen gets pressed
        Intent intent = new Intent(this, DogActivity.class);
        startActivity(intent);
    }
}
