package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Chilli extends AppCompatActivity {

    private  TextView c7;
    private TextView p6;
    private TextView cu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chilli);

        c7=(TextView) findViewById(R.id.cul6);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Chilli.this,Cul7.class);
                startActivity(intent);
            }
        });


        p6=(TextView) findViewById(R.id.pest6);
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Chilli.this,Pest7.class);
                startActivity(intent);
            }
        });

        cu6=(TextView) findViewById(R.id.calculator6);
        cu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Chilli.this,Calculator2.class);
                startActivity(intent);
            }
        });


    }
}