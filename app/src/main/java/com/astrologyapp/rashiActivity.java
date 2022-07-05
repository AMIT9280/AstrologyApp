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

            webView.loadUrl("https://www.bhaskar.com/rashifal/1/today/");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setLoadsImagesAutomatically(true);
            webView.setWebViewClient(new Mywebview());

        }

    }

    private class Mywebview extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String request) {
            view.loadUrl(request);
            return true;
        }
    }
}