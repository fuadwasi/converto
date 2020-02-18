package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Weight extends AppCompatActivity {

    EditText wval_in,wval_ou;
    RadioButton wred1,wred2,wred3,wred4;
    Button lin_but,lrset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        wval_in   = findViewById(R.id.wv_in);
        wval_ou   = findViewById(R.id.wv_ou);
        lin_but   = findViewById(R.id.wcal_but);
        wred1     = findViewById(R.id.wrb1);
        wred2     = findViewById(R.id.wrb2);
        wred3     = findViewById(R.id.wrb3);
        wred4     = findViewById(R.id.wrb4);
        lrset    = findViewById(R.id.wres_but);

        lin_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if(wred1.isChecked())
                    {
                        Double value = new Double(wval_in.getText().toString());
                        wval_ou.setText(Double.toString(calculate.kg_to(value)));
                    }
                    else if(wred2.isChecked())
                    {
                        Double value = new Double(wval_in.getText().toString());
                        wval_ou.setText(Double.toString(calculate.to_kg(value)));
                    }
                    else if(wred3.isChecked())
                    {
                        Double value = new Double(wval_in.getText().toString());
                        wval_ou.setText(Double.toString(calculate.po_kg(value)));
                    }
                    else if(wred4.isChecked())
                    {
                        Double value = new Double(wval_in.getText().toString());
                        wval_ou.setText(Double.toString(calculate.kg_po(value)));
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
        lrset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wval_in.setText("");
                wval_ou.setText("");
            }
        });
    }
}
