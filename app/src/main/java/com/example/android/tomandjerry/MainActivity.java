package com.example.android.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
  boolean isTomVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void eraseTom(View view) {
        if(isTomVisible){
            ImageView tomImageView = findViewById(R.id.tom_imageView);
            // Set tomImageView invisible
            tomImageView.animate().rotation(tomImageView.getRotation()+3600).scaleY(0).scaleX(0).alpha(0).setDuration(3000);

            ImageView jerryImageView = findViewById(R.id.jerry_imageView);
            // Set jerryImageView visible
            jerryImageView.animate().rotation(jerryImageView.getRotation()+3600).scaleY(1).scaleX(1).alpha(1).setDuration(3000);
            isTomVisible = false;
        }else{
            ImageView jerryImageView = findViewById(R.id.jerry_imageView);
            // Set jerryImageView invisible
            jerryImageView.animate().rotation(jerryImageView.getRotation()+3600).scaleY(0).scaleX(0).alpha(0).setDuration(3000);

            ImageView tomImageView = findViewById(R.id.tom_imageView);
            // Set tomImageView visible
            tomImageView.animate().rotation(tomImageView.getRotation()+3600).scaleY(1).scaleX(1).alpha(1).setDuration(3000);
            isTomVisible = true;
        }

    }
}