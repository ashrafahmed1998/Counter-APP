package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int Counter = 0;
    Button bton;
    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bton = (Button) findViewById(R.id.button);
        txtv = (TextView) findViewById(R.id.tx);

        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter++;
                txtv.setText(Integer.toString(Counter));

            }
        });


    }

}