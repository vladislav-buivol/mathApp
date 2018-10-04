package com.example.math_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.StrictMath.round;

public class Quadratic_calculator_Activity extends AppCompatActivity {

    double a;
    double b;
    double c;

    TextView x1;
    TextView x2;

    TextView info;

    EditText inputA;
    EditText inputB;
    EditText inputC;

    private TextWatcher watcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic_calculator_);

        x1 = findViewById(R.id.anwserX);
        x2 = findViewById(R.id.anwserX2);

        inputA = findViewById(R.id.InputA);
        inputB = findViewById(R.id.InputB);
        inputC = findViewById(R.id.InputC);

        info = findViewById(R.id.info);

        inputA.addTextChangedListener(new GenericTextWatcher(inputA));
        inputB.addTextChangedListener(new GenericTextWatcher(inputB));
        inputC.addTextChangedListener(new GenericTextWatcher(inputC));

    }
    private class GenericTextWatcher implements TextWatcher {
        private View view;

        private GenericTextWatcher(View view) {
            this.view = view;
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (inputA.getText().toString().trim().equals("") ||
                    inputB.getText().toString().trim().equals("") ||
                    inputC.getText().toString().trim().equals("")) {
                String text = "Lahendid puuduvad";
                info.setText(text);
                zeroFields();
            } else if (ifXNull()){
                String text = "Nulliga ei saa jagada";
                info.setText(text);
                setImaginary();
            } else if(ifSquareRootNeg()){
                String text = "Ruutjuure all negatiivne arv";
                info.setText(text);
                setImaginary();
            } else {
                calculate();
                String text = "";
                info.setText(text);
            }
        }
        @Override
        public void afterTextChanged(Editable s) { }
    }
    public void zeroFields(){
        String setx1 = "X1 = ";
        String setx2 = "X2 = ";

        x1.setText(setx1);
        x2.setText(setx2);
    }
    public void setImaginary(){
        String setx1 = "X1 = imaginaararv";
        String setx2 = "X2 = imaginaararv";

        x1.setText(setx1);
        x2.setText(setx2);
    }

    public boolean ifXNull(){
        a = Double.parseDouble(inputA.getText().toString());
        return a == 0;
    }
    public boolean ifSquareRootNeg(){
        a = Double.parseDouble(inputA.getText().toString());
        b = Double.parseDouble(inputB.getText().toString());
        c = Double.parseDouble(inputC.getText().toString());
        double underSquareRoot = Math.pow(2,b)-(4*a*c);
        return underSquareRoot < 0;
    }
    public void calculate(){
        a = Double.parseDouble(inputA.getText().toString());
        b = Double.parseDouble(inputB.getText().toString());
        c = Double.parseDouble(inputC.getText().toString());

        double underSquareRoot = Math.pow(2,b)-(4*a*c);
        double anwserX1 = round(((-b+Math.sqrt(underSquareRoot))/(2*a))*1000)/1000;
        double anwserX2 =  Math.round(((-b-Math.sqrt(underSquareRoot))/(2*a))*1000)/1000;

        String stringx1 = "X1 = " + Double.toString(anwserX1);
        String stringx2 = "X2 = " + Double.toString(anwserX2);

        x1.setText(stringx1);
        x2.setText(stringx2);
    }





        /*inputA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (inputA.getText().toString().trim().equals("") ||
                        inputB.getText().toString().trim().equals("")||
                            inputC.getText().toString().trim().equals("")){
                    String text = "Lahendid puuduvad";
                    info.setText(text);
                } else {
                    String text = "";
                    info.setText(text);
                }
            }
            @Override
            public void afterTextChanged(Editable s) { }
        });
        inputB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (inputA.getText().toString().trim().equals("")||
                        inputB.getText().toString().trim().equals("")||
                            inputC.getText().toString().trim().equals("")){
                    String text = "Lahendid puuduvad";
                    info.setText(text);
                } else {
                    String text = "";
                    info.setText(text);
                }
            }
            @Override
            public void afterTextChanged(Editable s) { }
        });
        inputC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (inputA.getText().toString().trim().equals("")||
                        inputB.getText().toString().trim().equals("")||
                            inputC.getText().toString().trim().equals("")){
                    String text = "Lahendid puuduvad";
                    info.setText(text);
                } else {
                    String text = "";
                    info.setText(text);
                }
            }
            @Override
            public void afterTextChanged(Editable s) { }
        });
    }
    public void ifXNull(){
        a = Double.parseDouble(inputA.getText().toString());
        b = Double.parseDouble(inputB.getText().toString());
        c = Double.parseDouble(inputC.getText().toString());
    }*/



}

