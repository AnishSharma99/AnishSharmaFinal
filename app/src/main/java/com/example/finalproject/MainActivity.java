package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1 = findViewById(R.id.bbc);

        b1.setOnClickListener(e -> {

            Intent page = new Intent(MainActivity.this, Articles.class);
            startActivityForResult(page, 444);


        });

    }


}