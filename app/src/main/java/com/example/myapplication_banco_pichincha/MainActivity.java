package com.example.myapplication_banco_pichincha;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // implementacion de dependecia
        //implementation 'com.github.bumptech.glide:glide:4.15.1'
        //annotationProcessor 'com.github.bumptech.glide:glide:4.15.1
        ////////////////////////////////////////////////////////////////////////////////////////////////

        //Implentacion del gif//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.logogif);
        Glide.with(this).load(R.drawable.personapichincha).into(imageView);
    }
}