package com.example.riyapatel.MemeMood;

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
    private int countH=1;
    private int countS=1;
    private ImageView myImageView;


    private String id;

    private View.OnClickListener myClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {

                switch (view.getId()) {
                case R.id.happy:
                    int count = (int)(Math.random()*3)+1;
                    if(count == 1) {
                        myImageView = (ImageView) findViewById(R.id.meme1);
                        myImageView.setImageResource(R.drawable.meme1);
                        myImageView.setVisibility(View.VISIBLE);
                    }
                    if(count ==2)
                    {
                        myImageView = (ImageView) findViewById(R.id.meme2);
                        myImageView.setImageResource(R.drawable.meme2);
                        myImageView.setVisibility(View.VISIBLE);
                    }
                    if(count==3)
                    {
                        {
                            myImageView = (ImageView) findViewById(R.id.meme3);
                            myImageView.setImageResource(R.drawable.meme3);
                            myImageView.setVisibility(View.VISIBLE);
                        }
                    }
                    break;
                case R.id.sad:
                    myImageView = (ImageView) findViewById(R.id.meme2);
                    myImageView.setImageResource(R.drawable.meme2);
                    myImageView.setVisibility(View.VISIBLE);
                    break;
            }


            }
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
        happyButton = findViewById(R.id.happy);
        sadButton = findViewById(R.id.sad);

        happyButton.setOnClickListener(myClickListener);
        sadButton.setOnClickListener(myClickListener);


    }
}
