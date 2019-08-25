package com.example.internet.Memo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


//앱 소개
public class AppHelpActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText("" + "\n" + "만든이 표자연");
        setContentView(textView);

    }

}
