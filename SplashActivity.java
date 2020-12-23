package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    EditText edFirstValue,edSecondValue;
    TextView tvAns;
    Button plus,minus,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        edFirstValue = findViewById(R.id.edFirstValue);
        edSecondValue = findViewById(R.id.edSecondValue);
        tvAns = findViewById(R.id.tvAns);
        plus = findViewById(R.id.btnPlus);
        minus = findViewById(R.id.btnMinus);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fiValue,seValue,ans;
                Toast.makeText(SplashActivity.this, "Addition is performed", Toast.LENGTH_SHORT).show();
                fiValue = Integer.parseInt(edFirstValue.getText().toString());
                seValue = Integer.parseInt(edSecondValue.getText().toString());

                ans = fiValue + seValue;
                tvAns.setText("Answer is = "+ans);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fiValue,seValue,ans;
                Toast.makeText(SplashActivity.this, "Subtraction is performed", Toast.LENGTH_SHORT).show();
                fiValue = Integer.parseInt(edFirstValue.getText().toString());
                seValue = Integer.parseInt(edSecondValue.getText().toString());

                ans = fiValue - seValue;
                tvAns.setText("Answer is = "+ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fiValue,seValue,ans;
                Toast.makeText(SplashActivity.this, "Multiplication performed", Toast.LENGTH_SHORT).show();
                fiValue = Integer.parseInt(edFirstValue.getText().toString());
                seValue = Integer.parseInt(edSecondValue.getText().toString());

                ans = fiValue * seValue;
                tvAns.setText("Answer is = "+ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fiValue,seValue,ans;
                Toast.makeText(SplashActivity.this, "Division is performed", Toast.LENGTH_SHORT).show();
                fiValue = Integer.parseInt(edFirstValue.getText().toString());
                seValue = Integer.parseInt(edSecondValue.getText().toString());

                ans = fiValue / seValue;
                tvAns.setText("Answer is = "+ans);
            }
        });


    }
}