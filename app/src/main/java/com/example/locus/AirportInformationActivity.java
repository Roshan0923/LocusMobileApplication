package com.example.locus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AirportInformationActivity extends AppCompatActivity {

    private Button airportInfoProccedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport_information);
        airportInfoProccedButton=(Button)findViewById(R.id.airportInfoProcced);

        airportInfoProccedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proccedToAvailBleSetsAvtivity();
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
    public void proccedToAvailBleSetsAvtivity()
    {
        Intent intent=new Intent(this,ListOfPlacesAvailable.class);
        startActivity(intent);
    }
}
