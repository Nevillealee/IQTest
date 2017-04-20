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
import android.widget.Switch;
import android.widget.TextView;

import static android.R.attr.button;
import static android.R.attr.right;
import static android.R.attr.value;
import static android.R.id.message;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    public int correct;
    int[] answerTotal = new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException {
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
                newScreen.putExtra("result",answerTotal);     // String.valueOf(correct)
                startActivity(newScreen);
            }
        });

    }
    public void whenClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        //check how many answers user got right
        switch (view.getId()) {
            case R.id.q1_b:
                if (checked)
                    answerTotal[0]= 1;
                //                Log.i("MainActivity", "The value of correct right now is " + correct);
                break;
            case R.id.q2_d:
                if (checked)
                    answerTotal[1]= 1;
                else answerTotal[1] = 0;
                break;
            case R.id.q3_b:
                if (checked)
                    answerTotal[2]= 1;
                else answerTotal[1] = 0;
                break;
            case R.id.q4_d:
                if (checked)
                    answerTotal[3]= 1;
                else answerTotal[1] = 0;
                break;
            case R.id.q5_a:
                if (checked)
                    answerTotal[4]= 1;
                else answerTotal[1] = 0;
                break;
            case R.id.q6_c:
                if (checked)
                    answerTotal[5]= 1;
                else answerTotal[1] = 0;
                break;
            case R.id.q7_b:
                if (checked)
                    answerTotal[6]= 1;
                else answerTotal[1] = 0;
                break;
            case R.id.q8_c:
                if (checked)
                    answerTotal[7]= 1;
                else answerTotal[1] = 0;
                break;
            case R.id.q9_c:
                if (checked)
                    answerTotal[8]= 1;
                else answerTotal[1] = 0;
                break;
            case R.id.q10_c:
                if (checked)
                    answerTotal[9]= 1;
                else answerTotal[1] = 0;
                break;
        }

    }


}

