package com.example.swlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Spieces extends AppCompatActivity {

    Button planetsBtn = findViewById(R.id.planetsBtn);
    Button technoBtn = findViewById(R.id.technoBtn);
    Button personBtn = findViewById(R.id.personBtn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spieces);

        planetsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Spieces.this, Library.class));
            }
        });
        technoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Spieces.this, Technology.class));
            }
        });
        personBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Spieces.this,Personalities.class));
            }
        });

    }
}
