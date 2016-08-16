package com.example.user.homeworkday1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 16/08/2016.
 */
public class AnswerActivity2 extends AppCompatActivity {
    TextView mAnswerText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        mAnswerText = (TextView) findViewById(R.id.answer_text2);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");
        mAnswerText.setText(answer);
    }
}
