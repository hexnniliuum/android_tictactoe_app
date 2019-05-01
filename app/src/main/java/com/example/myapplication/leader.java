package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class leader extends AppCompatActivity {

    int spScore1 = tictac2.getSpHScore1();
    int spScore2 = tictac2.getSpHScore2();
    int spScore3 = tictac2.getSpHScore3();

    int mpScore1 = tictac1.getMpHScore1();
    int mpScore2 = tictac1.getMpHScore2();
    int mpScore3 = tictac1.getMpHScore3();

    private TextView textSpScore1;
    private TextView textSpScore2;
    private TextView textSpScore3;

    private TextView textMpScore1;
    private TextView textMpScore2;
    private TextView textMpScore3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leader);

        textSpScore1 = findViewById(R.id.ohs1);
        textSpScore2 = findViewById(R.id.ohs2);
        textSpScore3 = findViewById(R.id.ohs3);

        textMpScore1 = findViewById(R.id.mhs1);
        textMpScore2 = findViewById(R.id.mhs2);
        textMpScore3 = findViewById(R.id.mhs3);

        textSpScore1.setText("1st Highest Score: " + spScore1);
        textSpScore2.setText("2nd Highest Score: " + spScore2);
        textSpScore3.setText("3rd Highest Score: " + spScore3);

        textMpScore1.setText("1st Highest Score: " + mpScore1);
        textMpScore2.setText("2nd Highest Score: " + mpScore2);
        textMpScore3.setText("3rd Highest Score: " + mpScore3);
    }
}

