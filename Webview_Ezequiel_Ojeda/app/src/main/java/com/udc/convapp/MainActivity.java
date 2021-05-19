package com.udc.convapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webapp=findViewById(R.id.webapp);
        webappconv();
    }

    public void webappconv(){
        webapp.getSettings().setDomStorageEnabled(true);
        webapp.getSettings().setJavaScriptEnabled(true);
        webapp.clearCache(true);
        webapp.clearFormData();
        webapp.clearHistory();
        webapp.setWebViewClient(new WebViewClient());
        webapp.loadUrl("https://www.amd.com/es");
    }
}