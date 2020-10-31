package com.example.locus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button registerButton;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerButton=(Button)findViewById(R.id.register);
        loginButton=(Button)findViewById(R.id.loginbtm);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRestrationPage();
            }
        });


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAirportInfo();
            }
        });

    }
    
    public void openRestrationPage(){
        Intent intent=new Intent(this,Register.class);
        startActivity(intent);
    }
    public void openAirportInfo(){
        Intent intent=new Intent(this,AirportInformationActivity.class);
        startActivity(intent);
    }
}
