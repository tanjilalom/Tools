package com.example.tools;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;

public class length extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Celcius";
    String toUnit = "Farenheit";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Kilometer",
            "Meter",
            "Centimeter",
            "Millimeter",
            "Foot", "Inch"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

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
                            et_toUnit.setText(celciusToFarenheit(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(celciusToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(celciusToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(celciusToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(celciusToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(fahrenheitToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(fahrenheitToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(fahrenheitToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(fahrenheitToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(fahrenheitToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(kelvinToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(kelvinToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kelvinToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(kelvinToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kelvinToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(rankineToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(rankineToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(rankineToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(rankineToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(rankineToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(newtonToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(newtonToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(newtonToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(newtonToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(newtonToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(delisleToCelcius(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(delisleToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(delisleToKelvin(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(delisleToRankine(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(delisleToNewton(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(tempInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(length.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilometer",
                        "Meter",
                        "Centimeter",
                        "Millimeter",
                        "Foot", "Inch"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(length.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilometer",
                        "Meter",
                        "Centimeter",
                        "Millimeter",
                        "Foot", "Inch"
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
    private String celciusToKelvin(double celsius) {
        double kelvin = celsius / 100000;
        return String.valueOf(kelvin);
    }

    private String celciusToRankine(double celsius) {
        double rankine = celsius / 1000000;
        return String.valueOf(rankine);
    }

    private String celciusToNewton(double celsius) {
        double newton = celsius / 3280.8399;
        return String.valueOf(newton);
    }

    private String celciusToDelisle(double celsius) {
        double delisle = celsius * 39370.0;
        return String.valueOf(delisle);
    }

    private String celciusToFarenheit(double celsius) {
        double fahrenheit = celsius * 1000;
        return String.valueOf(fahrenheit);
    }

    //fahrenheit
    private String fahrenheitToKelvin(double fahrenheit) {
        double kelvin = fahrenheit * 100;
        return String.valueOf(kelvin);
    }

    private String fahrenheitToRankine(double fahrenheit) {
        double rankine = fahrenheit * 1000;
        return String.valueOf(rankine);
    }

    private String fahrenheitToNewton(double fahrenheit) {
        double newton = fahrenheit * 3.2808399;
        return String.valueOf(newton);
    }

    private String fahrenheitToDelisle(double fahrenheit) {
        double delisle = fahrenheit * 39.3700787;
        return String.valueOf(delisle);
    }

    private String fahrenheitToCelcius(double fahrenheit) {
        double celcius = fahrenheit / 1000;
        return String.valueOf(celcius);
    }

    //Kelvin
    private String kelvinToRankine(double kelvin) {
        double rankine = kelvin / 10;
        return String.valueOf(rankine);
    }

    private String kelvinToNewton(double kelvin) {
        double newton = kelvin / 30.48;
        return String.valueOf(newton);
    }

    private String kelvinToDelisle(double kelvin) {
        double delisle = kelvin / 2.54;
        return String.valueOf(delisle);
    }

    private String kelvinToCelcius(double kelvin) {
        double celcius = kelvin / 100000;
        return String.valueOf(celcius);
    }

    private String kelvinToFahrenheit(double kelvin) {
        double fahrenheit = kelvin / 100;
        return String.valueOf(fahrenheit);
    }

    //Rankine
    private String rankineToNewton(double rankine) {
        double newton = rankine * 304.8;
        return String.valueOf(newton);
    }

    private String rankineToDelisle(double rankine) {
        double delisle = rankine / 25.4;
        return String.valueOf(delisle);
    }

    private String rankineToCelcius(double rankine) {
        double celcius = rankine / 1e-6;
        return String.valueOf(celcius);
    }

    private String rankineToFahrenheit(double rankine) {
        double fahrenheit = rankine / 1000;
        return String.valueOf(fahrenheit);
    }

    private String rankineToKelvin(double rankine) {
        double kelvin = rankine / 10;
        return String.valueOf(kelvin);
    }

    //Newton
    private String newtonToDelisle(double newton) {
        double delisle = newton * 12;
        return String.valueOf(delisle);
    }

    private String newtonToCelcius(double newton) {
        double celcius = newton / 3280.84;
        return String.valueOf(celcius);
    }

    private String newtonToFahrenheit(double newton) {
        double fahrenheit = newton / 3.28084;
        return String.valueOf(fahrenheit);
    }

    private String newtonToKelvin(double newton) {
        double kelvin = newton * 30.48;
        return String.valueOf(kelvin);
    }

    private String newtonToRankine(double newton) {
        double rankine = newton * 304.8;
        return String.valueOf(rankine);
    }

    //Delisle
    private String delisleToCelcius(double delisle) {
        double celcius = delisle / 39370.1;
        return String.valueOf(celcius);
    }

    private String delisleToFahrenheit(double delisle) {
        double fahrenheit = delisle / 39.37;
        return String.valueOf(fahrenheit);
    }

    private String delisleToKelvin(double delisle) {
        double kelvin = delisle * 2.54;
        return String.valueOf(kelvin);
    }

    private String delisleToRankine(double delisle) {
        double rankine = delisle * 25.4;
        return String.valueOf(rankine);
    }

    private String delisleToNewton(double delisle) {
        double newton = delisle / 12;
        return String.valueOf(newton);
    }

}