package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hello_name extends AppCompatActivity {
       private TextView hellomsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_name);

        hellomsg = findViewById(R.id.output);
        String username = "Hello " + getIntent().getStringExtra("keyname");
        hellomsg.setText(username);
    }
}