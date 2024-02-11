package com.example.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;

public class discount extends AppCompatActivity {
    private EditText orgprice, disamount;
    private TextView finprc, save;
    private float a, b, finalp,x, saved;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount);
        orgprice= findViewById(R.id.orginalprice);
        disamount= findViewById(R.id.discountamount);
        finprc= findViewById(R.id.finalprice);
        save= findViewById(R.id.savetext);

    }

    public void discalculate(View view) {

        a = Float.parseFloat((orgprice.getText().toString()));
        b = Float.parseFloat((disamount.getText().toString()));

        x = (b/100) * a;
        finalp = a-x;

        saved = a-finalp;

        finprc.setText(String.valueOf(finalp));

        save.setText("You saved "+String.valueOf(saved)+" Taka");



    }
}