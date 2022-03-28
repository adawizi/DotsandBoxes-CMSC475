package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SettingsPage extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences.Editor myEditor = myPrefs.edit();

        ImageView blue1 = findViewById(R.id.blue1);
        ImageView red1 = findViewById(R.id.red1);
        ImageView green1 = findViewById(R.id.green1);
        ImageView orange1 = findViewById(R.id.orange1);
        ImageView purple1 = findViewById(R.id.purple1);
        ImageView pink1 = findViewById(R.id.pink1);

        ImageView blue2 = findViewById(R.id.blue2);
        ImageView red2 = findViewById(R.id.red2);
        ImageView green2 = findViewById(R.id.green2);
        ImageView orange2 = findViewById(R.id.orange2);
        ImageView purple2 = findViewById(R.id.purple2);
        ImageView pink2 = findViewById(R.id.pink2);


        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P1Color", "blue").apply();
                Toast.makeText(getApplicationContext(), "Player 1 is now blue!", Toast.LENGTH_SHORT).show();
            }
        });

        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P1Color", "red").apply();
                Toast.makeText(getApplicationContext(), "Player 1 is now red!", Toast.LENGTH_SHORT).show();
            }
        });

        green1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P1Color", "green").apply();
                Toast.makeText(getApplicationContext(), "Player 1 is now green!", Toast.LENGTH_SHORT).show();
            }
        });

        orange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P1Color", "orange").apply();
                Toast.makeText(getApplicationContext(), "Player 1 is now orange!", Toast.LENGTH_SHORT).show();
            }
        });

        purple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P1Color", "purple").apply();
                Toast.makeText(getApplicationContext(), "Player 1 is now purple!", Toast.LENGTH_SHORT).show();
            }
        });

        pink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P1Color", "pink").apply();
                Toast.makeText(getApplicationContext(), "Player 1 is now pink!", Toast.LENGTH_SHORT).show();
            }
        });

        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P2Color", "blue").apply();
                Toast.makeText(getApplicationContext(), "Player 2 is now blue!", Toast.LENGTH_SHORT).show();
            }
        });

        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P2Color", "red").apply();
                Toast.makeText(getApplicationContext(), "Player 2 is now red!", Toast.LENGTH_SHORT).show();
            }
        });

        green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P2Color", "green").apply();
                Toast.makeText(getApplicationContext(), "Player 2 is now green!", Toast.LENGTH_SHORT).show();
            }
        });

        orange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P2Color", "orange").apply();
                Toast.makeText(getApplicationContext(), "Player 2 is now orange!", Toast.LENGTH_SHORT).show();
            }
        });

        purple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P2Color", "purple").apply();
                Toast.makeText(getApplicationContext(), "Player 2 is now purple!", Toast.LENGTH_SHORT).show();
            }
        });

        pink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P2Color", "pink").apply();
                Toast.makeText(getApplicationContext(), "Player 2 is now pink!", Toast.LENGTH_SHORT).show();
            }
        });

        Button save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsPage.this, Home.class);
                startActivity(intent);
            }
        });


    }


}
