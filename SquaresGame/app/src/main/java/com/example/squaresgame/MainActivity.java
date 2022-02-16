package com.example.squaresgame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.content.Context;

import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
    }
}

class ImageAdapter extends BaseAdapter {
    int clickCounter = 0;
    boolean whoseTurn = true;

    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(125, 275));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickCounter++;
                    /*
                    The whoseTurn variable indicates which player's turn it is. If whoseTurn is
                    equal to TRUE, then it is player 1's turn. If whoseTurn is equal to FALSE, then
                    it is player 2's turn.
                     */
                    if(whoseTurn == true){
                        imageView.setImageResource(R.drawable.pic_2);
                    }
                    if(whoseTurn == false){
                        imageView.setImageResource(R.drawable.pic_3);
                    }
                    System.out.println("It worked! " + clickCounter);
                    if (whoseTurn == true && clickCounter % 2 == 0){
                        whoseTurn = false;
                    }else if (whoseTurn == false && clickCounter % 2 == 0){
                        whoseTurn = true;
                    }
                }
            });
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,
            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,

            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,
            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,

            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,
            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,

            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,
            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,

            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,
            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,

            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1,
            R.drawable.pic_1, R.drawable.pic_1, R.drawable.pic_1


    };
}

