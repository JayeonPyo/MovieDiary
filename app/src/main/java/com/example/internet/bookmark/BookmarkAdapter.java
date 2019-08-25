package com.example.internet.bookmark;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.internet.R;

import java.util.ArrayList;

public class BookmarkAdapter extends BaseAdapter {

    private ArrayList<BookMark> bookMarks;

    public BookmarkAdapter(){
        bookMarks = new ArrayList<>();
    }

    public boolean hasDuplicate(BookMark bookMark){
        return bookMarks.contains(bookMark);
    }
    public void addBookmark(BookMark bookMark){
        bookMarks.add(bookMark);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return bookMarks.size();
    }

    @Override
    public Object getItem(int position) {
        return bookMarks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final  String URL = "url";
        final Context context = parent.getContext();
        final  BookMark bookMark = bookMarks.get(position);

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_bookmark,parent,false);


        }
        TextView tv_title = (TextView) convertView.findViewById(R.id.tv_title);

        tv_title.setText(bookMark.getTitle());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BrowserActivity.class);
                intent.putExtra(URL, bookMark.getUrl());
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
