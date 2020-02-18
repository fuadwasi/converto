package com.example.converto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button cur,ar,dis,wei,abo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ar= findViewById(R.id.ar_but);
        cur = findViewById(R.id.cur_but);
        dis = findViewById(R.id.le_but);
        wei = findViewById(R.id.wei_but);
        abo = findViewById(R.id.abo_but);

        cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cu = new Intent(MainActivity.this,Currency.class);
                startActivity(cu);
            }
        });
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ar1 = new Intent(MainActivity.this, Area.class);
                startActivity(ar1);
            }
        });
        dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dist = new Intent(MainActivity.this, Distance.class);
                startActivity(dist);
            }
        });
        wei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wei_call = new Intent(MainActivity.this, Weight.class);
                startActivity(wei_call);
            }
        });
        abo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abo_call = new Intent(MainActivity.this, About.class);
                startActivity(abo_call);
            }
        });


    }
}
