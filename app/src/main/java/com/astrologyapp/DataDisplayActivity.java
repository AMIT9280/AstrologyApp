package com.astrologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataDisplayActivity extends AppCompatActivity {
    TextView TvData,tvUsername,tvtime,tvdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);
        tvUsername = findViewById(R.id.Tv_pData);
        tvtime = findViewById(R.id.tv_time);



        Intent i = getIntent();
        String strdata = i.getStringExtra("KEY_FN");
        String strdata1 = i.getStringExtra("KEY_LN");
        String strRating = i.getStringExtra("KEY_RATING");

        tvUsername.setText("UserName:  "+strdata+""+strdata1);
        tvtime.setText("Rating is: "+strRating);
    }
}