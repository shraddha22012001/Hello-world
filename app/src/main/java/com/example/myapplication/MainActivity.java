package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private EditText name;
  private Button savebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.answer);
        savebtn = findViewById(R.id.save);

        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Empty Field...Please enter your name....",Toast.LENGTH_SHORT);
                }
                else{
                    String username = name.getText().toString();
                    Intent intent = new Intent(MainActivity.this,hello_name.class);
                    intent.putExtra("keyname",username);
                    startActivity(intent);
                }
            }
        });
    }
}