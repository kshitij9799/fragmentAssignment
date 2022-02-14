package com.example.fragmentassignment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button time,date,battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time = (Button) findViewById(R.id.time);
        date = (Button) findViewById(R.id.date);
        battery= (Button) findViewById(R.id.battery);

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               getSupportFragmentManager()
                       .beginTransaction()
                       .replace(R.id.display,new TimeFragment())
                       .commit();
            }
        });
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.display,new DateFragment())
                        .commit();
            }
        });
        battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.display,new BatteryFragment())
                        .commit();
            }
        });
    }
}