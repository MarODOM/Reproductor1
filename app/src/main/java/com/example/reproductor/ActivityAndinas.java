package com.example.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityAndinas extends AppCompatActivity {

    ImageButton andi1,andi2,andi3,andi4,andi5;
    private Button bta1,bta2,bta3,bta4,bta5;
    private String aur1,aur2,aur3,aur4,aur5;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andinas);

        andi1=(ImageButton)findViewById(R.id.ai1);
        andi2=(ImageButton)findViewById(R.id.ai2);
        andi3=(ImageButton)findViewById(R.id.ai3);
        andi4=(ImageButton)findViewById(R.id.ai4);
        andi5=(ImageButton)findViewById(R.id.ai5);

        bta1 = findViewById(R.id.aa1);
        bta2 = findViewById(R.id.aa2);
        bta3 = findViewById(R.id.aa3);
        bta4 = findViewById(R.id.aa4);
        bta5 = findViewById(R.id.aa5);

        andi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityAndinas.this, R.raw.necesito);
                mp.start();
            }
        });
        andi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityAndinas.this, R.raw.delanada);
                mp.start();
            }
        });
        andi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityAndinas.this, R.raw.pelodeambrosio);
                mp.start();
            }
        });
        andi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityAndinas.this, R.raw.raices);
                mp.start();
            }
        });
        andi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityAndinas.this, R.raw.kjarkas);
                mp.start();
            }
        });

        aur1="http://www.melodiasdelande.com/Mac-Salvador/Biografia/#:~:text=Mac%20Salvador%20" +
                "Ramos%20LLamoca%2C%20nacido,en%20un%20pa%C3%ADs%20que%20se";
        aur2="https://es.wikipedia.org/wiki/William_Luna";
        aur3="https://es.wikipedia.org/wiki/Pelo_d%27Ambrosio";
        aur4="https://perufolkradio.com/folk-ingresos/raices-de-jauja-mi-duena/";
        aur5="https://es.wikipedia.org/wiki/Los_Kjarkas";
    }

    public void autorandinas1(View view) {
        Uri uri = Uri.parse(aur1);
        Intent andina1 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(andina1);
    }

    public void autorandinas2(View view) {
        Uri uri = Uri.parse(aur2);
        Intent andina2 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(andina2);
    }

    public void autorandinas3(View view) {
        Uri uri = Uri.parse(aur3);
        Intent andina3 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(andina3);
    }

    public void autorandinas4(View view) {
        Uri uri = Uri.parse(aur4);
        Intent andina4 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(andina4);
    }

    public void autorandinas5(View view) {
        Uri uri = Uri.parse(aur5);
        Intent andina5 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(andina5);
    }

    public void MacSalvador(View view) {
    }

    public void WilliamLuna(View view) {
    }

    public void pelodeambrosio(View view) {
    }

    public void raicesdejauja(View view) {
    }

    public void kjarkas(View view) {
    }

    public void aatras(View view) {
        Intent aatras = new Intent(this,Album.class);
        startActivity(aatras);
        mp.stop();
    }
}
