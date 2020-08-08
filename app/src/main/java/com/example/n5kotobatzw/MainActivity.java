package com.example.n5kotobatzw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int count =0;

    private ProgressBar progressBar;
    private int progressStatus = 0;
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progressBar);

        new Thread(new Runnable() {
            public void run() {
                while (progressStatus <= 100) {
                    progressStatus += 1;
                    handler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress(progressStatus);
                        }
                    });
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                     Intent myIntent = new Intent(getApplicationContext(), Next1Activity.class);
                     Bundle extras = new Bundle();
                     extras.putString("count", count + "");
                     myIntent.putExtras(extras);
                     startActivity(myIntent);

            }
        }).start();


        ImageView wa = findViewById(R.id.imgWa);
        ImageView o = findViewById(R.id.imgO);
        ImageView yu = findViewById(R.id.imgYu);
        ImageView na = findViewById(R.id.imgNa);

        TextView score = findViewById(R.id.txtScore);

        wa.setOnClickListener(this);
        o.setOnClickListener(this);
        na.setOnClickListener(this);
        yu.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

            if(v.getId()==R.id.imgWa){
                Intent intent = new Intent(MainActivity.this, Next1Activity.class);
                Bundle extras = new Bundle();
                count++;
                extras.putString("count", count + "");
                intent.putExtras(extras);
                startActivity(intent);


                new Thread(new Runnable() {
                    public void run() {
                        while (progressStatus <= 100) {
                            progressStatus =0;
                            handler.post(new Runnable() {
                                public void run() {
                                    progressBar.setProgress(progressStatus);
                                }
                            });
                            try {
                                Thread.sleep(40);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }


                    }
                }).start();

            }

         else
                Toast.makeText(v.getContext(), "Incorrect", Toast.LENGTH_SHORT).show();

    }

}
