package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Onion extends AppCompatActivity {

    private TextView c6;
    private TextView p5;
    private TextView cu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onion);

        c6=(TextView) findViewById(R.id.cul5);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Onion.this,Cul6.class);
                startActivity(intent);
            }
        });

        p5=(TextView) findViewById(R.id.pest5);
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Onion.this,Pest6.class);
                startActivity(intent);
            }
        });


        cu5=(TextView) findViewById(R.id.calculator5);
        cu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Onion.this,Calculator2.class);
                startActivity(intent);
            }
        });


    }
}