package com.example.internet.Baro;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.internet.R;

public class git_webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_webview);

        String url = "https://github.com/JayeonPyo";
        WebView webView1 =(WebView) findViewById(R.id.webViewgit);
        webView1.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView1.loadUrl(url);
    }
}
