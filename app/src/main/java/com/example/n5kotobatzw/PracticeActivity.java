package com.example.n5kotobatzw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


public class PracticeActivity extends AppCompatActivity {

    Button btn1;
    int code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        btn1=findViewById(R.id.txtT1);
        Button btn2=findViewById(R.id.txtT2);
        Button btn3=findViewById(R.id.txtT3);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code=1;
                Intent myIntent = new Intent(getApplicationContext(), MediaPlayerActivity.class);
                Bundle extras = new Bundle();
                extras.putString("yourcode", code + "");
                myIntent.putExtras(extras);
                startActivity(myIntent);
            }
        });


//        final MediaPlayer mp = MediaPlayer.create(this, R.raw.t1);
//        txt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (mp.isPlaying()) {
//                    mp.stop();
//                    mp.prepareAsync();
//                    mp.seekTo(0);
//                } else {
//                    mp.start();
//                }
//            }
//        });
//
//        txt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (mp.isPlaying()) {
//                    mp.stop();
//                    mp.prepareAsync();
//                    mp.seekTo(0);
//                } else {
//                    mp.start();
//                }
//            }
//        });
//
//        txt3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (mp.isPlaying()) {
//                    mp.stop();
//                    mp.prepareAsync();
//                    mp.seekTo(0);
//                } else {
//                    mp.start();
//                }
//            }
//        });
//

   }

//
//    public void onClick(View view) {
//
//        switch(view.getId()){
//            case R.id.txtT1:
//                code=1;
//                break;
//
//            case R.id.txtT2:
//                code=2;
//                break;
//        }
//        Intent i = new Intent(this, MediaPlayerActivity.class);
//        i.putExtra("yourcode", code);
//        startActivity(i);
//    }

}
