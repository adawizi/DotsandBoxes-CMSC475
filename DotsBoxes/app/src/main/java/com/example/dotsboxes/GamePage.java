package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class GamePage extends AppCompatActivity {

    boolean isFilled = false;
    boolean noScore = false;
    ImageView[] grid = new ImageView[24];
    TextView[] filled = new TextView[9];
    ArrayList<Integer> horizontal = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 9, 10, 15, 16, 17, 22, 23, 24));
    ArrayList<Integer> leftEdges = new ArrayList<>(Arrays.asList(4, 11, 18));
    ArrayList<Integer> rightEdges = new ArrayList<>(Arrays.asList(7, 14, 21));
    ArrayList<Integer> topEdges = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> bottomEdges = new ArrayList<>(Arrays.asList(22, 23, 24));
    int[] links = new int[24];
    String[] whoClicked = new String[1];
    int[] clickCounter = {-1};
    final int[] scores = {0, 0};
    final int[] doubleScore = {0};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final String player1 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("P1","");
        final String player2 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("P2","");
        for(int i = 0; i < links.length; i++){
            links[i] = -1;
        }
        clickCounter[0] = -1;
        whoClicked[0] = player1;
        TextView playerOne = (TextView) findViewById(R.id.playerOne);
        TextView playerTwo = (TextView) findViewById(R.id.playerTwo);
        TextView p1Score = (TextView) findViewById(R.id.p1Score);
        TextView p2Score = (TextView) findViewById(R.id.p2Score);
        TextView turn = (TextView) findViewById(R.id.turn);
        ImageView quit = (ImageView) findViewById(R.id.quit);
        ImageView restart = (ImageView) findViewById(R.id.restart);
        playerOne.setText("Player " + player1 + ":");
        playerTwo.setText("Player " + player2 + ":");
        turn.setText(player1 +"\'s\nTurn");

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
        TextView WinMessageHolder = layout.findViewById(R.id.WinMessageHolder);
        Toast toast = new Toast(getApplicationContext());

        for(int i = 0; i < grid.length; i++){
            int res = getResources().getIdentifier("link"+ (i+1), "id", getPackageName());
            grid[i] = (ImageView) findViewById(res);
        }

        for(int i = 0; i < filled.length; i++){
            int res = getResources().getIdentifier("textView"+ (i+1), "id", getPackageName());
            filled[i] = (TextView) findViewById(res);
        }

        for(int i = 0; i < grid.length; i++){
            if (horizontal.contains(i + 1)) {
                int side = i + 1;
                int n = i;
                grid[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        clickCounter[0]++;
                        links[n] = clickCounter[0];
                        grid[n].setClickable(false);


                        if (clickCounter[0] % 2 == 0){
                            whoClicked[0] = player1;
                            turn.setText(player2 +"\'s\nTurn");
                            turn.setTextColor(Color.parseColor("#D56868"));
                            grid[n].setImageResource(R.drawable.h_blue);
                        }else if (clickCounter[0] % 2 == 1){
                            whoClicked[0] = player2;
                            turn.setText(player1 +"\'s\nTurn");
                            turn.setTextColor(Color.parseColor("#73ADCC"));
                            grid[n].setImageResource(R.drawable.h_red);
                        }

                        if(topEdges.contains(side)){
                            isFilled = checkTop(n, links);
                            if(isFilled){
                                if(whoClicked[0].equalsIgnoreCase(player1)) {
                                    scores[0]++;
                                    turn.setText(player1 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#73ADCC"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p1Score.setText(String.valueOf(scores[0]));
                                }
                                else {
                                    scores[1]++;
                                    turn.setText(player2 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#D56868"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p2Score.setText(String.valueOf(scores[1]));
                                }
                                switch (side) {
                                    case 1:
                                        filled[0].setText(whoClicked[0]);
                                        break;
                                    case 2:
                                        filled[1].setText(whoClicked[0]);
                                        break;
                                    case 3:
                                        filled[2].setText(whoClicked[0]);
                                        break;
                                }
                            }
                        } else if (bottomEdges.contains(side)) {
                            isFilled = checkBottom(n, links);
                            if(isFilled) {
                                if(whoClicked[0].equalsIgnoreCase(player1)) {
                                    scores[0]++;
                                    turn.setText(player1 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#73ADCC"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p1Score.setText(String.valueOf(scores[0]));
                                }
                                else {
                                    scores[1]++;
                                    turn.setText(player2 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#D56868"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p2Score.setText(String.valueOf(scores[1]));
                                }
                                switch (side) {
                                    case 22:
                                        filled[6].setText(whoClicked[0]);
                                        break;
                                    case 23:
                                        filled[7].setText(whoClicked[0]);
                                        break;
                                    case 24:
                                        filled[8].setText(whoClicked[0]);
                                        break;
                                }
                            }
                        }
                        else{
                            isFilled = checkTop(n, links);
                            if(isFilled){
                                if(whoClicked[0].equalsIgnoreCase(player1)) {
                                    scores[0]++;
                                    turn.setText(player1 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#73ADCC"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p1Score.setText(String.valueOf(scores[0]));
                                }
                                else {
                                    scores[1]++;
                                    turn.setText(player2 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#D56868"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p2Score.setText(String.valueOf(scores[1]));
                                }
                                switch (side) {
                                    case 8:
                                        filled[3].setText(whoClicked[0]);
                                        break;
                                    case 9:
                                        filled[4].setText(whoClicked[0]);
                                        break;
                                    case 10:
                                        filled[5].setText(whoClicked[0]);
                                        break;
                                    case 15:
                                        filled[6].setText(whoClicked[0]);
                                        break;
                                    case 16:
                                        filled[7].setText(whoClicked[0]);
                                        break;
                                    case 17:
                                        filled[8].setText(whoClicked[0]);
                                        break;
                                }
                            }
                            isFilled = checkBottom(n, links);
                            if (isFilled){
                                if(whoClicked[0].equalsIgnoreCase(player1)) {
                                    scores[0]++;
                                    turn.setText(player1 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#73ADCC"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p1Score.setText(String.valueOf(scores[0]));
                                }
                                else {
                                    scores[1]++;
                                    turn.setText(player2 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#D56868"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p2Score.setText(String.valueOf(scores[1]));
                                }
                                switch (side) {
                                    case 8:
                                        filled[0].setText(whoClicked[0]);
                                        break;
                                    case 9:
                                        filled[1].setText(whoClicked[0]);
                                        break;
                                    case 10:
                                        filled[2].setText(whoClicked[0]);
                                        break;
                                    case 15:
                                        filled[3].setText(whoClicked[0]);
                                        break;
                                    case 16:
                                        filled[4].setText(whoClicked[0]);
                                        break;
                                    case 17:
                                        filled[5].setText(whoClicked[0]);
                                        break;
                                }
                            }
                        }
                        if(doubleScore[0] == 2){
                            clickCounter[0]++;
                        }
                        doubleScore[0] = 0;

                        for(int i = 0; i < links.length; i++){
                            if(links[i] == -1){
                                noScore = true;
                            }
                        }

                        if(noScore == false){
                            String winMessage = "";
                            if(scores[0] > scores[1]){
                                winMessage = player1 + " Wins!";
                                turn.setText(player1 + "\nWins!");
                                turn.setTextColor(Color.parseColor("#73ADCC"));
                            }else if(scores[1] > scores[0]){
                                winMessage = player2 + " Wins!";
                                turn.setText(player2 + "\nWins!");
                                turn.setTextColor(Color.parseColor("#D56868"));
                            }else{
                                winMessage = "Tie game!";
                            }

                            WinMessageHolder.setText(winMessage);
                            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 750);
                            toast.setDuration(Toast.LENGTH_LONG);
                            toast.setView(layout);
                            toast.show();
                        }
                        noScore = false;

                    }

                });
            }
            else {
                int side = i + 1;
                int n = i;
                grid[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        clickCounter[0]++;
                        links[n] = clickCounter[0];
                        grid[n].setClickable(false);


                        if (clickCounter[0] % 2 == 0){
                            whoClicked[0] = player1;
                            turn.setText(player2 +"\'s\nTurn");
                            turn.setTextColor(Color.parseColor("#D56868"));
                            grid[n].setImageResource(R.drawable.v_blue);
                        }else if (clickCounter[0] % 2 == 1){
                            whoClicked[0] = player2;
                            turn.setText(player1 +"\'s\nTurn");
                            turn.setTextColor(Color.parseColor("#73ADCC"));
                            grid[n].setImageResource(R.drawable.v_red);
                        }

                        if(leftEdges.contains(side)){
                            isFilled = checkLeft(n, links);
                            if(isFilled){
                                if(whoClicked[0].equalsIgnoreCase(player1)) {
                                    scores[0]++;
                                    turn.setText(player1 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#73ADCC"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p1Score.setText(String.valueOf(scores[0]));
                                }
                                else {
                                    scores[1]++;
                                    turn.setText(player2 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#D56868"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p2Score.setText(String.valueOf(scores[1]));
                                }
                                switch (side) {
                                    case 4:
                                        filled[0].setText(whoClicked[0]);
                                        break;
                                    case 11:
                                        filled[3].setText(whoClicked[0]);
                                        break;
                                    case 18:
                                        filled[6].setText(whoClicked[0]);
                                        break;
                                }
                            }
                        } else if (rightEdges.contains(side)) {
                            isFilled = checkRight(n, links);
                            if(isFilled) {
                                if(whoClicked[0].equalsIgnoreCase(player1)) {
                                    scores[0]++;
                                    turn.setText(player1 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#73ADCC"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p1Score.setText(String.valueOf(scores[0]));
                                }
                                else {
                                    scores[1]++;
                                    turn.setText(player2 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#D56868"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p2Score.setText(String.valueOf(scores[1]));
                                }
                                switch (side) {
                                    case 7:
                                        filled[2].setText(whoClicked[0]);
                                        break;
                                    case 14:
                                        filled[5].setText(whoClicked[0]);
                                        break;
                                    case 21:
                                        filled[8].setText(whoClicked[0]);
                                        break;
                                }
                            }
                        }
                        else {
                            isFilled = checkLeft(n, links);
                            if (isFilled) {
                                if(whoClicked[0].equalsIgnoreCase(player1)) {
                                    scores[0]++;
                                    turn.setText(player1 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#73ADCC"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p1Score.setText(String.valueOf(scores[0]));
                                }
                                else {
                                    scores[1]++;
                                    turn.setText(player2 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#D56868"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p2Score.setText(String.valueOf(scores[1]));
                                }
                                switch (side) {
                                    case 5:
                                        filled[1].setText(whoClicked[0]);
                                        break;
                                    case 6:
                                        filled[2].setText(whoClicked[0]);
                                        break;
                                    case 12:
                                        filled[4].setText(whoClicked[0]);
                                        break;
                                    case 13:
                                        filled[5].setText(whoClicked[0]);
                                        break;
                                    case 19:
                                        filled[7].setText(whoClicked[0]);
                                        break;
                                    case 20:
                                        filled[8].setText(whoClicked[0]);
                                        break;
                                }
                            }
                            isFilled = checkRight(n, links);
                            if (isFilled) {
                                if(whoClicked[0].equalsIgnoreCase(player1)) {
                                    scores[0]++;
                                    turn.setText(player1 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#73ADCC"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p1Score.setText(String.valueOf(scores[0]));
                                }
                                else {
                                    scores[1]++;
                                    turn.setText(player2 +"\'s\nTurn");
                                    turn.setTextColor(Color.parseColor("#D56868"));
                                    doubleScore[0]++;
                                    clickCounter[0]--;
                                    p2Score.setText(String.valueOf(scores[1]));
                                }
                                switch (side) {
                                    case 5:
                                        filled[0].setText(whoClicked[0]);
                                        break;
                                    case 6:
                                        filled[1].setText(whoClicked[0]);
                                        break;
                                    case 12:
                                        filled[3].setText(whoClicked[0]);
                                        break;
                                    case 13:
                                        filled[4].setText(whoClicked[0]);
                                        break;
                                    case 19:
                                        filled[6].setText(whoClicked[0]);
                                        break;
                                    case 20:
                                        filled[7].setText(whoClicked[0]);
                                        break;
                                }
                            }
                        }
                        if(doubleScore[0] == 2){
                            clickCounter[0]++;
                        }
                        doubleScore[0] = 0;

                        for(int i = 0; i < links.length; i++){
                            if(links[i] == -1){
                                noScore = true;
                            }
                        }

                        if(noScore == false){
                            String winMessage = "";
                            if(scores[0] > scores[1]){
                                winMessage = player1 + " Wins!";
                                turn.setText(player1 + "\nWins!");
                                turn.setTextColor(Color.parseColor("#73ADCC"));
                            }else if(scores[1] > scores[0]){
                                winMessage = player2 + " Wins!";
                                turn.setText(player2 + "\nWins!");
                                turn.setTextColor(Color.parseColor("#D56868"));
                            }else{
                                winMessage = "Tie game!";
                            }

                            WinMessageHolder.setText(winMessage);
                            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 750);
                            toast.setDuration(Toast.LENGTH_LONG);
                            toast.setView(layout);
                            toast.show();
                        }
                        noScore = false;
                    }
                });
            }
            quit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openDialog();
                }
            });

            restart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder rBuilder = new AlertDialog.Builder(GamePage.this, R.style.CustomAlertDialog);
                    View rView = getLayoutInflater().inflate(R.layout.dialog_restart, null);
                    Button rYes = (Button) rView.findViewById(R.id.rYes);
                    Button rNo = (Button) rView.findViewById(R.id.rNo);
                    rBuilder.setView(rView);
                    AlertDialog rDialog = rBuilder.create();
                    rDialog.show();

                    rYes.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View view) {
                            restartGame(player1);
                            p1Score.setText(String.valueOf(scores[0]));
                            p2Score.setText(String.valueOf(scores[1]));
                            turn.setText(player1 +"\'s\nTurn");
                            turn.setTextColor(Color.parseColor("#73ADCC"));
                            Toast.makeText(GamePage.this, "Game restarted", Toast.LENGTH_SHORT).show();
                            rDialog.dismiss();
                        }
                    });
                    rNo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            rDialog.dismiss();
                        }
                    });
                }
            });

        }
    }

    public void openDialog(){
        QuitDialog quitDialog = new QuitDialog();
        quitDialog.show(getSupportFragmentManager(), "quit dialog");
    }

    private void restartGame(String player1){
        for(int i = 0; i < links.length; i++){
            links[i] = -1;
        }
        clickCounter[0] = -1;
        whoClicked[0] = player1;
        scores[0] = 0;
        scores[1] = 0;
        for(int i = 0; i < grid.length; i++){
            grid[i].setClickable(true);
            if(horizontal.contains(i+1)){
                grid[i].setImageResource(R.drawable.h_grey);
            }
            else{
                grid[i].setImageResource(R.drawable.v_grey);
            }
        }
        for(int i = 0; i < filled.length; i++){
            filled[i].setText(null);
        }
    }

    private boolean checkTop(int side, int[] links){
        boolean isFilled = false;
        if(links[side + 3] >= 0 && links[side + 4] >= 0 && links[side + 7] >= 0){
            isFilled = true;
        }
        return isFilled;
    }

    private boolean checkLeft(int side, int[] links){
        boolean isFilled = false;
        if(links[side - 3]  >= 0 && links[side + 1] >= 0 && links[side + 4] >= 0){
            isFilled = true;
        }
        return isFilled;
    }

    private boolean checkRight(int side, int[] links){
        boolean isFilled = false;
        if(links[side - 1] >= 0 && links[side - 4] >= 0 && links[side + 3] >= 0){
            isFilled = true;
        }
        return isFilled;
    }

    private boolean checkBottom(int side, int[] links){
        boolean isFilled = false;
        if(links[side - 3]  >= 0 && links[side - 4] >= 0 && links[side - 7] >= 0){
            isFilled = true;
        }
        return isFilled;
    }

}