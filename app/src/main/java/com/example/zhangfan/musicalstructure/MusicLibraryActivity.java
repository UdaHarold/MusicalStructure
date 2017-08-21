package com.example.zhangfan.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicLibraryActivity extends AppCompatActivity {
    private Button mTransList;
    private Button mTransDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);
        mTransList = (Button) findViewById(R.id.transfer_list);
        mTransList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicLibraryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mTransDetail = (Button) findViewById(R.id.transfer_detail);
        mTransDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicLibraryActivity.this, MusicDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
