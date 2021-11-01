package com.example.budayaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainPilihProvinsi extends AppCompatActivity {
    ImageButton mgbn1, mgbn2, mgbn3, mgbn4, mgbn5, mgbn6, mgbn7, mgbn8, mgbn9, mgbn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pilih_provinsi);

        mgbn1 = findViewById(R.id.mgbn1);
        mgbn2 = findViewById(R.id.mgbn2);
        mgbn3 = findViewById(R.id.mgbn3);
        mgbn4 = findViewById(R.id.mgbn4);
        mgbn5 = findViewById(R.id.mgbn5);
        mgbn6 = findViewById(R.id.mgbn6);
        mgbn7 = findViewById(R.id.mgbn7);
        mgbn8 = findViewById(R.id.mgbn8);
        mgbn9 = findViewById(R.id.mgbn9);
        mgbn10 = findViewById(R.id.mgbn10);

        mgbn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), profilesumut.class));
            }
        });
        mgbn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SumatraBarat.class));
            }
        });
        mgbn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), JawaTengah.class));
            }
        });
        mgbn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), JawaTimur.class));
            }
        });
        mgbn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainProvinsiDiYogyakarta.class));
            }
        });
        mgbn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainProvinsiSulawesiSelatan.class));
            }
        });
        mgbn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainSearch.class));
            }
        });
        mgbn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainPilihProvinsi.class));
            }
        });
        mgbn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainAboutMe.class));
            }
        });
        mgbn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainAboutAccount.class));
            }
        });


    }
}