package com.example.swlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Technology extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);

        Button planetsBtn = findViewById(R.id.planetsBtn);
        Button personBtn = findViewById(R.id.personBtn);
        Button speciesBtn = findViewById(R.id.speciesBtn);

        planetsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Technology.this, Library.class));
            }
        });
        personBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Technology.this, Personalities.class));
            }
        });
        speciesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Technology.this, Spieces.class));
            }
        });
    }
}