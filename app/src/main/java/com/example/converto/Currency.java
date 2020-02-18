package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Currency extends AppCompatActivity {

    EditText cval_in, cval_ou;
    RadioButton cred1,cred2,cred3,cred4;
    Button cin_but,crset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        cval_in   = findViewById(R.id.cv_in);
        cval_ou   = findViewById(R.id.cv_ou);
        cin_but   = findViewById(R.id.ccal_but);
        cred1     = findViewById(R.id.crb1);
        cred2     = findViewById(R.id.crb2);
        cred3     = findViewById(R.id.crb3);
        cred4     = findViewById(R.id.crb4);
        crset    = findViewById(R.id.cres_but);

        cin_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    if(cred1.isChecked())
                    {
                        Double value = new Double(cval_in.getText().toString());
                        cval_ou.setText(Double.toString(calculate.tk_dol(value)));
                    }
                    else if(cred2.isChecked())
                    {
                        Double value = new Double(cval_in.getText().toString());
                        cval_ou.setText(Double.toString(calculate.dol_tk(value)));
                    }
                    else if(cred3.isChecked())
                    {
                        Double value = new Double(cval_in.getText().toString());
                        cval_ou.setText(Double.toString(calculate.tk_rup(value)));
                    }
                    else if(cred4.isChecked())
                    {
                        Double value = new Double(cval_in.getText().toString());
                        cval_ou.setText(Double.toString(calculate.rup_tk(value)));
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
        crset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cval_in.setText("");
                cval_ou.setText("");
            }
        });
    }
}
