package com.example.budayaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainOnBoardingg extends AppCompatActivity {
    private ImageButton nbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boardingg);


        nbtn2 = findViewById(R.id.nbtn2);
        nbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainOnBoardinggg.class));
            }
        });
    }
}
