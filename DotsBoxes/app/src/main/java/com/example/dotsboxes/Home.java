package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences.Editor myEditor = myPrefs.edit();

        EditText pOneInit = findViewById(R.id.pOneInit);
        EditText pTwoInit = findViewById(R.id.pTwoInit);



        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEditor.putString("P1", pOneInit.getText().toString()).apply();
                myEditor.putString("P2", pTwoInit.getText().toString()).apply();

                Intent intent = new Intent(Home.this, GamePage.class);
                startActivity(intent);
            }
        });
    }
}