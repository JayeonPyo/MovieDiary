package com.example.internet.bookmark;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.internet.R;

public class BrowserActivity extends AppCompatActivity {

    private String URL = "url";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_browser);


        Intent intent = getIntent();
        String url = intent.getStringExtra(URL);


        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        //새창 X
        webView.loadUrl(url);

    }
}
