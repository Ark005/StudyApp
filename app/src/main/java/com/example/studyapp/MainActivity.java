package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textview);
        Spinner  spinner = findViewById(R.id.spinner);
        Button button = findViewById(R.id.button);
        String result = String.valueOf(spinner.getSelectedItem());
        textView.setText(result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = String.valueOf(spinner.getSelectedItem());
                textView.setText(result);
            }
        });
    }
}