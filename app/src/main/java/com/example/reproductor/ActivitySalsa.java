package com.example.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivitySalsa extends AppCompatActivity {

    ImageButton sal1,sal2,sal3,sal4,sal5;
    private Button bts1,bts2,bts3,bts4,bts5;
    private String sur1,sur2,sur3,sur4,sur5;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salsa);

        sal1=(ImageButton)findViewById(R.id.si1);
        sal2=(ImageButton)findViewById(R.id.si2);
        sal3=(ImageButton)findViewById(R.id.si3);
        sal4=(ImageButton)findViewById(R.id.si4);       sal5=(ImageButton)findViewById(R.id.si5);

        bts1 = findViewById(R.id.sa1);
        bts2 = findViewById(R.id.sa2);
        bts3 = findViewById(R.id.sa3);
        bts4 = findViewById(R.id.sa4);
        bts5 = findViewById(R.id.sa5);

        sal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivitySalsa.this, R.raw.cartagena);
                mp.start();
            }
        });
        sal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivitySalsa.this, R.raw.frankieruiz);
                mp.start();
            }
        });
        sal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivitySalsa.this, R.raw.reyruiz);
                mp.start();
            }
        });
        sal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivitySalsa.this, R.raw.eddie);
                mp.start();
            }
        });
        sal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivitySalsa.this, R.raw.gale);
                mp.start();
            }
        });

        sur1="https://www.ecured.cu/Antonio_Cartagena";
        sur2="https://es.wikipedia.org/wiki/Frankie_Ruiz";
        sur3="https://www.guatacanights.com/noticias/los-bajos-de-gustavo-marquez-gerardo-guarache-ocque";
        sur4="https://musica.fandom.com/es/wiki/Alejandro_Vezzani";
        sur5="https://es.wikipedia.org/wiki/Grupo_Gal%C3%A9";
    }

    public void autorsalsa1(View view) {
        Uri uri = Uri.parse(sur1);
        Intent salsa1 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(salsa1);
    }

    public void autorsalsa2(View view) {
        Uri uri = Uri.parse(sur2);
        Intent salsa2 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(salsa2);
    }

    public void autorsalsa3(View view) {
        Uri uri = Uri.parse(sur3);
        Intent salsa3 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(salsa3);
    }

    public void autorsalsa4(View view) {
        Uri uri = Uri.parse(sur4);
        Intent salsa4 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(salsa4);
    }

    public void autorsalsa5(View view) {
        Uri uri = Uri.parse(sur5);
        Intent salsa5 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(salsa5);
    }

    public void AntonioCartagena(View view) {
    }

    public void FrankieRuiz(View view) {
    }

    public void ReyRuiz(View view) {
    }

    public void EddieSantiago(View view) {
    }

    public void gale(View view) {
    }

    public void satras(View view) {
        Intent satras = new Intent(this,Album.class);
        startActivity(satras);
        mp.stop();
    }
}
