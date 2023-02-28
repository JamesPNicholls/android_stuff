package com.example.rollingdicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/dicegame.html")

    }
}