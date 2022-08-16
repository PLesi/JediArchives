package com.example.swlibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import io.grpc.Context;

public class Library extends AppCompatActivity {

    FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference storageRef = storage.getReference();
    StorageReference pathReference = storageRef.child("starwars-ced88.appspot.com/cross.jpg");
    private static final String image = "https://www.google.com/search?q=images&sxsrf=ALiCzsaMbhQNP8_4ospkpSV3Qg2qBOc5lw:1660663491872&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjVu5jM1cv5AhVDXfEDHe37DKQQ_AUoAXoECAEQAw&biw=1920&bih=961#imgrc=0sOgRvZZyWRMuM";

    StorageReference storageReference = FirebaseStorage.getInstance().getReference();









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        StorageReference storageReference = FirebaseStorage.getInstance().getReference();
        StorageReference photoReference= storageReference.child("starwars-ced88.appspot.com/cross.jpg");
        ImageView imageView = findViewById(R.id.Cross);

        final long ONE_MEGABYTE = 1024 * 1024;
        photoReference.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                Bitmap bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                imageView.setImageBitmap(bmp);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                Toast.makeText(getApplicationContext(), "No Such file or Path found!!", Toast.LENGTH_LONG).show();
            }
        });

        // ImageView in your Activity

    }
}