package com.example.zhangfan.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicDetailActivity extends AppCompatActivity {

    private Button mTransList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_detail);
        mTransList = (Button) findViewById(R.id.transfer_list);
        mTransList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
