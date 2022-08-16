package com.example.swlibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


import com.squareup.picasso.Picasso;


public class Library extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ImageView imageView = findViewById(R.id.Cross);
        Picasso.with(this)
                .load("https://i.imgflip.com/2gro1p.jpg")
                .into(imageView);
    }
}