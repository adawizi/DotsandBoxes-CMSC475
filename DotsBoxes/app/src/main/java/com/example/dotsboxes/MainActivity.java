package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;

    boolean isFilled = false;
    boolean isFilled2 = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] links = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1};
        final int[] clickCounter = {0};
        final int[] oneAway = new int[24];

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
                clickCounter[0]++;
                links[0] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link1.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link1.setImageResource(R.drawable.ra);
                }

                isFilled = checkTop(0, links);

                textView1 = findViewById(R.id.textView1);
                if(isFilled == true && whoseTurn[0] == true){
                    textView1.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView1.setText("P2");
                }

            }
        });

        link2 = findViewById(R.id.link2);
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[1] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link2.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link2.setImageResource(R.drawable.ra);
                }
                isFilled = checkTop(1, links);

                textView2 = findViewById(R.id.textView2);
                if(isFilled == true && whoseTurn[0] == true){
                    textView2.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView2.setText("P2");
                }


            }
        });


        link3 = findViewById(R.id.link3);
        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[2] = clickCounter[0];

                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link3.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link3.setImageResource(R.drawable.ra);
                }
                isFilled = checkTop(2, links);

                textView3 = findViewById(R.id.textView3);
                if(isFilled == true && whoseTurn[0] == true){
                    textView3.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView3.setText("P2");
                }


            }
        });



        link4 = findViewById(R.id.link4);
        link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[3] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link4.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link4.setImageResource(R.drawable.ra);
                }
                isFilled = checkLeft(3, links);

                textView1 = findViewById(R.id.textView1);
                if(isFilled == true && whoseTurn[0] == true){
                    textView1.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView1.setText("P2");
                }

            }
        });


        link5 = findViewById(R.id.link5);
        link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[4] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link5.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link5.setImageResource(R.drawable.ra);
                }
                isFilled = checkLeft(4, links);
                isFilled2 = checkRight(4, links);

                textView2 = findViewById(R.id.textView2);
                if(isFilled == true && whoseTurn[0] == true){
                    textView2.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView2.setText("P2");
                }

                textView1 = findViewById(R.id.textView1);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView1.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView1.setText("P2");
                }


            }
        });


        link6 = findViewById(R.id.link6);
        link6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[5] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link6.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link6.setImageResource(R.drawable.ra);
                }
                isFilled = checkLeft(5, links);
                isFilled2 = checkRight(5, links);

                textView3 = findViewById(R.id.textView3);
                if(isFilled == true && whoseTurn[0] == true){
                    textView3.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView3.setText("P2");
                }

                textView2 = findViewById(R.id.textView2);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView2.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView2.setText("P2");
                }

            }
        });


        link7 = findViewById(R.id.link7);
        link7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[6] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link7.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link7.setImageResource(R.drawable.ra);
                }
                isFilled = checkRight(6, links);

                textView3 = findViewById(R.id.textView3);
                if(isFilled == true && whoseTurn[0] == true){
                    textView3.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView3.setText("P2");
                }

            }
        });


        link8 = findViewById(R.id.link8);
        link8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[7] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link8.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link8.setImageResource(R.drawable.ra);
                }
                isFilled = checkTop(7, links);
                isFilled2 = checkBottom(7, links);

                textView4 = findViewById(R.id.textView4);
                if(isFilled == true && whoseTurn[0] == true){
                    textView4.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView4.setText("P2");
                }

                textView1 = findViewById(R.id.textView1);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView1.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView1.setText("P2");
                }

            }
        });


        link9 = findViewById(R.id.link9);
        link9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[8] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link9.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link9.setImageResource(R.drawable.ra);
                }
                isFilled = checkTop(8, links);
                isFilled2 = checkBottom(8, links);

                textView5 = findViewById(R.id.textView5);
                if(isFilled == true && whoseTurn[0] == true){
                    textView5.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView5.setText("P2");
                }

                textView2 = findViewById(R.id.textView2);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView2.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView2.setText("P2");
                }

            }
        });

        link10 = findViewById(R.id.link10);
        link10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[9] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link10.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link10.setImageResource(R.drawable.ra);
                }
                isFilled = checkTop(9, links);
                isFilled2 = checkBottom(9, links);

                textView6 = findViewById(R.id.textView6);
                if(isFilled == true && whoseTurn[0] == true){
                    textView6.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView6.setText("P2");
                }

                textView3 = findViewById(R.id.textView3);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView3.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView3.setText("P2");
                }

            }
        });


        link11 = findViewById(R.id.link11);
        link11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[10] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link11.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link11.setImageResource(R.drawable.ra);
                }
                isFilled = checkLeft(10, links);

                textView4 = findViewById(R.id.textView4);
                if(isFilled == true && whoseTurn[0] == true){
                    textView4.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView4.setText("P2");
                }


            }
        });


        link12 = findViewById(R.id.link12);
        link12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[11] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link12.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link12.setImageResource(R.drawable.ra);
                }
                isFilled = checkLeft(11, links);
                isFilled2 = checkRight(11, links);

                textView5 = findViewById(R.id.textView5);
                if(isFilled == true && whoseTurn[0] == true){
                    textView5.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView5.setText("P2");
                }

                textView4 = findViewById(R.id.textView4);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView4.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView4.setText("P2");
                }
            }
        });


        link13 = findViewById(R.id.link13);
        link13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[12] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link13.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link13.setImageResource(R.drawable.ra);
                }
                isFilled = checkLeft(12, links);
                isFilled2 = checkRight(12, links);

                textView6 = findViewById(R.id.textView6);
                if(isFilled == true && whoseTurn[0] == true){
                    textView6.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView6.setText("P2");
                }

                textView5 = findViewById(R.id.textView5);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView5.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView5.setText("P2");
                }
            }
        });


        link14 = findViewById(R.id.link14);
        link14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[13] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link14.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link14.setImageResource(R.drawable.ra);
                }
                isFilled = checkRight(13, links);

                textView6 = findViewById(R.id.textView6);
                if(isFilled == true && whoseTurn[0] == true){
                    textView6.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView6.setText("P2");
                }



            }
        });


        link15 = findViewById(R.id.link15);
        link15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[14] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link15.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link15.setImageResource(R.drawable.ra);
                }
                isFilled = checkTop(14, links);
                isFilled2 = checkBottom(14, links);

                textView7 = findViewById(R.id.textView7);
                if(isFilled == true && whoseTurn[0] == true){
                    textView7.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView7.setText("P2");
                }

                textView4 = findViewById(R.id.textView4);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView4.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView4.setText("P2");
                }
            }
        });


        link16 = findViewById(R.id.link16);
        link16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[15] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link16.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link16.setImageResource(R.drawable.ra);
                }
                isFilled = checkTop(15, links);
                isFilled2 = checkBottom(15, links);

                textView8 = findViewById(R.id.textView8);
                if(isFilled == true && whoseTurn[0] == true){
                    textView8.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView8.setText("P2");
                }

                textView5 = findViewById(R.id.textView5);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView5.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView5.setText("P2");
                }
            }
        });


        link17 = findViewById(R.id.link17);
        link17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[16] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link17.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link17.setImageResource(R.drawable.ra);
                }
                isFilled = checkTop(16, links);
                isFilled2 = checkBottom(16, links);

                textView9 = findViewById(R.id.textView9);
                if(isFilled == true && whoseTurn[0] == true){
                    textView9.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView9.setText("P2");
                }

                textView6 = findViewById(R.id.textView6);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView6.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView6.setText("P2");
                }
            }
        });


        link18 = findViewById(R.id.link18);
        link18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[17] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link18.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link18.setImageResource(R.drawable.ra);
                }
                isFilled = checkLeft(17, links);

                textView7 = findViewById(R.id.textView7);
                if(isFilled == true && whoseTurn[0] == true){
                    textView7.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView7.setText("P2");
                }
            }
        });


        link19 = findViewById(R.id.link19);
        link19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[18] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link19.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link19.setImageResource(R.drawable.ra);
                }
                isFilled = checkLeft(18, links);
                isFilled2 = checkRight(18, links);

                textView8 = findViewById(R.id.textView8);
                if(isFilled == true && whoseTurn[0] == true){
                    textView8.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView8.setText("P2");
                }

                textView7 = findViewById(R.id.textView7);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView7.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView7.setText("P2");
                }
            }
        });


        link20 = findViewById(R.id.link20);
        link20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[19] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link20.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link20.setImageResource(R.drawable.ra);
                }
                isFilled = checkLeft(19, links);
                isFilled2 = checkRight(19, links);

                textView9 = findViewById(R.id.textView9);
                if(isFilled == true && whoseTurn[0] == true){
                    textView9.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView9.setText("P2");
                }

                textView8 = findViewById(R.id.textView8);
                if(isFilled2 == true && whoseTurn[0] == true){
                    textView8.setText("P1");

                } else if (isFilled2 == true && whoseTurn[0] == false){
                    textView8.setText("P2");
                }
            }
        });


        link21 = findViewById(R.id.link21);
        link21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[20] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link21.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link21.setImageResource(R.drawable.ra);
                }
                isFilled = checkRight(20, links);

                textView9 = findViewById(R.id.textView9);
                if(isFilled == true && whoseTurn[0] == true){
                    textView9.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView9.setText("P2");
                }

            }
        });


        link22 = findViewById(R.id.link22);
        link22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[21] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link22.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link22.setImageResource(R.drawable.ra);
                }
                isFilled = checkBottom(21, links);

                textView7 = findViewById(R.id.textView7);
                if(isFilled == true && whoseTurn[0] == true){
                    textView7.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView7.setText("P2");
                }

            }
        });


        link23 = findViewById(R.id.link23);
        link23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[22] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link23.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link23.setImageResource(R.drawable.ra);
                }
                isFilled = checkBottom(22, links);

                textView8 = findViewById(R.id.textView8);
                if(isFilled == true && whoseTurn[0] == true){
                    textView8.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView8.setText("P2");
                }

            }
        });


        link24 = findViewById(R.id.link24);
        link24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter[0]++;
                links[23] = clickCounter[0];


                if (clickCounter[0] % 2 == 0){
                    whoseTurn[0] = true;
                    link24.setImageResource(R.drawable.ba);
                }else if (clickCounter[0] % 2 == 1){
                    whoseTurn[0] = false;
                    link24.setImageResource(R.drawable.ra);

                }
                isFilled = checkBottom(23, links);

                textView9 = findViewById(R.id.textView9);
                if(isFilled == true && whoseTurn[0] == true){
                    textView9.setText("P1");

                } else if (isFilled == true && whoseTurn[0] == false){
                    textView9.setText("P2");
                }

            }
        });


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