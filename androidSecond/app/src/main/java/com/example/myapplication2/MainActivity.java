package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ibtn = findViewById(R.id.imageView2);
        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"나는 이미지입니다.", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1111-2222"));
                startActivity(myIntent);
            }
        });
    }

    public void onStarClicked(View view) {

        Toast.makeText(this,"나는 별입니다.", Toast.LENGTH_SHORT).show();

    }
}