package com.example.aradtouristic;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Theatres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatres);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
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
                Intent intent1 = new Intent(Theatres.this, Museums.class);
                startActivity(intent1);
                break;
            case R.id.Theatres:
                Intent intent2 = new Intent(Theatres.this, Theatres.class);
                startActivity(intent2);
                break;
            case R.id.Churches:
                Intent intent3 = new Intent(Theatres.this, Churches.class);
                startActivity(intent3);
                break;
            case R.id.City_Center:
                Intent intent4 = new Intent(Theatres.this, City_Center.class);
                startActivity(intent4);
                break;
            case R.id.logout:
                Intent intent = new Intent(Theatres.this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return true;
    }
}