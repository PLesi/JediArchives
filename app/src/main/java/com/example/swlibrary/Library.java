package com.example.swlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;


public class Library extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ImageView imageView = findViewById(R.id.Cross);

        Button personBtn = findViewById(R.id.personBtn);
        Button Btn = findViewById(R.id.Btn);
        Button Btn = findViewById(R.id.personBtn);
        Button Btn = findViewById(R.id.personBtn);

        personBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Library.this, Personalities.class));
            }
        });


        Picasso.with(this)
                .load("https://i.imgflip.com/2gro1p.jpg")
                .into(imageView);


    }
}