package com.example.education;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.util.PrintWriterPrinter;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";
    final static String EXTRA = "EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "onCreate",Toast.LENGTH_SHORT).show();

    }

    public void move (View view ){
        Intent intent = new Intent(this, activity_1.class);
        EditText editText = (EditText) findViewById(R.id.edittext);
        String editText_buf = editText.getText().toString();
        intent.putExtra(EXTRA, editText_buf);
        startActivity(intent);
    }


    //helllo
    

}
