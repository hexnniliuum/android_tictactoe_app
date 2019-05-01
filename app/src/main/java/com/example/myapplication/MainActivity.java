package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button savestate;

    public static int HScoreMP1 = 0;
    public static int HScoreMP2 = 0;
    public static int HScoreMP3 = 0;
    public static int HScoreSP1 = 0;
    public static int HScoreSP2 = 0;
    public static int HScoreSP3 = 0;

    public static final String shared_Prefs = "sharedPrefs";
    public static final String HScoreMP1sp = "0";
    public static final String HScoreMP2sp = "0";
    public static final String HScoreMP3sp = "0";
    public static final String HScoreSP1sp = "0";
    public static final String HScoreSP2sp = "0";
    public static final String HScoreSP3sp = "0";

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

        savestate = (Button) findViewById(R.id.savestate);
        savestate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                saveData();
            }
        });



        loadData();

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
    public static int getMpHScoreMain1(){
        return HScoreMP1;
    }
    public static int getSpHScoreMain1(){
        return HScoreSP1;
    }
    public static int getMpHScoreMain2(){
        return HScoreMP2;
    }
    public static int getSpHScoreMain2(){
        return HScoreSP2;
    }
    public static int getMpHScoreMain3(){
        return HScoreMP3;
    }
    public static int getSpHScoreMain3(){
        return HScoreSP3;
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(shared_Prefs, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(HScoreMP1sp, HScoreMP1);
        editor.putInt(HScoreMP2sp, HScoreMP2);
        editor.putInt(HScoreMP3sp, HScoreMP3);
        editor.putInt(HScoreSP1sp, HScoreSP1);
        editor.putInt(HScoreSP2sp, HScoreSP2);
        editor.putInt(HScoreSP3sp, HScoreSP3);
        editor.apply();
    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(shared_Prefs, MODE_PRIVATE);
        HScoreMP1 = sharedPreferences.getInt(HScoreMP1sp, 0);
        HScoreMP2 = sharedPreferences.getInt(HScoreMP2sp, 0);
        HScoreMP3 = sharedPreferences.getInt(HScoreMP3sp, 0);
        HScoreSP1 = sharedPreferences.getInt(HScoreSP1sp, 0);
        HScoreSP2 = sharedPreferences.getInt(HScoreSP2sp, 0);
        HScoreSP3 = sharedPreferences.getInt(HScoreSP3sp, 0);
    }



}
