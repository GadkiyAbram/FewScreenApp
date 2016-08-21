package com.example.aleksandrabramovski.fewscreenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mButtonAbout;
    private Button mButtonToTheNextPage;
    private Button mButtonSendMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonAbout = (Button)findViewById(R.id.button1);
        mButtonToTheNextPage = (Button)findViewById(R.id.button);
        mButtonSendMessage = (Button)findViewById(R.id.buttonSendMessage);
    }

    public void onClick(View view) {
        mButtonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userEditText = (EditText)findViewById(R.id.editTextTo);
                EditText giftEditText = (EditText)findViewById((R.id.editTextWhat));
                EditText fromWhomEditText = (EditText)findViewById(R.id.editTextFrom);
                Intent intentSend = new Intent(MainActivity.this, Activity_about.class);
                intentSend.putExtra("username", userEditText.getText().toString());
                intentSend.putExtra("gift", giftEditText.getText().toString());
                intentSend.putExtra("from", fromWhomEditText.getText().toString());
                startActivity(intentSend);
            }
        });
       //mButtonAbout.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //Intent intentAbout = new Intent(MainActivity.this, Activity_about.class);
                //startActivity(intentAbout);
            //}
        //});
        mButtonToTheNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNext = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intentNext);
            }
        });
    }
}
