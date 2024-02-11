package com.example.tools;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    AlertDialog.Builder alertDialog;
    ImageView calc, alarm, convrt, calender, compass, qr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc = findViewById(R.id.calculatorbtn);
        alarm = findViewById(R.id.alarmbtn);
        convrt = findViewById(R.id.converterbtn);
        calender = findViewById(R.id.calendarbtn);
        compass = findViewById(R.id.compassbtn);
        qr = findViewById(R.id.qrcodebtn);


        calc.setOnClickListener(this);
        alarm.setOnClickListener(this);
        convrt.setOnClickListener(this);
        calender.setOnClickListener(this);
        compass.setOnClickListener(this);
        qr.setOnClickListener(this);



    }




    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.calculatorbtn)
        {
            Intent intent = new Intent(this,calculator.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.alarmbtn)
        {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId()==R.id.converterbtn)
        {
            Intent intent = new Intent(this,converter.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.calendarbtn)
        {
            Intent intent = new Intent(this, calender.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.compassbtn)
        {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId()==R.id.qrcodebtn)
        {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        }

    }







    @Override
    public void onBackPressed() {
        alertDialog = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setTitle("Exit Dialog");

        alertDialog.setMessage("Want to exit");

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });



        AlertDialog alertD = alertDialog.create();
        alertD.show();
    }

}
