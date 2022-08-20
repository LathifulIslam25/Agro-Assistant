package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mango extends AppCompatActivity {

    private TextView c9;
    private TextView p8;
    private TextView cu8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mango);

        c9=(TextView) findViewById(R.id.cul8);
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Mango.this,Cul9.class);
                startActivity(intent);
            }
        });

        p8=(TextView) findViewById(R.id.pest8);
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mango.this,Pest9.class);
                startActivity(intent);
            }
        });

        cu8=(TextView) findViewById(R.id.calculator8);
        cu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mango.this,Calculator2.class);
                startActivity(intent);
            }
        });


    }
}