package com.example.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityCumbia extends AppCompatActivity {

    ImageButton cum1,cum2,cum3,cum4,cum5;
    private Button btc1,btc2,btc3,btc4,btc5;
    private String cur1,cur2,cur3,cur4,cur5;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cumbia);

        cum1=(ImageButton)findViewById(R.id.ci1);
        cum2=(ImageButton)findViewById(R.id.ci2);
        cum3=(ImageButton)findViewById(R.id.ci3);
        cum4=(ImageButton)findViewById(R.id.ci4);
        cum5=(ImageButton)findViewById(R.id.ci5);

        btc1 = findViewById(R.id.ca1);
        btc2 = findViewById(R.id.ca2);
        btc3 = findViewById(R.id.ca3);
        btc4 = findViewById(R.id.ca4);
        btc5 = findViewById(R.id.ca5);

        cum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityCumbia.this, R.raw.armo);
                mp.start();
            }
        });
        cum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityCumbia.this, R.raw.grupo);
                mp.start();
            }
        });
        cum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityCumbia.this, R.raw.papillon);
                mp.start();
            }
        });
        cum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityCumbia.this, R.raw.dilber);
                mp.start();
            }
        });
        cum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityCumbia.this, R.raw.mallanep);
                mp.start();
            }
        });

        cur1="https://es.wikipedia.org/wiki/Armon%C3%ADa_10";
        cur2="https://www.grupo5.pe/";
        cur3="https://www.soniemperu.com/directorio-de-afiliados?view=afiliado&layout=ficha&cid=334";
        cur4="https://www.ecured.cu/Dilbert_Aguilar";
        cur5="https://radionuevaq.pe/artistas/internacional-mallanep";

    }

    public void autorcumbia1(View view) {
        Uri uri = Uri.parse(cur1);
        Intent cumbia1 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(cumbia1);
    }

    public void autorcumbia2(View view) {
        Uri uri = Uri.parse(cur2);
        Intent cumbia2 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(cumbia2);
    }

    public void autorcumbia3(View view) {
        Uri uri = Uri.parse(cur3);
        Intent cumbia3 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(cumbia3);
    }

    public void autorcumbia4(View view) {
        Uri uri = Uri.parse(cur4);
        Intent cumbia4 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(cumbia4);
    }

    public void autorcumbia5(View view) {
        Uri uri = Uri.parse(cur5);
        Intent cumbia5 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(cumbia5);
    }

    public void armonia10(View view) {
    }

    public void grupo5(View view) {
    }

    public void papillon(View view) {
    }

    public void dibert(View view) {
    }

    public void mallanep(View view) {
    }

    public void catras(View view) {
        Intent catras = new Intent(this,Album.class);
        startActivity(catras);
        mp.stop();
    }
}
