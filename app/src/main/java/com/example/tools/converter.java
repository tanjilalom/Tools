package com.example.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
    }



    public void numclick(View view) {
        Intent intent = new Intent(this,number_system.class);
        startActivity(intent);
    }

    public void lengthclick(View view) {
        Intent intend = new Intent(this, length.class);
        startActivity(intend);
    }

    public void imgpdfclick(View view) {
    }

    public void bmiclick(View view) {
        Intent intent = new Intent(this,bmi.class);
        startActivity(intent);
    }

    public void dicountclick(View view) {
        Intent intent = new Intent(this,discount.class);
        startActivity(intent);
    }

    public void percentclick(View view) {
        Intent intent = new Intent(this, percentage.class);
        startActivity(intent);
    }

    public void dateclick(View view) {
        Intent intent = new Intent(this, datecalculate.class);
        startActivity(intent);
    }

    public void areaclick(View view) {
        Intent intent = new Intent(this, area.class);
        startActivity(intent);
    }

    public void volclick(View view) {
        Intent intent = new Intent(this, volume.class);
        startActivity(intent);
    }

    public void tempclick(View view) {
        Intent intent = new Intent(this,temperature.class);
        startActivity(intent);
    }

    public void speedclick(View view) {
        Intent intent = new Intent(this, speed.class);
        startActivity(intent);
    }

    public void massclick(View view) {
        Intent intent = new Intent(this, mass.class);
        startActivity(intent);
    }

    public void timeclick(View view) {
        Intent intent = new Intent(this, time.class);
        startActivity(intent);
    }

    public void ageclick(View view) {
        Intent intent = new Intent(this, age.class);
        startActivity(intent);
    }

    public void energyclick(View view) {
        Intent intent = new Intent(this, energy.class);
        startActivity(intent);
    }

    public void resistanceclick(View view) {
        Intent intent = new Intent(this, resistance.class);
        startActivity(intent);
    }
}