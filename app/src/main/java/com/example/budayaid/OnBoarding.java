package com.example.budayaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class OnBoarding extends AppCompatActivity {
    private ImageButton lanjutimagebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        lanjutimagebutton = findViewById(R.id.lanjutimagebutton);
        lanjutimagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainOnBoardingg.class));
            }
        });
    }
}


