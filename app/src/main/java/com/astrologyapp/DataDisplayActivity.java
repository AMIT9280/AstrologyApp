package com.astrologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataDisplayActivity extends AppCompatActivity {
    TextView TvData,tvUsername,tvtime,tvdate;
    ListView listView;
    String rashi[] = {"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Saggitarius","Capricorn","Aquarius","Pisces"};
    int ImgList [] ={R.drawable.arias,R.drawable.taurus,R.drawable.gemini,R.drawable.cancer
    ,R.drawable.leo,R.drawable.virgo,R.drawable.libra,R.drawable.scorpio,R.drawable.saggitarius,R.drawable.capricorn,R.drawable.aquarius,R.drawable.pisces};

    ArrayList<RashiModel> rashiModelArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);
        listView = findViewById(R.id.list_view);


       rashiModelArrayList = new ArrayList<RashiModel>();
        for (int i=0; rashi.length>i; i++){
            RashiModel rashiModel = new RashiModel(rashi[i],ImgList[i]);
            rashiModelArrayList.add(rashiModel);
        }
        myBaseAdaptr mybaseAdapter = new myBaseAdaptr(this,rashiModelArrayList);
        listView.setAdapter(mybaseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent I = new Intent(DataDisplayActivity.this,rashiActivity.class);
                I.putExtra("KEY_DATA",i);

                startActivity(I);

            }
        });

    }
}