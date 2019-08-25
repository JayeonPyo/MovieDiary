package com.example.internet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.internet.Baro.BaroMainActivity;
import com.example.internet.Memo.MemoMainActivity;
import com.example.internet.bookmark.MarkBrowserMainActivity;

public class MainActivity extends AppCompatActivity {




    Button go,right,left;
    EditText uri;
    WebView wv;
    View.OnClickListener cl;
    String weburi;



    class MyWeb extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            return super.shouldOverrideUrlLoading(view, url);


        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        wv.setWebContentsDebuggingEnabled(true);
        Button button = (Button) findViewById(R.id.btn_bookmark);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MarkBrowserMainActivity.class);
                startActivity(intent);

            }
        });


        Button buttonmemo = (Button)findViewById(R.id.btn_memo);
        buttonmemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MemoMainActivity.class);
                startActivity(i);
            }
        });


        Button buttonbaro = (Button)findViewById(R.id.btn_baro);
        buttonbaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, BaroMainActivity.class);
                startActivity(j);
            }
        });



    go = (Button) findViewById(R.id.go);
        right = (Button) findViewById(R.id.right);
        left = (Button) findViewById(R.id.left);
        uri = (EditText) findViewById(R.id.uri);
        wv = (WebView) findViewById(R.id.wv);
        wv.setWebViewClient(new MyWeb());
        wv.setWebChromeClient(new WebChromeClient());
        wv.setNetworkAvailable(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setDomStorageEnabled(true);


        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.go :
                        weburi = uri.getText().toString();
                        if (weburi.startsWith("https://")) {
                            wv.loadUrl(weburi);
                        } else {
                            wv.loadUrl("http://" + weburi);
                        }
                            break;

                        case  R.id.left  :
                            wv.goBack();
                            break;


                        case  R.id.right :
                            wv.goBack();
                            break;



                    }
                }
            };

        go.setOnClickListener(cl);
        right.setOnClickListener(cl);
        left.setOnClickListener(cl);
    }



}
