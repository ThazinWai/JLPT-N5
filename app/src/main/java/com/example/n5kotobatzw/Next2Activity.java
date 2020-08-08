package com.example.n5kotobatzw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Next2Activity extends AppCompatActivity implements View.OnClickListener{

    private ProgressBar progressBar;
    private int progressStatus = 0;
    private Handler handler = new Handler();

    int count;
    String stringVariableName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);


        Bundle extras = getIntent().getExtras();
        stringVariableName = extras.getString("count");

        progressBar=findViewById(R.id.progressBar);

        ImageView wa = findViewById(R.id.imgWa);
        ImageView o = findViewById(R.id.imgO);
        ImageView ka = findViewById(R.id.imgKa);
        ImageView na = findViewById(R.id.imgNa);

        TextView score = findViewById(R.id.txtScore);

        //wa.setOnClickListener(this);
        //o.setOnClickListener(this);
        //na.setOnClickListener(this);
        ka.setOnClickListener(this);


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

                Intent myIntent = new Intent(getApplicationContext(), Next3Activity.class);
                Bundle extras = new Bundle();
                count = Integer.parseInt(stringVariableName);
                extras.putString("count", count+ "");
                myIntent.putExtras(extras);
                startActivity(myIntent);

            }
        }).start();

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.imgKa){
            Intent intent = new Intent(Next2Activity.this, Next3Activity.class);
            Bundle extras = new Bundle();
            count = Integer.parseInt(stringVariableName);
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
