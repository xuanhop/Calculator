package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClear, btnBracket, btnPercent,
            btnProduct, btnSubtract, btnDivide, btnEqual, btnPlus, btnSign, btnComma;

    TextView info, result;

    String calculate;

    private float firstNumber;
    private float secondNumber;
    float res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText("");
                result.setText("");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!info.getText().equals("")) {
                    firstNumber = Float.parseFloat(info.getText().toString());
                    info.setText("+");
                    calculate = "plus";
                }
                if (!result.getText().equals("")) {
                    info.setText(result.getText().toString());
                    firstNumber = Float.parseFloat(info.getText().toString());
                    info.setText("+");
                    calculate = "plus";
                }
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!info.getText().equals("")) {
                    firstNumber = Float.parseFloat(info.getText().toString());
                    info.setText("-");
                    calculate = "subtract";
                }
                if (!result.getText().equals("")) {
                    info.setText(result.getText().toString());
                    firstNumber = Float.parseFloat(info.getText().toString());
                    info.setText("-");
                    calculate = "subtract";
                }
            }
        });
        btnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!info.getText().equals("")) {
                    firstNumber = Float.parseFloat(info.getText().toString());
                    info.setText("X");
                    calculate = "product";
                }
                if (!result.getText().equals("")) {
                    info.setText(result.getText().toString());
                    firstNumber = Float.parseFloat(info.getText().toString());
                    info.setText("x");
                    calculate = "product";
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!info.getText().equals("")) {
                    firstNumber = Float.parseFloat(info.getText().toString());
                    info.setText("/");
                    calculate = "divide";
                }
                if (!result.getText().equals("")) {
                    info.setText(result.getText().toString());
                    firstNumber = Float.parseFloat(info.getText().toString());
                    info.setText("/");
                    calculate = "divide";
                }
            }
        });
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!info.getText().equals("")) {
                    secondNumber = Float.parseFloat(info.getText().toString().substring(1));
                    res = secondNumber / 100;
                    result.setText("" + res);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!info.getText().equals("")) {
                    secondNumber = Float.parseFloat(info.getText().toString().substring(1));
                    switch (calculate) {
                        case "plus": {
                            res = (int) (firstNumber + secondNumber);
                            result.setText(res + "");
                            break;
                        }
                        case "subtract": {
                            res = (int) (firstNumber - secondNumber);
                            result.setText("" + res);
                            break;
                        }
                        case "divide": {
                            if (secondNumber == 0) {
                                result.setText("ERROR");
                            } else {
                                res = firstNumber / secondNumber;
                                result.setText("" + res);
                            }
                            break;
                        }
                        case "product": {
                            res = firstNumber * secondNumber;
                            result.setText("" + res);
                            break;
                        }
                    }
                }
            }
        });
    }

    public void init() {
        btn1 = findViewById(R.id.btn1);
        btn0 = findViewById(R.id.btn0);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnClear = findViewById(R.id.btn_clear);
        btnBracket = findViewById(R.id.btn_bracket);
        btnPercent = findViewById(R.id.btn_percent);
        btnProduct = findViewById(R.id.btn_product);
        btnSubtract = findViewById(R.id.btn_substract);
        btnDivide = findViewById(R.id.btn_divide);
        btnEqual = findViewById(R.id.btn_equal);
        btnPlus = findViewById(R.id.btn_plus);
        btnSign = findViewById(R.id.btn_sign);
        btnComma = findViewById(R.id.btn_comma);

        info = findViewById(R.id.info);
        result = findViewById(R.id.ket_qua);
    }

}
