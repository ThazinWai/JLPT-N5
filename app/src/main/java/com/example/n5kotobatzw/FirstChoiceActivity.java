package com.example.n5kotobatzw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstChoiceActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_choice);

        Button btnPractice=findViewById(R.id.btnPractice);
        Button btnTest=findViewById(R.id.btnTest);


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.t1);
        btnPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(v.getContext(),PracticeActivity.class);
                startActivity(intent);
            }
        });


//        btnPractice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(v.getContext(),MainActivity.class);
//                startActivity(intent);
//            }
//        });
//
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().hide();
    }

}
