package com.example.budayaid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainAlatMusikKetipung extends AppCompatActivity {
    ImageButton play;
    MediaPlayer mediaPlayer;
    private ImageView btn1, btn5, btn6, btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alat_musik_ketipung);

        btn1 = findViewById(R.id.btn1);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), JawaTimur.class));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainSearch.class));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainPilihProvinsi.class));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainAboutMe.class));
            }
        });

        mediaPlayer= MediaPlayer.create(MainAlatMusikKetipung.this,R.raw.musikketipung);
        play=(ImageButton) findViewById(R.id.playy);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    play.setBackgroundResource(R.drawable.play);
                }
                else {
                    mediaPlayer.start();
                    play.setBackgroundResource(R.drawable.pauseee);
                }

            }
        });
    }
}