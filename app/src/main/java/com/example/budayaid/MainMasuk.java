package com.example.budayaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainMasuk extends AppCompatActivity {
    private ImageButton mbtn7, mbtn8;
    private ImageView img10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_masuk);

        mbtn7 = findViewById(R.id.mbtn7);
        mbtn8 = findViewById(R.id.mbtn8);
        img10 = findViewById(R.id.img10);


        mbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainAboutAccount.class));
            }
        });
        mbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainLogin.class));
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainDaftar.class));
            }
        });
    }
}