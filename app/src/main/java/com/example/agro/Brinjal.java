package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Brinjal extends AppCompatActivity {
    private TextView c4;
    private TextView p3;
    private TextView cu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brinjal);
        c4=(TextView) findViewById(R.id.cul3);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Brinjal.this,Cul4.class);
                startActivity(intent);
            }
        });

        p3=(TextView) findViewById(R.id.pest3);
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Brinjal.this,Pest4.class);
                startActivity(intent);
            }
        });


        cu3=(TextView) findViewById(R.id.calculator3);
        cu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Brinjal.this,Calculator2.class);
                startActivity(intent);
            }
        });


    }
}