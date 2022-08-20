package com.example.agro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Been extends AppCompatActivity {

    private TextView c8;
    private TextView p7;
    private TextView cu7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_been);

        c8=(TextView) findViewById(R.id.cul7);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Been.this,Cul8.class);
                startActivity(intent);
            }
        });

        p7=(TextView) findViewById(R.id.pest7);
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Been.this,Pest8.class);
                startActivity(intent);
            }
        });

        cu7=(TextView) findViewById(R.id.calculator7);
        cu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Been.this,Calculator2.class);
                startActivity(intent);
            }
        });


    }
}