package com.example.tools;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class calender extends AppCompatActivity {
    CalendarView calendar;
    TextView date_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        calendar = findViewById(R.id.calendar);
        date_view = findViewById(R.id.date_view);


        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
                            // In this Listener have one method
                            // and in this method we will
                            // get the value of DAYS, MONTH, YEARS
            public void onSelectedDayChange(
                    @NonNull CalendarView view,
                    int year,
                    int month,
                    int dayOfMonth)
            {

                // Store the value of date with
                // format in String type Variable
                // Add 1 in month because month
                // index is start with 0
                String Date
                        = dayOfMonth + "/"
                        + (month + 1) + "/" + year;
                // set this date in TextView for Display
                date_view.setText("Selected Date is "+"\n" +Date);
            }
        });


    }
}