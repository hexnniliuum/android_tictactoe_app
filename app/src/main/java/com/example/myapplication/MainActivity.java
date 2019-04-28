package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    private static int HScoreSP = 0;
    private static int HScoreMP = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openTicTac1();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openTicTac2();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openLeader();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }
    public void openTicTac1(){
        Intent intent = new Intent(this, tictac1.class);
        startActivity(intent);
    }
    public void openTicTac2(){
        Intent intent = new Intent(this, tictac2.class);
        startActivity(intent);
    }
    public void openLeader(){
        Intent intent = new Intent(this, leader.class);
        startActivity(intent);
    }
    public static int getMpHScoreMain(){
        return HScoreMP;
    }
    public static int getSpHScoreMain(){
        return HScoreSP;
    }

}
