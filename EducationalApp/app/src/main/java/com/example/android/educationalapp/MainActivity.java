package com.example.android.educationalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView startBounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startBounce =(TextView) findViewById(R.id.startbutton);
        Animation anima= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        startBounce.startAnimation(anima);
    }

    public void startQuiz(View view) {
        Intent i=new Intent(MainActivity.this,viewFlipper.class);
        startActivity(i);
    }
}
