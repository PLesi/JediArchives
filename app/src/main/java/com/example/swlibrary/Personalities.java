package com.example.swlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personalities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalities);

        Button planetsBtn = findViewById(R.id.planetsBtn);
        Button technoBtn = findViewById(R.id.technoBtn);
        Button speciesBtn = findViewById(R.id.speciesBtn);

        planetsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Personalities.this, Library.class));
            }
        });
        technoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Personalities.this, Technology.class));
            }
        });
        speciesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Personalities.this, Spieces.class));
            }
        });
    }
}