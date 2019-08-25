package com.example.internet.bookmark;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.internet.R;
import com.example.internet.bookmark.BookMark;
import com.example.internet.bookmark.BookmarkAdapter;

public class MarkBrowserMainActivity extends AppCompatActivity {

    private EditText et_url;
    private Button btn_add;
    private ListView lv_bookmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star);


        init();


        final BookmarkAdapter bookmarkAdapter = new BookmarkAdapter();
        lv_bookmark.setAdapter(bookmarkAdapter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String url = et_url.getText().toString();


                if (isUrl(url)) {
                    BookMark bookMark = new BookMark(url);

                    if (bookmarkAdapter.hasDuplicate(bookMark)) {
                        showToast(getString(R.string.duplicate));
                    } else {
                        bookmarkAdapter.addBookmark(bookMark);
                        showToast(getString(R.string.complete));
                    }

                } else {
                    showToast(getString(R.string.wrong));
                }
            }
        });

    }

    public  void  showToast(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }


    //텍스트 형식 판단 - 정규표현식 사용용

   public boolean isUrl(String url) {
        String urlRegex = "^(file|gopher|news|nntp|telnet|https?|ftps?|sftp)://([a-z0-9-]+.)+[a-z0-9]{2,4}.*$";
        return url.matches(urlRegex);
    }

    private void init() {
        et_url = (EditText) findViewById(R.id.et_url);
        btn_add = (Button) findViewById(R.id.btn_add);
        lv_bookmark = (ListView) findViewById( R.id.lv_bookmark);


    }
}
