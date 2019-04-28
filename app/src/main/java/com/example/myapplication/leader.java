package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class leader extends AppCompatActivity {

    int spScore = tictac2.getSpHScore();
    int mpScore = tictac1.getMpHScore();

    private TextView textSpScore;
    private TextView textMpScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leader);

        textSpScore = findViewById(R.id.textView2);
        textMpScore = findViewById(R.id.textView4);

        textSpScore.setText("High Score: " + spScore);
        textMpScore.setText("High Score: " + mpScore);
    }
}

