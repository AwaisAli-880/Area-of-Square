package com.naaz.areaofsquare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText input1;
Button button1;
TextView answer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1= findViewById(R.id.input);
        button1 = findViewById(R.id.button);
        answer1= findViewById(R.id.answer);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input = Double.parseDouble(input1.getText().toString());
                double sum = input*input;
                answer1.setText(Double.toString(sum));
            }
        });

    }
}