package com.example.n5kotobatzw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FinalResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);


        Bundle extras = getIntent().getExtras();
        String stringVariableName = extras.getString("count");

         int count = Integer.parseInt(stringVariableName);

         TextView txt=findViewById(R.id.txtScore);
         txt.setText(stringVariableName);

    }

    @Override
    public void onBackPressed() {
        return;

    }
}
