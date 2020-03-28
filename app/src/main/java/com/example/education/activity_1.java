package com.example.education;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class activity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        Bundle argument = getIntent().getExtras();


        //Intent intent = getIntent();
        TextView textView = findViewById(R.id.textView);
        try {
            String message = argument.get(MainActivity.EXTRA).toString();

            textView.setText(message);
        }
        catch (Exception ex)
        {
            textView.setText("do not work");
        }

    }



}
