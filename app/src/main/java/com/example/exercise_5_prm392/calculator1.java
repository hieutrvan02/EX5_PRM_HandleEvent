package com.example.exercise_5_prm392;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.exercise_5_prm392.databinding.ActivityCalculator1Binding;

public class calculator1 extends AppCompatActivity {
    private ActivityCalculator1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalculator1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.add.setOnClickListener(v -> performAddition());
        binding.sub.setOnClickListener(v -> performSubtraction());
        binding.mul.setOnClickListener(v -> performMultiplication());
        binding.div.setOnClickListener(v -> performDivision());
    }

    private void performAddition() {
        double num1 = Double.parseDouble(binding.num1.getText().toString());
        double num2 = Double.parseDouble(binding.num2.getText().toString());
        double result = num1 + num2;
        binding.result.setText(" " + result);
    }

    private void performSubtraction() {
        double num1 = Double.parseDouble(binding.num1.getText().toString());
        double num2 = Double.parseDouble(binding.num2.getText().toString());
        double result = num1 - num2;
        binding.result.setText(" " + result);
    }

    private void performMultiplication() {
        double num1 = Double.parseDouble(binding.num1.getText().toString());
        double num2 = Double.parseDouble(binding.num2.getText().toString());
        double result = num1 * num2;
        binding.result.setText(" " + result);
    }

    private void performDivision() {
        double num1 = Double.parseDouble(binding.num1.getText().toString());
        double num2 = Double.parseDouble(binding.num2.getText().toString());
        if (num2 == 0) {
            binding.result.setText("Cannot divide by zero");
        } else {
            double result = num1 / num2;
            binding.result.setText(" " + result);
        }
    }
}
