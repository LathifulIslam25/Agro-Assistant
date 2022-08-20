package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Corn extends AppCompatActivity {
    private TextView c3;
    private TextView p2;
    private TextView cu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corn);

        c3=(TextView) findViewById(R.id.cul2);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Corn.this,Cul3.class);
                startActivity(intent);

            }
        });

        p2=(TextView) findViewById(R.id.pest2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Corn.this,Pest3.class);
                startActivity(intent);
            }
        });


        cu2=(TextView) findViewById(R.id.calculator2);
        cu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Corn.this,Calculator2.class);
                startActivity(intent);
            }
        });


    }
}