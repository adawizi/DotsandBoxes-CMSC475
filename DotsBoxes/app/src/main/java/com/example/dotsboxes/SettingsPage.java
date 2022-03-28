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

        ImageView choice1 = findViewById(R.id.choice1);
        ImageView choice2 = findViewById(R.id.choice2);

        String p1C = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("P1Color","");
        String p2C = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("P2Color","");
        if(p1C.equals("green")){
            choice1.setImageResource(R.drawable.h_green);
        }
        if(p1C.equals("blue")){
            choice1.setImageResource(R.drawable.h_blue);
        }
        if(p1C.equals("red")){
            choice1.setImageResource(R.drawable.h_red);
        }
        if(p1C.equals("orange")){
            choice1.setImageResource(R.drawable.h_orange);
        }
        if(p1C.equals("purple")){
            choice1.setImageResource(R.drawable.h_purple);
        }
        if(p1C.equals("pink")){
            choice1.setImageResource(R.drawable.h_pink);
        }
        if(p2C.equals("green")){
            choice2.setImageResource(R.drawable.h_green);
        }
        if(p2C.equals("blue")){
            choice2.setImageResource(R.drawable.h_blue);
        }
        if(p2C.equals("red")){
            choice2.setImageResource(R.drawable.h_red);
        }
        if(p2C.equals("orange")){
            choice2.setImageResource(R.drawable.h_orange);
        }
        if(p2C.equals("purple")){
            choice2.setImageResource(R.drawable.h_purple);
        }
        if(p2C.equals("pink")){
            choice2.setImageResource(R.drawable.h_pink);
        }



        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("blue"))){
                    myEditor.putString("P1Color", "blue").apply();
                    Toast.makeText(getApplicationContext(), "Player 1 is now blue!", Toast.LENGTH_SHORT).show();
                    choice1.setImageResource(R.drawable.h_blue);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("red"))){
                    myEditor.putString("P1Color", "red").apply();
                    Toast.makeText(getApplicationContext(), "Player 1 is now red!", Toast.LENGTH_SHORT).show();
                    choice1.setImageResource(R.drawable.h_red);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        green1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("green"))){
                    myEditor.putString("P1Color", "green").apply();
                    Toast.makeText(getApplicationContext(), "Player 1 is now green!", Toast.LENGTH_SHORT).show();
                    choice1.setImageResource(R.drawable.h_green);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        orange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("orange"))){
                    myEditor.putString("P1Color", "orange").apply();
                    Toast.makeText(getApplicationContext(), "Player 1 is now orange!", Toast.LENGTH_SHORT).show();
                    choice1.setImageResource(R.drawable.h_orange);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        purple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("purple"))){
                    myEditor.putString("P1Color", "purple").apply();
                    Toast.makeText(getApplicationContext(), "Player 1 is now purple!", Toast.LENGTH_SHORT).show();
                    choice1.setImageResource(R.drawable.h_purple);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        pink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("pink"))){
                    myEditor.putString("P1Color", "pink").apply();
                    Toast.makeText(getApplicationContext(), "Player 1 is now pink!", Toast.LENGTH_SHORT).show();
                    choice1.setImageResource(R.drawable.h_pink);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("blue"))){
                    myEditor.putString("P2Color", "blue").apply();
                    Toast.makeText(getApplicationContext(), "Player 2 is now blue!", Toast.LENGTH_SHORT).show();
                    choice2.setImageResource(R.drawable.h_blue);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("red"))){
                    myEditor.putString("P2Color", "red").apply();
                    Toast.makeText(getApplicationContext(), "Player 2 is now red!", Toast.LENGTH_SHORT).show();
                    choice2.setImageResource(R.drawable.h_red);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("green"))){
                    myEditor.putString("P2Color", "green").apply();
                    Toast.makeText(getApplicationContext(), "Player 2 is now green!", Toast.LENGTH_SHORT).show();
                    choice2.setImageResource(R.drawable.h_green);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        orange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("orange"))){
                    myEditor.putString("P2Color", "orange").apply();
                    Toast.makeText(getApplicationContext(), "Player 2 is now orange!", Toast.LENGTH_SHORT).show();
                    choice2.setImageResource(R.drawable.h_orange);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        purple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("purple"))){
                    myEditor.putString("P2Color", "purple").apply();
                    Toast.makeText(getApplicationContext(), "Player 2 is now purple!", Toast.LENGTH_SHORT).show();
                    choice2.setImageResource(R.drawable.h_purple);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        pink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("pink"))){
                    myEditor.putString("P2Color", "pink").apply();
                    Toast.makeText(getApplicationContext(), "Player 2 is now pink!", Toast.LENGTH_SHORT).show();
                    choice2.setImageResource(R.drawable.h_pink);
                }else{
                    Toast.makeText(getApplicationContext(), "Can't have same color as Player 1", Toast.LENGTH_SHORT).show();
                }
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
    private String getColor1(){
        return PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("P1Color","");
    }
    private String getColor2(){
        return PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("P2Color","");
    }


}
