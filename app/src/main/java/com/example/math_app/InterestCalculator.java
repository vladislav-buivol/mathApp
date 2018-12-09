package com.example.math_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class InterestCalculator extends AppCompatActivity {
    EditText inputSumma;
    EditText inputPeriood;
    EditText inputIntress;

    double summa;
    double periood;
    double intress;

    TextView lihtIntress;
    TextView liitIntress;

    private TextWatcher watcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest__calculator);

        inputSumma = findViewById(R.id.inputsumma);
        inputPeriood = findViewById(R.id.inputperiood);
        inputIntress = findViewById(R.id.inputintress);

        inputSumma.addTextChangedListener(new InterestCalculator.GenericTextWatcher(inputSumma));
        inputPeriood.addTextChangedListener(new InterestCalculator.GenericTextWatcher(inputPeriood));
        inputIntress.addTextChangedListener(new InterestCalculator.GenericTextWatcher(inputIntress));

        lihtIntress = findViewById(R.id.lihtintress);
        liitIntress = findViewById(R.id.liitintress);
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
            if (inputSumma.getText().toString().trim().equals("") ||
                    inputPeriood.getText().toString().trim().equals("") ||
                    inputIntress.getText().toString().trim().equals("")) {
                emptyInputs();
            } else if (inputSumma.getText().toString().trim().equals("-") ||
                    inputPeriood.getText().toString().trim().equals("-") ||
                    inputIntress.getText().toString().trim().equals("-")){
                emptyInputs();
            } else {
                calculate();
            }
        }
        @Override
        public void afterTextChanged(Editable s) { }
    }
    public void emptyInputs(){
        String lihtText = "Lihtintress: ";
        String liitText = "Liitintress: ";
        lihtIntress.setText(lihtText);
        liitIntress.setText(liitText);
    }
    public void calculate(){
        summa = Double.parseDouble(inputSumma.getText().toString());
        periood = Double.parseDouble(inputPeriood.getText().toString());
        intress = Double.parseDouble(inputIntress.getText().toString());

        double lihtSum = summa* periood *(intress/100) + summa;
        double liitSum = summa * Math.pow((1+(intress/100)),periood);

        double roundedLihtSum = (double)Math.round(lihtSum * 10000d) / 10000d;
        double roundedLiitSum = (double)Math.round(liitSum * 10000d) / 10000d;

        String lihtText = "Lihtintress: " + Double.toString(roundedLihtSum);
        String liitText = "Liitintress: " + Double.toString(roundedLiitSum);
        lihtIntress.setText(lihtText);
        liitIntress.setText(liitText);
    }
}
