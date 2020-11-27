package com.example.reproductor;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
    }

    public void salsa(View view) {
        Intent in = new Intent(this,ActivitySalsa.class);
        startActivity(in);
    }

    public void andinas(View view) {
        Intent inte = new Intent(this,ActivityAndinas.class);
        startActivity(inte);
    }

    public void rock(View view) {
        Intent inten = new Intent(this,ActivityRock.class);
        startActivity(inten);
    }

    public void cumbia(View view) {
        Intent intent = new Intent(this,ActivityCumbia.class);
        startActivity(intent);
    }

    public void baladas(View view) {
        Intent intento = new Intent(this,ActivityBaladas.class);
        startActivity(intento);
    }

    public void salir(View view) {
        finish();
    }
}
