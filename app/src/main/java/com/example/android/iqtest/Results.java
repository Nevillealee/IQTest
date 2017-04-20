package com.example.android.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Results extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView finalView = (TextView) findViewById(R.id.results_text_view);

        int[] resArray = getIntent().getIntArrayExtra("result");
        int correct =0;
        for(int j=0; j < resArray.length; j++){
            if(resArray[j] == 1){
                correct ++;
            }
        }
        finalView.setText(String.valueOf(correct));


    }


}
