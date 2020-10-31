package com.example.locus;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.mbms.MbmsErrors;

public class startupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent intent=new Intent(startupActivity.this,MainActivity.class);
               startActivity(intent);
               finish();

            }
        },3000);
    }
}
