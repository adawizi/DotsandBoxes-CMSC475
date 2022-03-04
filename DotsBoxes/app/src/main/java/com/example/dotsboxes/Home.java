package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
                if(pOneInit.getText().length() < 1 || pTwoInit.getText().length() < 1){
                    showWarning();
                }
                else {
                    myEditor.putString("P1", pOneInit.getText().toString()).apply();
                    myEditor.putString("P2", pTwoInit.getText().toString()).apply();

                    Intent intent = new Intent(Home.this, GamePage.class);
                    startActivity(intent);
                }
            }
        });
        Button buttonSetting = findViewById(R.id.settings);
        buttonSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, SettingsPage.class);
                startActivity(intent);
            }
        });
        Button buttonHelp = findViewById(R.id.help);
        buttonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, HelpPage.class);
                startActivity(intent);
            }
        });
    }

    private void showWarning(){
        String warning = "Player initials cannot be empty";
        Toast toast = new Toast(getApplicationContext());
        View toastLayout = getLayoutInflater().inflate(R.layout.toast_custom, (ViewGroup) findViewById(R.id.custom_toast_layout));
        TextView initialsEmptyToast = (TextView) toastLayout.findViewById(R.id.custom_toast);
        initialsEmptyToast.setText(warning);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 850);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(toastLayout);
        toast.show();
    }
}