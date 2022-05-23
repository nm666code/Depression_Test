package com.example.depression_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView score_tv;
    private TextView content_tv;

    private String[] contents = {
            "Your current emotional state is very stable, and you are a person who knows how to adjust your emotions and relieve stress."
            , "Have your emotions been up and down lately? Or is something bothering you? Pay more attention to yourself, pay more attention to emotional changes, Try to understand the reasons for your mood changes and deal with them timely, so that you will be less likely to fall into depression."
            , "Do you want to laugh but can't laugh very well, there are many things on your heart, and your shoulders always feel heavy? Because your pressure load has reached a critical point, don't \"hold\" any more! Hurry up and talk to a friend who has the same experience, find an outlet for your mood, put down the burden on your shoulders, so as not to fall into the whirlpool of depression!"
            , "Right now, you must feel quite unhappy, unable to show a smile, full of distress and annoyance, and even friends don’t know how to help you. Hurry up to find professional counseling institutions or medical units, with their assistance, you will be able to regain your smile!"
            , "Do you feel quite uncomfortable, involuntarily depressed, sad, unable to break free? Because your heart has \"cold\", you need heart medicine, go to the hospital to find a professional and reliable doctor for examination, through their diagnosis and treatment, you will no longer feel lonely and helpless!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int score = intent.getIntExtra(MainActivity.EXTRA_MESSAGE,0);
        score_tv = (TextView) findViewById(R.id.score_tv);
        score_tv.setText("Score: "+Integer.toString(score));
        content_tv = (TextView) findViewById(R.id.content_tv);
        content_tv.setText(contents[decideContents(score)]);
    }

    private int decideContents(int score){
        if(score<=8)
            return 0;
        else if(score<=14)
            return 1;
        else if(score<=18)
            return 2;
        else if(score<=28)
            return 3;
        else
            return 4;
    }
}