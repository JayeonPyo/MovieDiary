package com.example.internet.Memo;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.internet.R;

public class WriteDiaryActivity extends AppCompatActivity {


    Button moviedata;


    //일기쓰기
    private DBManager dbmgr;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writediary);

//        Button moviedata = (Button)findViewById(R.id.moviedata);
////
////    moviedata.setOnClickListener(new View.OnClickListener() {
////        @Override
////        public void onClick(View v) {
////        Intent intent = new Intent(WriteDiaryActivity.this, MovieActivity.class);
////        startActivity(intent);
////        }
////    });

    }

    public void saveData(View v) {

        EditText et_name = (EditText) findViewById(R.id.edit_name);
        String diary_date = et_name.getText().toString();

        EditText et_name2 = (EditText)findViewById(R.id.edit_dairy);
        String diary_content = et_name2.getText().toString();


        try {
            dbmgr = new DBManager(this);


            SQLiteDatabase sdb;

            sdb = dbmgr.getWritableDatabase();
            sdb.execSQL("insert into diaryTB values('" + diary_date + "', '" + diary_content + "');");
            dbmgr.close();
        } catch (SQLiteException e) {
        }
        Intent it = new Intent(this, MemoMainActivity.class);
        startActivity(it);
        finish();


    }
}
