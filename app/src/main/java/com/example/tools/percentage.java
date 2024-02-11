package com.example.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class percentage extends AppCompatActivity {
    private EditText number, percentage;

    private TextView finprc;

    private float a, b, x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);
        number = findViewById(R.id.percentnum);
        percentage = findViewById(R.id.percentamount);
        finprc = findViewById(R.id.finalprice);
    }

    public void percentcalculate(View view) {

        a = Float.parseFloat((number.getText().toString()));
        b = Float.parseFloat((percentage.getText().toString()));

        x =  (b/100) * a;

        finprc.setText(String.valueOf(x));
        

    }
}