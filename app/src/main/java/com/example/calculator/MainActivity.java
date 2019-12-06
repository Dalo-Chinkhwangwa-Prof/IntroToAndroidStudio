package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView greetingText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingText = findViewById(R.id.greeting_textview);

        greetingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greetingText.setText("Why did you click me?");
                Toast.makeText(MainActivity.this, "I have been clicked.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}