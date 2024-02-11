package com.example.tools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class bmi extends AppCompatActivity {

    EditText ageEditTxt, heighttext, weighttext;
    TextView outoutbmi;
    float height, weight,bmi, x;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        ageEditTxt = findViewById(R.id.ageID);
        weighttext = findViewById(R.id.weightID);
        heighttext = findViewById(R.id.heightID);
        outoutbmi= findViewById(R.id.bmiresult);

    }

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void calculateBMI(View view) {
        height= Float.parseFloat(heighttext.getText().toString());
        weight= Float.parseFloat(weighttext.getText().toString());

        df.setRoundingMode(RoundingMode.UP);

        x = height/100;
        bmi= weight/(x*x);

        if(bmi < 16){
            result = "You are Severely Under Weight";
        }else if(bmi < 18.5){
            result = "You are Under Weight";
        }else if(bmi >= 18.5 && bmi <= 24.9){
            result = "You are Normal Weight";
        }else if (bmi >= 25 && bmi <= 29.9){
            result = "You are Overweight";
        }else{
            result = "You are Obese";
        }


        outoutbmi.setText("BMI is "+ (new DecimalFormat("##.#").format(bmi)) + "\n" + "\n" +result );

    }


}
