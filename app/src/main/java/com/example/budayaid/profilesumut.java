package com.example.budayaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class profilesumut extends AppCompatActivity {
    private ImageButton imgb1, imgb2, imgb3, imgb4, imgb5, imgb6, imgb7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilesumut);

        imgb1 = findViewById(R.id.imgb1);
        imgb2 = findViewById(R.id.imgb2);
        imgb3 = findViewById(R.id.imgb3);
        imgb4 = findViewById(R.id.imgb4);
        imgb5 = findViewById(R.id.imgb5);
        imgb6 = findViewById(R.id.imgb6);
        imgb7 = findViewById(R.id.imgb7);

        imgb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainPilihProvinsi.class));
            }
        });
        imgb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainRumahBolon.class));
            }
        });
        imgb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainAlatMusikGondang.class));
            }
        });
        imgb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainSearch.class));
            }
        });
        imgb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainPilihProvinsi.class));
            }
        });
        imgb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainAboutMe.class));
            }
        });
        imgb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainBajuAdatUlos.class));
            }
        });
    }
}