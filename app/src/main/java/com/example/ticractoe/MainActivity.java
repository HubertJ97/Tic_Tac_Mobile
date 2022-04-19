package com.example.ticractoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Klasa MainActivity odpowiada za funkcjonalność ekranu startowego tj.
 * Przełączanie pomiędzy planszami.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
    }

    public void przejscie(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void przejscie4(View view) {
        Intent intent2 = new Intent(this, Game4Activity.class);
        startActivity(intent2);
    }
    public void przejscie5(View view) {
        Intent intent3 = new Intent(this, Game5Activity.class);
        startActivity(intent3);
    }


}
