package com.example.internet.Memo;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.internet.R;


//TabWidjet을 만들고 탭을 택했을 경우 어떤 내용으로 채울지 >>>>>>>>>>>>>intent 연결하는 액티비티  위 상단바를 구성함 !
public class MemoMainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memomain);


        //첫번째 탭
        TabHost tabHost = getTabHost(); //The activity TabHost
        TabHost.TabSpec spec;

        Intent intent = new Intent().setClass(this,ShowMyData.class);

        spec = tabHost.newTabSpec("show").setIndicator("Watch").setContent(intent);
        tabHost.addTab(spec);


        //두번째 탭
        intent = new Intent().setClass(this,WriteDiaryActivity.class);
        spec = tabHost.newTabSpec("write").setIndicator("Write").setContent(intent);
        tabHost.addTab(spec);

        //세번쨰 탭
        intent = new Intent().setClass(this,AppHelpActivity.class);
        spec = tabHost.newTabSpec("help").setIndicator("App소개").setContent(intent);
        tabHost.addTab(spec);

        //처음 앱 실행시 탭 활성화 지정하기

        tabHost.setCurrentTab(0);


    }
}
