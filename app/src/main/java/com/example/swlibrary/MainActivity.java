package com.example.swlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       help = findViewById(R.id.Help);
       help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Help.class));
            }
        } );




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}