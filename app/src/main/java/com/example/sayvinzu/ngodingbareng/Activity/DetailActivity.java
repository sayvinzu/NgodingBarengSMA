package com.example.sayvinzu.ngodingbareng.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sayvinzu.ngodingbareng.R;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    TextView tv;
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        iv = (ImageView) findViewById(R.id.app_bar_image);
        setTitle(getIntent().getStringExtra("title"));

        Picasso.with(getApplicationContext()).load(getIntent().getIntExtra("imgBg",R.drawable.ic_account)).resize(800, 370).into(iv);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }
}
