package com.example.user.homeworkday1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 15/08/2016.
 */
public class HomeworkDay1 extends AppCompatActivity {
    EditText mQuestionEditText;
    Button mPlayer1Button;
    Button mPlayer2Button;
    RandomText randomText;
    RandomText randomText2;
    @Override
         protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        randomText = new RandomText("YES", "MAYBE","NO");
        randomText2 = new RandomText("SI", "FORSE", "NO");
        mPlayer1Button = (Button) findViewById(R.id.player1);
        mPlayer2Button = (Button) findViewById(R.id.player2);

        mPlayer1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word1 = randomText.takeRandomWord();
                Log.d("HomeworkDay1", word1);
                Intent intent = new Intent(HomeworkDay1.this, AnswerActivity1.class);
                intent.putExtra("answer", word1);
                startActivity(intent);
            }
        });
        mPlayer2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word2 = randomText2.takeRandomWord();
                Log.d("HomeworkDay1", word2);
                Intent intent1 = new Intent(HomeworkDay1.this, AnswerActivity2.class);
                intent1.putExtra("answer", word2);
                startActivity(intent1);
            }
        });

    }

}
