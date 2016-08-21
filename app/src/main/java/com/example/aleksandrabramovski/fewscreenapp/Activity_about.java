package com.example.aleksandrabramovski.fewscreenapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Activity_about extends AppCompatActivity{
    private String mUser;
    private String mGift;
    private String mFrom;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        String user = "ЖЫвотное";
        String gift = "дырку от бубулика";
        String fromWhom = "Гадкий Абрам";
        mUser = getIntent().getExtras().getString("username");
        mGift = getIntent().getExtras().getString("gift");
        mFrom = getIntent().getExtras().getString("from");
        TextView InfoTExtView = (TextView)findViewById(R.id.textViewInfo);
        InfoTExtView.setText(mUser + ", вам передали " + mGift + " от " + mFrom);
    }
}
