package com.example.budayaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class MainDaftar extends AppCompatActivity {
    private ImageButton mbtn9, mbtn10;
            CheckBox cx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_daftar);

        mbtn9 = findViewById(R.id.mbtn9);
        mbtn10 = findViewById(R.id.mbtn10);
        cx1 = findViewById(R.id.cx1);


        mbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainMasuk.class));
            }
        });
        mbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainLogin.class));
            }
        });
        cx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
