package com.example.android.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.button;
import static android.R.attr.value;
import static android.R.id.message;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
   static int correct =0;
//    RadioButton q1Answer = (RadioButton) findViewById(R.id.q1_b);
//    RadioButton q2Answer = (RadioButton) findViewById(R.id.q2_d);
//    RadioButton q3Answer = (RadioButton) findViewById(R.id.q3_b);
//    RadioButton q4Answer = (RadioButton) findViewById(R.id.q4_d);
//    RadioButton q5Answer = (RadioButton) findViewById(R.id.q5_a);
//    RadioButton q6Answer = (RadioButton) findViewById(R.id.q6_c);
//    RadioButton q7Answer = (RadioButton) findViewById(R.id.q7_b);
//    RadioButton q8Answer = (RadioButton) findViewById(R.id.q8_c);
//    RadioButton q9Answer = (RadioButton) findViewById(R.id.q9_c);
//    RadioButton q10Answer = (RadioButton) findViewById(R.id.q10_c);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create button variable
        Button dButton;
        dButton = (Button) findViewById(R.id.done_button);
        //use OnClick listener method to invoke instructors when done button is pressed
        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make intent that changes to new activity
                Intent newScreen = new Intent(MainActivity.this, Results.class);
//                newScreen.putExtra("results", correct);
                startActivity(newScreen);
            }
        });

}

        public void whenClicked(View view){
            correct++;
        }



}

