package com.example.tools;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.SplittableRandom;

public class number_system extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Celcius";
    String toUnit = "Farenheit";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Binary",
            "Octal",
            "Decimal",
            "Hexa-Decimal"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(values[0]);
        tv_toUnit.setText(values[0]);

        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);

        cv_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_fromUnit.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(celciusToFarenheit(Integer.parseInt(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(celciusToKelvin(Integer.parseInt(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(celciusToRankine(Integer.parseInt(tempInput)));
                        }
                    }
                    else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(fahrenheitToCelcius(Integer.parseInt(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(fahrenheitToKelvin(Integer.parseInt(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(fahrenheitToRankine(Integer.parseInt(tempInput)));
                        }
                    }
                    else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(kelvinToCelcius(Integer.parseInt(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(kelvinToFahrenheit(Integer.parseInt(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kelvinToRankine(Integer.parseInt(tempInput)));
                        }
                    }
                    else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(rankineToCelcius(tempInput));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(rankineToFahrenheit(tempInput));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(rankineToKelvin(tempInput));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(number_system.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Binary",
                        "Octal",
                        "Decimal",
                        "Hexa-Decimal"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                toUnit = selectedItem;
                                tv_toUnit.setText(toUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

        cv_fromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(number_system.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Binary",
                        "Octal",
                        "Decimal",
                        "Hexa-Decimal"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                fromUnit = selectedItem;
                                tv_fromUnit.setText(fromUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

    }

    //celcius
    private String celciusToKelvin(int celsius) {

        int decimal = Integer.parseInt(String.valueOf(celsius), 2);
        int kelvin = Integer.parseInt(String.valueOf(decimal));
        return String.valueOf(kelvin);
    }

    private String celciusToRankine(int celsius) {

        int decimal = Integer.parseInt(String.valueOf(celsius), 2);
        String rankine = Integer.toHexString(decimal);
        return rankine;
    }

    private String celciusToFarenheit(int celsius) {

        int decimal = Integer.parseInt(String.valueOf(celsius), 2);
        String fahrenheit = Integer.toOctalString(decimal);
        return fahrenheit;
    }

    //fahrenheit
    private String fahrenheitToKelvin(int fahrenheit) {

        int decimal = Integer.parseInt(String.valueOf(fahrenheit), 8);
        int kelvin = Integer.parseInt(String.valueOf(decimal));
        return String.valueOf(kelvin);
    }

    private String fahrenheitToRankine(int fahrenheit) {

        int decimal = Integer.parseInt(String.valueOf(fahrenheit), 8);
        String rankine = Integer.toHexString(decimal);
        return rankine;
    }

    private String fahrenheitToCelcius(int fahrenheit) {

        int decimal = Integer.parseInt(String.valueOf(fahrenheit), 8);
        String celcius = Integer.toBinaryString(decimal);
        return celcius;
    }

    //Kelvin
    private String kelvinToRankine(int kelvin) {

        int decimal = Integer.parseInt(String.valueOf(kelvin), 10);
        String rankine = Integer.toHexString(decimal);
        return rankine;
    }


    private String kelvinToCelcius(int kelvin) {

        int decimal = Integer.parseInt(String.valueOf(kelvin), 10);
        String celcius = Integer.toBinaryString(decimal);
        return celcius;
    }

    private String kelvinToFahrenheit(int kelvin) {

        int decimal = Integer.parseInt(String.valueOf(kelvin), 10);
        String fahrenheit = Integer.toOctalString(decimal);
        return fahrenheit;
    }

    //Rankine
    private String rankineToCelcius(String rankine) {

        int decimal = Integer.parseInt(String.valueOf(rankine), 16);
        String celcius = Integer.toBinaryString(decimal);
        return celcius;
    }

    private String rankineToFahrenheit(String rankine) {

        int decimal = Integer.parseInt(String.valueOf(rankine), 16);
        String fahrenheit = Integer.toOctalString(decimal);
        return fahrenheit;
    }

    private String rankineToKelvin(String rankine) {

        int decimal = Integer.parseInt(String.valueOf(rankine), 16);
        int kelvin = Integer.parseInt(String.valueOf(decimal));
        return String.valueOf(kelvin);
    }
}