package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    boolean isFilled = false;

    ImageView[] grid = new ImageView[24];
    TextView[] filled = new TextView[9];
    ArrayList<Integer> horizontal = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 9, 10, 15, 16, 17, 22, 23, 24));
    ArrayList<Integer> leftEdges = new ArrayList<>(Arrays.asList(4, 11, 18));
    ArrayList<Integer> rightEdges = new ArrayList<>(Arrays.asList(7, 14, 21));
    ArrayList<Integer> topEdges = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> bottomEdges = new ArrayList<>(Arrays.asList(22, 23, 24));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] links = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1};
        final int[] clickCounter = {0};
        final String[] whoseTurn = {"P1"};


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
                            whoseTurn[0] = "P1";
                            grid[n].setImageResource(R.drawable.h_blue);
                        }else if (clickCounter[0] % 2 == 1){
                            whoseTurn[0] = "P2";
                            grid[n].setImageResource(R.drawable.h_red);
                        }

                        if(topEdges.contains(side)){
                            isFilled = checkTop(n, links);
                            if(isFilled){
                                switch (side) {
                                    case 1:
                                        filled[0].setText(whoseTurn[0]);
                                        break;
                                    case 2:
                                        filled[1].setText(whoseTurn[0]);
                                        break;
                                    case 3:
                                        filled[2].setText(whoseTurn[0]);
                                        break;
                                }
                            }
                        } else if (bottomEdges.contains(side)) {
                            isFilled = checkBottom(n, links);
                            if(isFilled) {
                                switch (side) {
                                    case 22:
                                        filled[6].setText(whoseTurn[0]);
                                        break;
                                    case 23:
                                        filled[7].setText(whoseTurn[0]);
                                        break;
                                    case 24:
                                        filled[8].setText(whoseTurn[0]);
                                        break;
                                }
                            }
                        }
                        else{
                            isFilled = checkTop(n, links);
                            if(isFilled){
                                switch (side) {
                                    case 8:
                                        filled[3].setText(whoseTurn[0]);
                                        break;
                                    case 9:
                                        filled[4].setText(whoseTurn[0]);
                                        break;
                                    case 10:
                                        filled[5].setText(whoseTurn[0]);
                                        break;
                                    case 15:
                                        filled[6].setText(whoseTurn[0]);
                                        break;
                                    case 16:
                                        filled[7].setText(whoseTurn[0]);
                                        break;
                                    case 17:
                                        filled[8].setText(whoseTurn[0]);
                                        break;
                                }
                            }
                            isFilled = checkBottom(n, links);
                            if (isFilled){
                                switch (side) {
                                    case 8:
                                        filled[0].setText(whoseTurn[0]);
                                        break;
                                    case 9:
                                        filled[1].setText(whoseTurn[0]);
                                        break;
                                    case 10:
                                        filled[2].setText(whoseTurn[0]);
                                        break;
                                    case 15:
                                        filled[3].setText(whoseTurn[0]);
                                        break;
                                    case 16:
                                        filled[4].setText(whoseTurn[0]);
                                        break;
                                    case 17:
                                        filled[5].setText(whoseTurn[0]);
                                        break;
                                }
                            }
                        }
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
                            whoseTurn[0] = "P1";
                            grid[n].setImageResource(R.drawable.v_blue);
                        }else if (clickCounter[0] % 2 == 1){
                            whoseTurn[0] = "P2";
                            grid[n].setImageResource(R.drawable.v_red);
                        }

                        if(leftEdges.contains(side)){
                            isFilled = checkLeft(n, links);
                            if(isFilled){
                                switch (side) {
                                    case 4:
                                        filled[0].setText(whoseTurn[0]);
                                        break;
                                    case 11:
                                        filled[3].setText(whoseTurn[0]);
                                        break;
                                    case 18:
                                        filled[6].setText(whoseTurn[0]);
                                        break;
                                }
                            }
                        } else if (rightEdges.contains(side)) {
                            isFilled = checkRight(n, links);
                            if(isFilled) {
                                switch (side) {
                                    case 7:
                                        filled[2].setText(whoseTurn[0]);
                                        break;
                                    case 14:
                                        filled[5].setText(whoseTurn[0]);
                                        break;
                                    case 21:
                                        filled[8].setText(whoseTurn[0]);
                                        break;
                                }
                            }
                        }
                        else {
                            isFilled = checkLeft(n, links);
                            if (isFilled) {
                                switch (side) {
                                    case 5:
                                        filled[1].setText(whoseTurn[0]);
                                        break;
                                    case 6:
                                        filled[2].setText(whoseTurn[0]);
                                        break;
                                    case 12:
                                        filled[4].setText(whoseTurn[0]);
                                        break;
                                    case 13:
                                        filled[5].setText(whoseTurn[0]);
                                        break;
                                    case 19:
                                        filled[7].setText(whoseTurn[0]);
                                        break;
                                    case 20:
                                        filled[8].setText(whoseTurn[0]);
                                        break;
                                }
                            }
                            isFilled = checkRight(n, links);
                            if (isFilled) {
                                switch (side) {
                                    case 5:
                                        filled[0].setText(whoseTurn[0]);
                                        break;
                                    case 6:
                                        filled[1].setText(whoseTurn[0]);
                                        break;
                                    case 12:
                                        filled[3].setText(whoseTurn[0]);
                                        break;
                                    case 13:
                                        filled[4].setText(whoseTurn[0]);
                                        break;
                                    case 19:
                                        filled[6].setText(whoseTurn[0]);
                                        break;
                                    case 20:
                                        filled[7].setText(whoseTurn[0]);
                                        break;
                                }
                            }
                        }
                    }
                });
            }

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