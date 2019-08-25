package com.example.internet.Baro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.internet.Memo.MemoMainActivity;
import com.example.internet.R;

public class BaroMainActivity extends Activity {
//    String url = "http://naver.com";
//    String url2 = "http://google.com";
//    String url3 = "http://daum.com";
//    String url4 = "http://facebook.com";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);


//
//        String url = "http://google.com";
//        WebView webView =(WebView) findViewById(R.id.webView);
//        webView.setWebViewClient(new WebViewClient());
//
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//
//        webView.loadUrl(url);

        Button buttongit = (Button)findViewById(R.id.btn_git);
        buttongit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(BaroMainActivity.this, git_webview.class);
                startActivity(i);
            }
        });

        Button buttongoogle = (Button)findViewById(R.id.btn_google);
        buttongoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BaroMainActivity.this, google_webview.class);
                startActivity(i);

            }
        });


        Button buttondaum = (Button)findViewById(R.id.btn_daum);
        buttondaum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(BaroMainActivity.this, daum_webview.class);
                startActivity(i);
            }
        });
        Button buttonfacebook = (Button)findViewById(R.id.btn_facebook);
        buttonfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(BaroMainActivity.this, facebook_webview.class);
                startActivity(i);
            }
        });

    }
}
