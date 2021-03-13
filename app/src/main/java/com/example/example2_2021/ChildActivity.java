package com.example.example2_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    String anyString;
    TextView myTxtViewManager;
    Intent intentReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        myTxtViewManager=findViewById(R.id.textView2);

        intentReceiver=getIntent();
        myTxtViewManager.setText(intentReceiver.getStringExtra("myExtra"));


    }
}