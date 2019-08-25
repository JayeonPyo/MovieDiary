package com.example.internet.Baro;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.internet.R;

public class facebook_webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_webview);

        String url = "http://www.facebook.com";
        WebView webView4 =(WebView) findViewById(R.id.webViewfacebook);
        webView4.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView4.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView4.loadUrl(url);
    }
}
