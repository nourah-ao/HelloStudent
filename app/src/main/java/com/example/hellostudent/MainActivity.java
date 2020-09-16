package com.example.hellostudent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b = (Button) findViewById(R.id.Hbutton);
        e = (EditText) findViewById(R.id.PersonName);
        txt = (TextView) findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String s= e.getText().toString();
               txt.setText("Hello, "+ s);

            }

        });
    }
}