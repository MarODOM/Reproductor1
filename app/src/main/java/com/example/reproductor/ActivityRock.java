package com.example.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityRock extends AppCompatActivity {

    ImageButton rock1,rock2,rock3,rock4,rock5;
    private Button btr1,btr2,btr3,btr4,btr5;
    private String rur1,rur2,rur3,rur4,rur5;
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        rock1=(ImageButton)findViewById(R.id.ri1);
        rock2=(ImageButton)findViewById(R.id.ri2);
        rock3=(ImageButton)findViewById(R.id.ri3);
        rock4=(ImageButton)findViewById(R.id.ri4);
        rock5=(ImageButton)findViewById(R.id.ri5);

        btr1 = (Button)findViewById(R.id.ra1);
        btr2 = (Button)findViewById(R.id.ra2);
        btr3 = (Button)findViewById(R.id.ra3);
        btr4 = (Button)findViewById(R.id.ra4);
        btr5 = (Button)findViewById(R.id.ra5);



        rock1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityRock.this, R.raw.cuentame);
                mp.start();
            }
        });

        rock2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityRock.this, R.raw.bonjovi);
                mp.start();

            }
        });
        rock3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityRock.this, R.raw.suna);
                mp.start();
            }
        });
        rock4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityRock.this, R.raw.rollings);
                mp.start();
            }
        });
        rock5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityRock.this, R.raw.mujeramante);
                mp.start();
            }
        });



        rur1="https://es.wikipedia.org/wiki/Pedro_Su%C3%A1rez-V%C3%A9rtiz";
        rur2="https://es.wikipedia.org/wiki/Jon_Bon_Jovi";
        rur3="https://es.wikipedia.org/wiki/Mar_de_Copas#:~:text=La%20banda%20fue%20creada%20en,y%20Claudia%20Salem%20(coros).";
        rur4="https://es.wikipedia.org/wiki/Mick_Jagger";
        rur5="https://es.wikipedia.org/wiki/Adri%C3%A1n_Barilari";
    }

    public void autorrock1(View view) {
        Uri uri = Uri.parse(rur1);
        Intent rock1 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(rock1);
    }

    public void autorrock2(View view) {
        Uri uri = Uri.parse(rur2);
        Intent rock2 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(rock2);
    }

    public void autorrock3(View view) {
        Uri uri = Uri.parse(rur3);
        Intent rock3 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(rock3);
    }

    public void autorrock4(View view) {
        Uri uri = Uri.parse(rur4);
        Intent rock4 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(rock4);
    }

    public void autorrock5(View view) {
        Uri uri = Uri.parse(rur5);
        Intent rock5 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(rock5);
    }

    public void pedrosuarez(View view) {
    }

    public void bonjovi(View view) {
    }

    public void mardecopas(View view) {
    }

    public void rollings(View view) {
    }

    public void ratablanca(View view) {
    }

    public void ratras(View view) {
        Intent ratras = new Intent(this,Album.class);
        startActivity(ratras);
        mp.stop();
    }
}
