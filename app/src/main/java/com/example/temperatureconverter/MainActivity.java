package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText cel,fr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        cel=(EditText)findViewById(R.id.cels);
        fr=(EditText)findViewById(R.id.faran);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              float d1=Float.parseFloat(cel.getText().toString());
              float f1=((9*d1)/5)+32;
              fr.setText(Float.toString(f1));
            }
        });
    }
}
