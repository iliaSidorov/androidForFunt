package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private int circle = 0;
    Button btn;
    TextView txv;
    TextView txv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.bt);
        txv = (TextView) findViewById(R.id.tx);
        txv1 = (TextView) findViewById(R.id.tx1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;

                txv.setText(Integer.toString(counter));
                if (counter % 108 == 0) {
                    counter = 0;
                    txv1.setText(Integer.toString(++circle));
                }
            }
        });
    }





}