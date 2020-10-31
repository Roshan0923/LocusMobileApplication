package com.example.locus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ListOfPlacesAvailable extends AppCompatActivity {

    private Button registerbutton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_places_available);
        registerbutton3=(Button)findViewById(R.id.registerbutton3);

        registerbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proccedToBuyAmenities();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent=new Intent(this,ProfileManagement.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
    public void proccedToBuyAmenities()
    {
        Intent intent=new Intent(this,BuyAmenitiesActivity.class);
        startActivity(intent);
    }
}
