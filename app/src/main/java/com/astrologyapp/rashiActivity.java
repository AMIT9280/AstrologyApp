package com.astrologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rashiActivity extends AppCompatActivity {
String url = null;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rashi);
        webView= findViewById(R.id.web_view);
        Intent i = getIntent();
        int index = i.getIntExtra("KEY_DATA",0);

        if (index == 0){
            url = "https://www.astrosage.com/horoscope/daily-aries-horoscope.asp";
        }else if(index==1){
            url = "https://www.astrosage.com/horoscope/daily-taurus-horoscope.asp";
        }else if(index==2){
            url = "https://www.astrosage.com/horoscope/daily-gemini-horoscope.asp";
        }else if(index==3){
            url = "https://www.astrosage.com/horoscope/daily-gemini-horoscope.asp";
        }else if(index==4){
            url = "https://www.astrosage.com/horoscope/daily-leo-horoscope.asp";
        }else if(index==5){
            url = "https://www.astrosage.com/horoscope/daily-virgo-horoscope.asp";
        }else if(index==6){
            url = "https://www.astrosage.com/horoscope/daily-libra-horoscope.asp";
        }else if(index==7){
            url = "https://www.astrosage.com/horoscope/daily-scorpio-horoscope.asp";
        }else if(index==8){
            url = "https://www.astrosage.com/horoscope/daily-sagittarius-horoscope.asp";
        }else if(index==9){
            url = "https://www.astrosage.com/horoscope/daily-capricorn-horoscope.asp";
        }else if(index==10){
            url = "https://www.astrosage.com/horoscope/daily-aquarius-horoscope.asp";
        }else if(index==11){
            url = "https://www.astrosage.com/horoscope/daily-pisces-horoscope.asp";
        }


        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.setWebViewClient(new Mywebview());

    }

    private class Mywebview extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String request) {
            view.loadUrl(request);
            return true;
        }
    }
}