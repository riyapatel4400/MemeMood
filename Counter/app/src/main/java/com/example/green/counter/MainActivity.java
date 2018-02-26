package com.example.green.counter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private TextView countValueDisplay;
    private Button happyButton;
    private Button sadButton;
    private ImageView meme1;
    private ImageView meme2;
    private ImageView meme3;
    private ImageView meme4;
    private ImageView meme5;
    private ImageView meme6;
    private ImageView meme7;
    private ImageView meme8;
    private ImageView meme9;
    private ImageView meme10;


    private View.OnClickListener myClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            meme1 = (ImageView) findViewById(R.id.meme1);
            meme2 = (ImageView) findViewById(R.id.meme2);
            meme3 = (ImageView) findViewById(R.id.meme3);
            meme4 = (ImageView) findViewById(R.id.meme4);
            meme5 = (ImageView) findViewById(R.id.meme5);
            meme6 = (ImageView) findViewById(R.id.meme6);
            meme7 = (ImageView) findViewById(R.id.meme7);
            meme8 = (ImageView) findViewById(R.id.meme8);
            meme9 = (ImageView) findViewById(R.id.meme9);
            meme10 = (ImageView) findViewById(R.id.meme10);


            switch (view.getId()) {
                case R.id.happy:
                    int count = (int)(Math.random()*5)+1;
                    if(count == 1) {
                        meme1.setVisibility(View.VISIBLE);
                        meme2.setVisibility(View.INVISIBLE);
                        meme3.setVisibility(View.INVISIBLE);
                        meme4.setVisibility(View.INVISIBLE);
                        meme5.setVisibility(View.INVISIBLE);
                        meme6.setVisibility(View.INVISIBLE);
                        meme7.setVisibility(View.INVISIBLE);
                        meme8.setVisibility(View.INVISIBLE);
                        meme9.setVisibility(View.INVISIBLE);
                        meme10.setVisibility(View.INVISIBLE);
                    }
                    if(count ==2)
                    {
                        meme1.setVisibility(View.INVISIBLE);
                        meme2.setVisibility(View.VISIBLE);
                        meme3.setVisibility(View.INVISIBLE);
                        meme4.setVisibility(View.INVISIBLE);
                        meme5.setVisibility(View.INVISIBLE);
                        meme6.setVisibility(View.INVISIBLE);
                        meme7.setVisibility(View.INVISIBLE);
                        meme8.setVisibility(View.INVISIBLE);
                        meme9.setVisibility(View.INVISIBLE);
                        meme10.setVisibility(View.INVISIBLE);
                    }
                    if(count==3)
                    {
                        meme1.setVisibility(View.INVISIBLE);
                        meme2.setVisibility(View.INVISIBLE);
                        meme3.setVisibility(View.VISIBLE);
                        meme4.setVisibility(View.INVISIBLE);
                        meme5.setVisibility(View.INVISIBLE);
                        meme6.setVisibility(View.INVISIBLE);
                        meme7.setVisibility(View.INVISIBLE);
                        meme8.setVisibility(View.INVISIBLE);
                        meme9.setVisibility(View.INVISIBLE);
                        meme10.setVisibility(View.INVISIBLE);
                    }
                    if(count==4)
                    {
                        meme1.setVisibility(View.INVISIBLE);
                        meme2.setVisibility(View.INVISIBLE);
                        meme3.setVisibility(View.INVISIBLE);
                        meme4.setVisibility(View.VISIBLE);
                        meme5.setVisibility(View.INVISIBLE);
                        meme6.setVisibility(View.INVISIBLE);
                        meme7.setVisibility(View.INVISIBLE);
                        meme8.setVisibility(View.INVISIBLE);
                        meme9.setVisibility(View.INVISIBLE);
                        meme10.setVisibility(View.INVISIBLE);
                    }
                    if(count==5)
                    {
                        meme1.setVisibility(View.INVISIBLE);
                        meme2.setVisibility(View.INVISIBLE);
                        meme3.setVisibility(View.INVISIBLE);
                        meme4.setVisibility(View.INVISIBLE);
                        meme5.setVisibility(View.VISIBLE);
                        meme6.setVisibility(View.INVISIBLE);
                        meme7.setVisibility(View.INVISIBLE);
                        meme8.setVisibility(View.INVISIBLE);
                        meme9.setVisibility(View.INVISIBLE);
                        meme10.setVisibility(View.INVISIBLE);
                    }
                    break;
                case R.id.sad:
                    int count2 = (int)(Math.random()*5)+1;
                    if(count2 == 1) {
                        meme1.setVisibility(View.INVISIBLE);
                        meme2.setVisibility(View.INVISIBLE);
                        meme3.setVisibility(View.INVISIBLE);
                        meme4.setVisibility(View.INVISIBLE);
                        meme5.setVisibility(View.INVISIBLE);
                        meme6.setVisibility(View.VISIBLE);
                        meme7.setVisibility(View.INVISIBLE);
                        meme8.setVisibility(View.INVISIBLE);
                        meme9.setVisibility(View.INVISIBLE);
                        meme10.setVisibility(View.INVISIBLE);
                    }
                    if(count2 ==2)
                    {
                        meme1.setVisibility(View.INVISIBLE);
                        meme2.setVisibility(View.INVISIBLE);
                        meme3.setVisibility(View.INVISIBLE);
                        meme4.setVisibility(View.INVISIBLE);
                        meme5.setVisibility(View.INVISIBLE);
                        meme6.setVisibility(View.INVISIBLE);
                        meme7.setVisibility(View.VISIBLE);
                        meme8.setVisibility(View.INVISIBLE);
                        meme9.setVisibility(View.INVISIBLE);
                        meme10.setVisibility(View.INVISIBLE);
                    }
                    if(count2==3)
                    {
                        meme1.setVisibility(View.INVISIBLE);
                        meme2.setVisibility(View.INVISIBLE);
                        meme3.setVisibility(View.INVISIBLE);
                        meme4.setVisibility(View.INVISIBLE);
                        meme5.setVisibility(View.INVISIBLE);
                        meme6.setVisibility(View.INVISIBLE);
                        meme7.setVisibility(View.INVISIBLE);
                        meme8.setVisibility(View.VISIBLE);
                        meme9.setVisibility(View.INVISIBLE);
                        meme10.setVisibility(View.INVISIBLE);
                    }
                    if(count2==4)
                    {
                        meme1.setVisibility(View.INVISIBLE);
                        meme2.setVisibility(View.INVISIBLE);
                        meme3.setVisibility(View.INVISIBLE);
                        meme4.setVisibility(View.INVISIBLE);
                        meme5.setVisibility(View.INVISIBLE);
                        meme6.setVisibility(View.INVISIBLE);
                        meme7.setVisibility(View.INVISIBLE);
                        meme8.setVisibility(View.INVISIBLE);
                        meme9.setVisibility(View.VISIBLE);
                        meme10.setVisibility(View.INVISIBLE);
                    }
                    if(count2==5)
                    {
                        meme1.setVisibility(View.INVISIBLE);
                        meme2.setVisibility(View.INVISIBLE);
                        meme3.setVisibility(View.INVISIBLE);
                        meme4.setVisibility(View.INVISIBLE);
                        meme5.setVisibility(View.INVISIBLE);
                        meme6.setVisibility(View.INVISIBLE);
                        meme7.setVisibility(View.INVISIBLE);
                        meme8.setVisibility(View.INVISIBLE);
                        meme9.setVisibility(View.INVISIBLE);
                        meme10.setVisibility(View.VISIBLE);
                    }
                    break;
            }


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        happyButton = findViewById(R.id.happy);
        sadButton = findViewById(R.id.sad);

        happyButton.setOnClickListener(myClickListener);
        sadButton.setOnClickListener(myClickListener);


    }
}