package com.example.budayaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainLogin extends AppCompatActivity {
    private ImageButton nbtn4, nbtn5, nbtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        nbtn4 = findViewById(R.id.nbtn4);
        nbtn5 = findViewById(R.id.nbtn5);
        nbtn6 = findViewById(R.id.nbtn6);

        nbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainMasuk.class));
            }
        });
        nbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainDaftar.class));
            }
        });
        nbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainOnBoardinggg.class));

            }
        });

            }
        }
