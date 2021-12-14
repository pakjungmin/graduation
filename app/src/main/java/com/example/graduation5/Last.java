package com.example.graduation5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Last extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
    }
        public void Click(View v){
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.seoul.go.kr/smgis2/short/6LCUz"));
            startActivity(myIntent);
        }
    }