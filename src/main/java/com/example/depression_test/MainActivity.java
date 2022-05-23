package com.example.depression_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private int qno = 0;
    private TextView question_tv;
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    private EditText mMessageEditText;
    private String[] qarray = {"I always want to cry"
            ,"I feel bad"
            ,"I think I lose my temper more easily than before"
            ,"I can't sleep well"
            ,"I don't feel like eating"
            ,"I feel tightness in my chest"
            ,"I don't feel relaxed or comfortable"
            ,"I feel physically tired, weak and powerless"
            ,"I feel annoyed"
            ,"I have a bad memory"
            ,"I feel like I can't concentrate when I'm doing things"
            ,"I feel like I think or do things more slowly than usual"
            ,"I feel less confident than before"
            ,"I tend to see the negative in everything"
            ,"I feel like I take things too hard, I even want to die"
            ,"I feel like I'm losing interest in everything"
            ,"I feel sick"
            ,"I feel useless"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question_tv = (TextView) findViewById(R.id.question_tv);
    }

    public void button1Handler(View view) {
        showNext(view);
    }

    public void button2Handler(View view) {
        score++;
        showNext(view);
    }

    public void button3Handler(View view) {
        score +=2;
        showNext(view);
    }

    public void button4Handler(View view) {
        score +=3;
        showNext(view);
    }

    public void showNext(View view) {
        qno++;
        if (question_tv != null && qno < 18) {
            question_tv.setText(qarray[qno]);
        }
        else if(question_tv != null && qno >= 18){
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra(EXTRA_MESSAGE, score);
            startActivity(intent);
        }
    }
}