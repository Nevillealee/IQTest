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
import static android.R.attr.value;
import static android.R.id.message;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    public int correct = 0;

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
                newScreen.putExtra("result", String.valueOf(correct));
                startActivity(newScreen);
            }
        });

}

    public void whenClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        //check how many answers user got right
        switch (view.getId()) {
            case R.id.first_question:
                if (checked)
                    correct++;
            case R.id.second_question:
                if (checked)
                    correct++;
            case R.id.third_question:
                if (checked)
                    correct++;
            case R.id.forth_question:
                if (checked)
                    correct++;
            case R.id.fifth_question:
                if (checked)
                    correct++;
            case R.id.sixth_question:
                if (checked)
                    correct++;
            case R.id.seventh_question:
                if (checked)
                    correct++;
            case R.id.eighth_question:
                if (checked)
                    correct++;
            case R.id.nineth_question:
                if (checked)
                    correct++;
            case R.id.tenth_question:
                if (checked)
                    correct++;
                break;
        }
    }


}

