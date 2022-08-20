package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Wheat extends AppCompatActivity {

    private TextView c2;
    private TextView p1;
    private TextView cu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheat);

        c2=(TextView) findViewById(R.id.cul1);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wheat.this,Cul2.class);
                startActivity(intent);
            }
        });

        p1=(TextView) findViewById(R.id.pest1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Wheat.this,Pest2.class);
                startActivity(intent);
            }
        });


        cu1=(TextView) findViewById(R.id.calculator1);
        cu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Wheat.this,Calculator2.class);
                startActivity(intent);
            }
        });

    }
}