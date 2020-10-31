package com.example.locus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileManagement extends AppCompatActivity {


    private Button logout;
    private Button update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_management);

        logout=(Button)findViewById(R.id.logoutButton);
        update=(Button)findViewById(R.id.updateProfileButton);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update();
            }
        });
    }

    public void logout(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void update(){
        Intent intent=new Intent(this,AirportInformationActivity.class);
        startActivity(intent);
    }
}
