package com.example.internet.Memo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


//SQLiteOpenHelper를 상속받아 DB 생성 및 Table 생성하는 곳
public class DBManager extends SQLiteOpenHelper {

   public DBManager(Context context) {
       super (context, "csc",null,1);
   }

   @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("create table diaryTB (data1 text,data2 text);");
   }

   @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion){

   }
}
