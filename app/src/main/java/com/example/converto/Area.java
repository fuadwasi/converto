package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import org.w3c.dom.DOMImplementation;

public class Area extends AppCompatActivity {
    EditText val_in, val_ou;
    RadioButton ared1,ared2,ared3,ared4;
    Button ain_but,arset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        val_in  = findViewById(R.id.av_in);
        val_ou  = findViewById(R.id.av_ou);
        ain_but  = findViewById(R.id.acal_but);
        ared1   = findViewById(R.id.arb1);
        ared2   = findViewById(R.id.arb2);
        ared3   = findViewById(R.id.arb3);
        ared4   = findViewById(R.id.arb4);
        arset   = findViewById(R.id.ares_but);

        ain_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if(ared1.isChecked())
                    {
                        Double value = new Double(val_in.getText().toString());
                        val_ou.setText(Double.toString(calculate.ac_sm(value)));
                    }
                    else if(ared2.isChecked())
                    {
                        Double value = new Double(val_in.getText().toString());
                        val_ou.setText(Double.toString(calculate.sm_ac(value)));
                    }
                    else if(ared3.isChecked())
                    {
                        Double value = new Double(val_in.getText().toString());
                        val_ou.setText(Double.toString(calculate.he_sm(value)));
                    }
                    else if(ared4.isChecked())
                    {
                        Double value = new Double(val_in.getText().toString());
                        val_ou.setText(Double.toString(calculate.sm_he(value)));
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Please select a type of convertion.", Toast.LENGTH_LONG).show();
                    }

                }
                catch (Exception ex)
                {
                    Toast.makeText(getApplicationContext(), "Enter a valid value " , Toast.LENGTH_LONG).show();
                }
            }
        });
        arset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val_in.setText("");
                val_ou.setText("");
            }
        });
    }
}
