package com.example.education;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_1 extends AppCompatActivity {

    public final static  String GO = "GO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        Bundle argument = getIntent().getExtras();
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


    public void onClick_1(View view){
        EditText ET_name = (EditText) findViewById(R.id.ET_name);
        EditText ET_age = (EditText) findViewById(R.id.ET_age);
        String name = ET_name.getText().toString();
        String age = ET_age.getText().toString();
        Product product = new Product(name,age);
        Intent intent = new Intent(this, Activity_2.class);
        intent.putExtra(GO, product);
        startActivity(intent);
    }



}
