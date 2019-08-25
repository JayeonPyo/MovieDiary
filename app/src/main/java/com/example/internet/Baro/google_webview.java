package com.example.internet.Baro;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.internet.R;

public class google_webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_webview);

        String url = "http://google.com";
        WebView webView1 =(WebView) findViewById(R.id.webViewgoogle);
        webView1.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView1.loadUrl(url);

    }

}
