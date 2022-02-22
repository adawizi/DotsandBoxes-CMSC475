package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView link1;
    ImageView link2;
    ImageView link3;
    ImageView link4;
    ImageView link5;
    ImageView link6;
    ImageView link7;
    ImageView link8;
    ImageView link9;
    ImageView link10;
    ImageView link11;
    ImageView link12;
    ImageView link13;
    ImageView link14;
    ImageView link15;
    ImageView link16;
    ImageView link17;
    ImageView link18;
    ImageView link19;
    ImageView link20;
    ImageView link21;
    ImageView link22;
    ImageView link23;
    ImageView link24;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] links = new int[23];
        final int[] clickCounter = {0};
        final boolean[] whoseTurn = {true};
        //The bottom side of square is 7 more than top
        //The left side of square is 3 more than top
        //The right side of square is 4 more than top
        //Player 1's turn is indicated by the boolean value of true
        //Player 2's turn is indicated by the boolean value of false

        link1 = findViewById(R.id.link1);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[0] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });

        link2 = findViewById(R.id.link2);
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[1] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });


        link3 = findViewById(R.id.link3);
        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[2] = clickCounter[0];
                clickCounter[0]++;
                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });



        link4 = findViewById(R.id.link4);
        link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[3] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });


        link5 = findViewById(R.id.link5);
        link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[4] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });


        link6 = findViewById(R.id.link6);
        link6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[5] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });


        link7 = findViewById(R.id.link7);
        link7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[6] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });


        link8 = findViewById(R.id.link8);
        link8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[7] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });


        link9 = findViewById(R.id.link9);
        link9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[8] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });

        link10 = findViewById(R.id.link10);
        link10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[9] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }

            }
        });


        link11 = findViewById(R.id.link11);
        link11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[10] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link12 = findViewById(R.id.link12);
        link12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[11] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link13 = findViewById(R.id.link13);
        link13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[12] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link14 = findViewById(R.id.link14);
        link14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[13] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link15 = findViewById(R.id.link15);
        link15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[14] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link16 = findViewById(R.id.link16);
        link16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[15] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link17 = findViewById(R.id.link17);
        link17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[16] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link18 = findViewById(R.id.link18);
        link18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[17] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link19 = findViewById(R.id.link19);
        link19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[18] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link20 = findViewById(R.id.link20);
        link20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[19] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link21 = findViewById(R.id.link21);
        link21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[20] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link22 = findViewById(R.id.link22);
        link22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[21] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link23 = findViewById(R.id.link23);
        link23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[22] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


        link24 = findViewById(R.id.link24);
        link24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links[23] = clickCounter[0];
                clickCounter[0]++;

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                }
            }
        });


    }

}