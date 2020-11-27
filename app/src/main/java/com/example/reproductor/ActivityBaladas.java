package com.example.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityBaladas extends AppCompatActivity {

    ImageButton bala1,bala2,bala3,bala4,bala5;
    private Button btb1,btb2,btb3,btb4,btb5;
    private String bur1,bur2,bur3,bur4,bur5;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baladas);

        bala1=(ImageButton)findViewById(R.id.bi1);
        bala2=(ImageButton)findViewById(R.id.bi2);
        bala3=(ImageButton)findViewById(R.id.bi3);
        bala4=(ImageButton)findViewById(R.id.bi4);
        bala5=(ImageButton)findViewById(R.id.bi5);

        btb1 = findViewById(R.id.ba1);
        btb2 = findViewById(R.id.ba2);
        btb3 = findViewById(R.id.ba3);
        btb4 = findViewById(R.id.ba4);
        btb5 = findViewById(R.id.ba5);

        bala1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityBaladas.this, R.raw.cristiancastro);
                mp.start();
            }
        });
        bala2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityBaladas.this, R.raw.roberto);
                mp.start();
            }
        });
        bala3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityBaladas.this, R.raw.montaner);
                mp.start();
            }
        });
        bala4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityBaladas.this, R.raw.luismiguel);
                mp.start();
            }
        });
        bala5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(ActivityBaladas.this, R.raw.francodevita);
                mp.start();
            }
        });

        bur1="https://tiempodeboleros.eu/biografia/compositores/772-alejandro-zepeda-cervantes";
        bur2="https://es.wikipedia.org/wiki/Roberto_Carlos_(cantante)";
        bur3="https://it.wikipedia.org/wiki/Gianni_Togni";
        bur4="https://es.wikipedia.org/wiki/Juan_Luis_Guerra";
        bur5="https://es.wikipedia.org/wiki/Franco_de_Vita";
    }

    public void baladaautor1(View view) {
        Uri uri = Uri.parse(bur1);
        Intent balada1 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(balada1);
    }

    public void baladaautor2(View view) {
        Uri uri = Uri.parse(bur2);
        Intent balada2 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(balada2);
    }

    public void baladaautor3(View view) {
        Uri uri = Uri.parse(bur3);
        Intent balada3 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(balada3);
    }

    public void baladaautor4(View view) {
        Uri uri = Uri.parse(bur4);
        Intent balada4 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(balada4);
    }

    public void baladaautor5(View view) {
        Uri uri = Uri.parse(bur5);
        Intent balada5 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(balada5);
    }

    public void batras(View view) {
        Intent batras = new Intent(this,Album.class);
        startActivity(batras);
        mp.stop();
    }

    public void cristiancastro(View view) {
    }

    public void robertocarlos(View view) {
    }

    public void ricardomontaner(View view) {
    }

    public void LuisMiguel(View view) {
    }

    public void francodevita(View view) {
    }
}
