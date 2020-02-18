package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Distance extends AppCompatActivity {

    EditText lval_in,lval_ou;
    RadioButton lred1,lred2,lred3,lred4;
    Button lin_but,lrset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        lval_in   = findViewById(R.id.lv_in);
        lval_ou   = findViewById(R.id.lv_ou);
        lin_but   = findViewById(R.id.lcal_but);
        lred1     = findViewById(R.id.lrb1);
        lred2     = findViewById(R.id.lrb2);
        lred3     = findViewById(R.id.lrb3);
        lred4     = findViewById(R.id.lrb4);
        lrset    = findViewById(R.id.lres_but);


    lin_but.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try
            {
                if(lred1.isChecked())
                {
                    Double value = new Double(lval_in.getText().toString());
                    lval_ou.setText(Double.toString(calculate.in_me(value)));
                }
                else if(lred2.isChecked())
                {
                    Double value = new Double(lval_in.getText().toString());
                    lval_ou.setText(Double.toString(calculate.me_in(value)));
                }
                else if(lred3.isChecked())
                {
                    Double value = new Double(lval_in.getText().toString());
                    lval_ou.setText(Double.toString(calculate.ya_fe(value)));
                }
                else if(lred4.isChecked())
                {
                    Double value = new Double(lval_in.getText().toString());
                    lval_ou.setText(Double.toString(calculate.fe_ya(value)));
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
            lval_in.setText("");
            lval_ou.setText("");
        }
    });

    }
}
