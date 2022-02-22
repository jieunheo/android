package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void onButtonClicked(View view) {

        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(myIntent);

    }

    public void onButton2Clicked(View view) {

        Intent myIntent = new Intent(getApplicationContext(), ThirdActivity.class);
        startActivity(myIntent);

    }
}