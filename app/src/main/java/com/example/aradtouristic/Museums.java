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

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class Museums extends AppCompatActivity {
    private StorageReference mstorage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mstorage = FirebaseStorage.getInstance().getReference().child("pictures/bis1.jpg");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageButton myButton1 = (ImageButton) findViewById(R.id.mus1);
        myButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentM1 = new Intent(Museums.this, Museum1.class);
                startActivity(intentM1);
            }
        });

        ImageButton myButton2 = (ImageButton) findViewById(R.id.mus2);
        myButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentM2 = new Intent(Museums.this, Museum2.class);
                startActivity(intentM2);
            }
        });

        ImageButton myButton3 = (ImageButton) findViewById(R.id.mus3);
        myButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentM3 = new Intent(Museums.this, Museum3.class);
                startActivity(intentM3);
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
                Intent intent1 = new Intent(Museums.this, Museums.class);
                startActivity(intent1);
                break;
            case R.id.Theatres:
                Intent intent2 = new Intent(Museums.this, Theatres.class);
                startActivity(intent2);
                break;
            case R.id.Churches:
                Intent intent3 = new Intent(Museums.this, Churches.class);
                startActivity(intent3);
                break;
            case R.id.City_Center:
                Intent intent4 = new Intent(Museums.this, City_Center.class);
                startActivity(intent4);
                break;
            case R.id.Location:
                Intent intent5 = new Intent(Museums.this, MapActivity.class);
                startActivity(intent5);
                break;
            case R.id.exit:
                Intent intent = new Intent(Museums.this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return true;
    }
}