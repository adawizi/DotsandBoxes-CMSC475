package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsPage extends AppCompatActivity {

    ImageView blue1_unavailable, red1_unavailable, green1_unavailable, orange1_unavailable, purple1_unavailable, pink1_unavailable;
    ImageView blue2_unavailable, red2_unavailable, green2_unavailable, orange2_unavailable, purple2_unavailable, pink2_unavailable;

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

        initializeImageViews(); // imageviews for unavailable colors

        String p1C = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("P1Color","");
        String p2C = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("P2Color","");

        final String[] previouslySelected1 = {p1C};
        final String[] previouslySelected2 = {p2C};

        if(p1C.equals("green")){
            choice1.setImageResource(R.drawable.h_green);
            green2_unavailable.setVisibility(View.VISIBLE);
        }
        if(p1C.equals("blue")){
            choice1.setImageResource(R.drawable.h_blue);
            blue2_unavailable.setVisibility(View.VISIBLE);
        }
        if(p1C.equals("red")){
            choice1.setImageResource(R.drawable.h_red);
            red2_unavailable.setVisibility(View.VISIBLE);
        }
        if(p1C.equals("orange")){
            choice1.setImageResource(R.drawable.h_orange);
            orange2_unavailable.setVisibility(View.VISIBLE);
        }
        if(p1C.equals("purple")){
            choice1.setImageResource(R.drawable.h_purple);
            purple2_unavailable.setVisibility(View.VISIBLE);
        }
        if(p1C.equals("pink")){
            choice1.setImageResource(R.drawable.h_pink);
            pink2_unavailable.setVisibility(View.VISIBLE);
        }
        if(p2C.equals("green")){
            choice2.setImageResource(R.drawable.h_green);
            green1_unavailable.setVisibility(View.VISIBLE);
        }
        if(p2C.equals("blue")){
            choice2.setImageResource(R.drawable.h_blue);
            blue1_unavailable.setVisibility(View.VISIBLE);
        }
        if(p2C.equals("red")){
            choice2.setImageResource(R.drawable.h_red);
            red1_unavailable.setVisibility(View.VISIBLE);
        }
        if(p2C.equals("orange")){
            choice2.setImageResource(R.drawable.h_orange);
            orange1_unavailable.setVisibility(View.VISIBLE);
        }
        if(p2C.equals("purple")){
            choice2.setImageResource(R.drawable.h_purple);
            purple1_unavailable.setVisibility(View.VISIBLE);
        }
        if(p2C.equals("pink")){
            choice2.setImageResource(R.drawable.h_pink);
            pink1_unavailable.setVisibility(View.VISIBLE);
        }



        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("blue"))){
                    myEditor.putString("P1Color", "blue").apply();
                    showToast("Player 1", "blue");
                    choice1.setImageResource(R.drawable.h_blue);
                    unselectPreviousColor1(previouslySelected1[0]);
                    blue2_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected1[0] = "blue";
                }else{
                    showToast("Player 2", null);
                }
            }
        });

        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("red"))){
                    myEditor.putString("P1Color", "red").apply();
                    showToast("Player 1", "red");
                    choice1.setImageResource(R.drawable.h_red);
                    unselectPreviousColor1(previouslySelected1[0]);
                    red2_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected1[0] = "red";
                }else{
                    showToast("Player 2", null);
                }
            }
        });

        green1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("green"))){
                    myEditor.putString("P1Color", "green").apply();
                    showToast("Player 1", "green");
                    choice1.setImageResource(R.drawable.h_green);
                    unselectPreviousColor1(previouslySelected1[0]);
                    green2_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected1[0] = "green";
                }else{
                    showToast("Player 2", null);
                }
            }
        });

        orange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("orange"))){
                    myEditor.putString("P1Color", "orange").apply();
                    showToast("Player 1", "orange");
                    choice1.setImageResource(R.drawable.h_orange);
                    unselectPreviousColor1(previouslySelected1[0]);
                    orange2_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected1[0] = "orange";
                }else{
                    showToast("Player 2", null);
                }
            }
        });

        purple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("purple"))){
                    myEditor.putString("P1Color", "purple").apply();
                    showToast("Player 1", "purple");
                    choice1.setImageResource(R.drawable.h_purple);
                    unselectPreviousColor1(previouslySelected1[0]);
                    purple2_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected1[0] = "purple";
                }else{
                    showToast("Player 2", null);
                }
            }
        });

        pink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor2().equals("pink"))){
                    myEditor.putString("P1Color", "pink").apply();
                    showToast("Player 1", "pink1");
                    choice1.setImageResource(R.drawable.h_pink);
                    unselectPreviousColor1(previouslySelected1[0]);
                    pink2_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected1[0] = "pink";
                }else{
                    showToast("Player 2", null);
                }
            }
        });

        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("blue"))){
                    myEditor.putString("P2Color", "blue").apply();
                    showToast("Player 2", "blue");
                    choice2.setImageResource(R.drawable.h_blue);
                    unselectPreviousColor2(previouslySelected2[0]);
                    blue1_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected2[0] = "blue";
                }else{
                    showToast("Player 1", null);
                }
            }
        });

        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("red"))){
                    myEditor.putString("P2Color", "red").apply();
                    showToast("Player 2", "red");
                    choice2.setImageResource(R.drawable.h_red);
                    unselectPreviousColor2(previouslySelected2[0]);
                    red1_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected2[0] = "red";
                }else{
                    showToast("Player 1", null);
                }
            }
        });

        green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("green"))){
                    myEditor.putString("P2Color", "green").apply();
                    showToast("Player 2", "green");
                    choice2.setImageResource(R.drawable.h_green);
                    unselectPreviousColor2(previouslySelected2[0]);
                    green1_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected2[0] = "green";
                }else{
                    showToast("Player 1", null);
                }
            }
        });

        orange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("orange"))){
                    myEditor.putString("P2Color", "orange").apply();
                    showToast("Player 2", "orange");
                    choice2.setImageResource(R.drawable.h_orange);
                    unselectPreviousColor2(previouslySelected2[0]);
                    orange1_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected2[0] = "orange";
                }else{
                    showToast("Player 1", null);
                }
            }
        });

        purple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("purple"))){
                    myEditor.putString("P2Color", "purple").apply();
                    showToast("Player 2", "purple");
                    choice2.setImageResource(R.drawable.h_purple);
                    unselectPreviousColor2(previouslySelected2[0]);
                    purple1_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected2[0] = "purple";
                }else{
                    showToast("Player 1", null);
                }
            }
        });

        pink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(getColor1().equals("pink"))){
                    myEditor.putString("P2Color", "pink").apply();
                    showToast("Player 2", "pink");
                    choice2.setImageResource(R.drawable.h_pink);
                    unselectPreviousColor2(previouslySelected2[0]);
                    pink1_unavailable.setVisibility(View.VISIBLE);
                    previouslySelected2[0] = "pink";
                }else{
                    showToast("Player 1", null);
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


    public void unselectPreviousColor1(String color){
        switch (color){
            case "blue":
                blue2_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "red":
                red2_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "green":
                green2_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "orange":
                orange2_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "purple":
                purple2_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "pink":
                pink2_unavailable.setVisibility(View.INVISIBLE);
                break;
            default:
                break;
        }
    }

    public void unselectPreviousColor2(String color){
        switch (color){
            case "blue":
                blue1_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "red":
                red1_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "green":
                green1_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "orange":
                orange1_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "purple":
                purple1_unavailable.setVisibility(View.INVISIBLE);
                break;
            case "pink":
                pink1_unavailable.setVisibility(View.INVISIBLE);
                break;
            default:
                break;
        }
    }
    public void initializeImageViews(){
        blue1_unavailable = findViewById(R.id.blue1_unavailable);
        red1_unavailable = findViewById(R.id.red1_unavailable);
        green1_unavailable = findViewById(R.id.green1_unavailable);
        orange1_unavailable = findViewById(R.id.orange1_unavailable);
        purple1_unavailable = findViewById(R.id.purple1_unavailable);
        pink1_unavailable = findViewById(R.id.pink1_unavailable);

        blue2_unavailable = findViewById(R.id.blue2_unavailable);
        red2_unavailable = findViewById(R.id.red2_unavailable);
        green2_unavailable = findViewById(R.id.green2_unavailable);
        orange2_unavailable = findViewById(R.id.orange2_unavailable);
        purple2_unavailable = findViewById(R.id.purple2_unavailable);
        pink2_unavailable = findViewById(R.id.pink2_unavailable);
    }

    private void showToast(String player, String color){
        Toast toast = new Toast(SettingsPage.this);
        View toastLayout = getLayoutInflater().inflate(R.layout.toast_custom, (ViewGroup) findViewById(R.id.custom_toast_layout));
        TextView message = (TextView) toastLayout.findViewById(R.id.custom_toast);
        if (color == null){
            message.setText("Can't have the same color as " + player);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 850);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(toastLayout);
            toast.show();
        }

    }


}
