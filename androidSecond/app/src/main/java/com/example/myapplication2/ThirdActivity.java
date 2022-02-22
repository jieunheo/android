package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void onButtonClick(View view) {
        
        //두번째 화면으로 가기
        Intent myIntent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(myIntent);
        
    }

    public void onButton2Click(View view) {

        //첫번째 화면으로 가기
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(myIntent);
        
    }
}