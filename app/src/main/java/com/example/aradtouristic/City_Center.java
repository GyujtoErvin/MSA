package com.example.aradtouristic;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class City_Center extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city__center);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageButton myButton1 = (ImageButton) findViewById(R.id.cc1);
        myButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentCC1 = new Intent(City_Center.this, City_Center1.class);
                startActivity(intentCC1);
            }
        });

        ImageButton myButton2 = (ImageButton) findViewById(R.id.cc2);
        myButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentCC2 = new Intent(City_Center.this, City_Center2.class);
                startActivity(intentCC2);
            }
        });

        ImageButton myButton3 = (ImageButton) findViewById(R.id.cc3);
        myButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentCC3 = new Intent(City_Center.this, City_Center1.class);
                startActivity(intentCC3);
            }
        });

        ImageButton myButton4 = (ImageButton) findViewById(R.id.cc4);
        myButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentCC4 = new Intent(City_Center.this, City_Center1.class);
                startActivity(intentCC4);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_list, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Museums:
                Intent intent1 = new Intent(City_Center.this, Museums.class);
                startActivity(intent1);
                break;
            case R.id.Theatres:
                Intent intent2 = new Intent(City_Center.this, Theatres.class);
                startActivity(intent2);
                break;
            case R.id.Churches:
                Intent intent3 = new Intent(City_Center.this, Churches.class);
                startActivity(intent3);
                break;
            case R.id.City_Center:
                Intent intent4 = new Intent(City_Center.this, City_Center.class);
                startActivity(intent4);
                break;
            case R.id.logout:
                Intent intent = new Intent(City_Center.this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return true;
    }
}