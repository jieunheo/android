package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SixthActivity extends AppCompatActivity {
    int imageIndex = 0;
    ImageView imageview5 = null;
    ImageView imageview6 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        imageview5 = findViewById(R.id.imageView5);
        imageview6 = findViewById(R.id.imageView6);

    }

    public void onButtonClicked(View view) {

        changeImage();

    }

    private void changeImage() {

        if(imageIndex == 0) {

            imageview5.setVisibility(View.VISIBLE);
            imageview6.setVisibility(View.INVISIBLE);
            imageIndex = 1;

        } else if(imageIndex == 1) {

            imageview5.setVisibility(View.INVISIBLE);
            imageview6.setVisibility(View.VISIBLE);
            imageIndex = 0;

        }

    }
}