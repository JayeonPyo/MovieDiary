package com.example.internet.Baro;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.internet.R;

public class daum_webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daum_webview);



        String url = "http://www.daum.net";
        WebView webView2 =(WebView) findViewById(R.id.webViewdaum);
        webView2.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView2.loadUrl(url);
    }
}
