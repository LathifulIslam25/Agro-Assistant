package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Potato extends AppCompatActivity {

    private TextView c5;
    private TextView p4;
    private TextView cu4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato);

        c5=(TextView) findViewById(R.id.cul4);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Potato.this,Cul5.class);
                startActivity(intent);
            }
        });

        p4=(TextView) findViewById(R.id.pest4);
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Potato.this,Pest5.class);
                startActivity(intent);
            }
        });


        cu4=(TextView) findViewById(R.id.calculator4);
        cu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Potato.this,Calculator2.class);
                startActivity(intent);
            }
        });


    }
}