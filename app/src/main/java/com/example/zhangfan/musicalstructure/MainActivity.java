package com.example.zhangfan.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mTransLib;
    private Button mTransDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTransLib = (Button) findViewById(R.id.transfer_library);
        mTransLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(intent);
            }
        });

        mTransDetail = (Button) findViewById(R.id.transfer_detail);
        mTransDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MusicDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
