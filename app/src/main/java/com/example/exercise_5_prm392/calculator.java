package com.example.exercise_5_prm392;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class calculator extends AppCompatActivity {

    EditText editTextNum1, editTextNum2;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editTextNum1 = findViewById(R.id.num1);
        editTextNum2 = findViewById(R.id.num2);
        textViewResult = findViewById(R.id.result);
    }

    public void onAdd(View view) {
        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        double result = num1 + num2;
        textViewResult.setText(" " + result);
    }

    public void onSub(View view) {
        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        double result = num1 - num2;
        textViewResult.setText(" " + result);
    }

    public void onMul(View view) {
        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        double result = num1 * num2;
        textViewResult.setText(" " + result);
    }

    public void onDiv(View view) {
        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        if (num2 == 0) {
            textViewResult.setText("Cannot divide by zero");
        } else {
            double result = num1 / num2;
            textViewResult.setText(" " + result);
        }
    }
}
