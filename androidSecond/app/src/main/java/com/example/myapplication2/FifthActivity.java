package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FifthActivity extends AppCompatActivity {
    Intent myIntent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    public void onButtonClicked(View view) {

        myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(myIntent);

    }

    public void onButton2Clicked(View view) {

        myIntent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(myIntent);

    }

    public void onButton3Clicked(View view) {

        myIntent = new Intent(getApplicationContext(), ThirdActivity.class);
        startActivity(myIntent);

    }

    public void onButton4Clicked(View view) {

        myIntent = new Intent(getApplicationContext(), FourthActivity.class);
        startActivity(myIntent);

    }

    public void onButton5Clicked(View view) {

        myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);

    }
}