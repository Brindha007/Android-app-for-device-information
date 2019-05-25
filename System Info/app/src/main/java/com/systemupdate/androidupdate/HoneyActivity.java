package com.systemupdate.androidupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class HoneyActivity extends AppCompatActivity {
    WebView webView;

    public String fileName = "honey.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honey);
        // init webView
        webView = (WebView) findViewById(R.id.simpleWebView);
        // displaying content in WebView from html file that stored in assets folder
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/" + fileName);
    }
}
