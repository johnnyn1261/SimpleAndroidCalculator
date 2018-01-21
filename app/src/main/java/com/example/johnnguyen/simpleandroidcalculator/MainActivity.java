package com.example.johnnguyen.simpleandroidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private DecimalFormat decimals = new DecimalFormat("#.#########");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_add = /*(Button)*/findViewById(R.id.button_add);
        Button button_subtract = findViewById(R.id.button_subtract);
        Button button_multiply = findViewById(R.id.button_multiply);
        Button button_divide = findViewById(R.id.button_divide);
        Button button_modulus = findViewById(R.id.button_modulus);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText_num1 = findViewById(R.id.editText_num1);
                EditText editText_num2 = findViewById(R.id.editText_num2);
                TextView textView_result = findViewById(R.id.textView_result);

                try {
                    double num1 = Double.parseDouble(editText_num1.getText().toString());
                    double num2 = Double.parseDouble(editText_num2.getText().toString());
                    double result = num1 + num2;

                    if (result % 1 == 0) {
                        textView_result.setText((int)result + "");
                    } else {
                        textView_result.setText(decimals.format(result) + "");
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });

        button_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText_num1 = findViewById(R.id.editText_num1);
                EditText editText_num2 = findViewById(R.id.editText_num2);
                TextView textView_result = findViewById(R.id.textView_result);

                try {
                    double num1 = Double.parseDouble(editText_num1.getText().toString());
                    double num2 = Double.parseDouble(editText_num2.getText().toString());
                    double result = num1 - num2;

                    if (result % 1 == 0) {
                        textView_result.setText((int)result + "");
                    } else {
                        textView_result.setText(decimals.format(result) + "");
                    }

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText_num1 = findViewById(R.id.editText_num1);
                EditText editText_num2 = findViewById(R.id.editText_num2);
                TextView textView_result = findViewById(R.id.textView_result);

                try {
                    double num1 = Double.parseDouble(editText_num1.getText().toString());
                    double num2 = Double.parseDouble(editText_num2.getText().toString());
                    double result = num1 * num2;

                    if (result % 1 == 0) {
                        textView_result.setText((int)result + "");
                    } else {
                        textView_result.setText(decimals.format(result) + "");
                    }

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText_num1 = findViewById(R.id.editText_num1);
                EditText editText_num2 = findViewById(R.id.editText_num2);
                TextView textView_result = findViewById(R.id.textView_result);

                try {
                    double num1 = Double.parseDouble(editText_num1.getText().toString());
                    double num2 = Double.parseDouble(editText_num2.getText().toString());

                    try {
                        double result = num1 / num2;

                        if (result % 1 == 0) {
                            textView_result.setText((int)result + "");
                        } else {
                            textView_result.setText(decimals.format(result) + "");
                        }

                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }

                /*
                if (num2 == 2) {
                    int result = num1 / num2;
                    textView_result.setText(result + "");
                } else {
                    textView_result.setText("error");
                }*/
            }
        });

        button_modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText_num1 = findViewById(R.id.editText_num1);
                EditText editText_num2 = findViewById(R.id.editText_num2);
                TextView textView_result = findViewById(R.id.textView_result);

                try {
                    double num1 = Double.parseDouble(editText_num1.getText().toString());
                    double num2 = Double.parseDouble(editText_num2.getText().toString());

                    try {
                        double result = num1 % num2;

                        if (result % 1 == 0) {
                            textView_result.setText((int)result + "");
                        } else {
                            textView_result.setText(decimals.format(result) + "");
                        }

                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
    }
}
