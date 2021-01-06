package com.example.aradtouristic;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity  {
    Button button1,button2;
    //EditText ed1,ed2;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button);
        //button2 = (Button)findViewById(R.id.button2);

        //ed1 = (EditText)findViewById(R.id.editText);
        //ed2 = (EditText)findViewById(R.id.editText2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(ed1.getText().toString().equals("admin") &&
                        //ed2.getText().toString().equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, MainPage.class);
                    startActivity(intent);
                //}else{
                  //  Toast.makeText(getApplicationContext(), "Wrong Password",Toast.LENGTH_SHORT).show();
                //}
            }
        });

        /*button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/
    }
}