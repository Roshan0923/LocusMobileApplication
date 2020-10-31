package com.example.locus;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class BuyAmenitiesActivity extends AppCompatActivity{
    private Button buyButton;
    private Button skipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_amenities);
        buyButton=(Button)findViewById(R.id.buyButton);
        skipButton=(Button)findViewById(R.id.skipButton);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateLastPage();
            }
        });


        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateLastPage();
            }
        });
    }

    public void navigateLastPage(){
        Intent intent=new Intent(this,ConfirmationActivity.class);
        startActivity(intent);
    }

}
